package com.window;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.event.AccountEvent;
import com.event.LoginEvent;
import com.event.RegEvent;
import com.stytle.Fronts;
public class LoginStart extends JFrame {
    JLabel bgimg;
    JLabel register;
    JLabel account;
    JLabel password;
    JLabel title;
    public static JTextField accounttext;
    public static JPasswordField passwordtext;
    JButton ok;
    final int WIDTH = 470;
    final int HEIGHT = 290;
    javax.swing.JPanel jpanel_1;//图片
    javax.swing.JPanel jpanel_2;//标题
    javax.swing.JPanel jpanel_3;//账密编辑框密码框
    RegEvent regevent;//监听
    ActionListener lintener_1;

    public LoginStart() {
        init();
        setVisible(true);//可显示
        setResizable(false);//不可变大小
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        validate();
    }

    void init() {
        //盘子
        jpanel_1 = new javax.swing.JPanel();
        jpanel_1.setBounds(0, 0, WIDTH, HEIGHT);
        jpanel_1.setLayout(null);
        jpanel_2 = new javax.swing.JPanel();
        jpanel_2.setBounds(0, 50, WIDTH, 50);
        jpanel_2.setLayout(new FlowLayout(FlowLayout.CENTER));
        jpanel_2.setOpaque(false);
        jpanel_3 = new javax.swing.JPanel();
        jpanel_3.setBounds(100, 105, 260, 130);
        jpanel_3.setLayout(new FlowLayout(FlowLayout.CENTER));
        jpanel_3.setOpaque(false);
        //窗口大小位置
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        int x = (width - WIDTH) / 2;
        int y = (height - HEIGHT) / 2;
        this.setBounds(x, y, WIDTH, HEIGHT);
        //背景
        ImageIcon img = new ImageIcon("src/img/1.jpeg");
        bgimg = new JLabel(img);
        bgimg.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        //标题
        Fronts fronts=new Fronts();
        title = new JLabel("学生管理系统");
        title.setFont(fronts.title);
        title.setForeground(Color.CYAN);
        //账号标签
        account=new JLabel("账号");
        account.setFont(fronts.account);
        account.setForeground(new Color(255,228,181));
        //账号文本框
        accounttext=new JTextField(20);
        accounttext.setFont(fronts.accounttext);
        accounttext.setForeground(new Color(224,57,151));
        //密码标签
        password=new JLabel("密码");
        password.setFont(fronts.account);
        password.setForeground(new Color(255,228,181));
        //密码文本框
        passwordtext= new JPasswordField(20);
        passwordtext.setFont(fronts.accounttext);
        passwordtext.setForeground(new Color(224,57,151));
        //登录
        ok=new JButton("登录系统");
        ok.setPreferredSize(new Dimension(254,35));
        ok.setFont(fronts.ok);
        ok.setForeground(new Color(8,189,252));
        ok.setForeground(new Color(255,215,0));
        ok.setName("ok");
        //注册
        register=new JLabel("注册账号");
        register.setBounds(10,210,100,40);
        register.setFont(fronts.register);
        register.setForeground(new Color(166,166,166));
        //添加操作
        jpanel_1.add(register);
        jpanel_3.add(account);
        jpanel_3.add(accounttext);
        jpanel_3.add(password);
        jpanel_3.add(passwordtext);
        jpanel_3.add(ok);
        jpanel_2.add(title);
        jpanel_1.add(jpanel_2);
        jpanel_1.add(jpanel_3);
        jpanel_1.add(bgimg);
        this.add(jpanel_1);
        //监听事件
        allEvent();
    }
    //监听
    void allEvent(){
        regevent= new RegEvent();
        lintener_1=new LoginEvent();
        register.addMouseListener(regevent);
        ok.addActionListener(lintener_1);
    }
}