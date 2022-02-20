package com.window;
import javax.swing.*;
import java.awt.*;
public class Manage extends JFrame {
    final int WIDTH=800;
    final int HEIGHT=800;
    JMenuBar menubar;
    JMenu menu,menu1;
    JMenuItem item,item1;
    JPanel jpanel_1;
    JLabel name,number;
    JTextField nametext,numbertext;
    public Manage(){
        init();
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        validate();
    }
    void init(){
        //窗口布局大小位置
        this.setLayout(null);
        Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension screenSize=kit.getScreenSize();
        int width=screenSize.width;
        int height=screenSize.height;
        int x=(width-WIDTH)/2;
        int y=(height-HEIGHT)/2;
        this.setBounds(x,y,WIDTH,HEIGHT);
        //菜单栏
        menubar=new JMenuBar();
        menu=new JMenu("管理");
        menu1=new JMenu("账号");
        item=new JMenuItem("更改账号信息");
        item1=new JMenuItem("注销");
        menu.add(item);
        menu1.add(item1);
        menubar.add(menu);
        menubar.add(menu1);
        //基本信息处理
        jpanel_1=new javax.swing.JPanel();
        jpanel_1.setLayout(new FlowLayout(FlowLayout.CENTER));
        jpanel_1.setBorder(BorderFactory.createTitledBorder("基本信息处理"));
        jpanel_1.setBounds(0,100,WIDTH-6,150);
        //按钮
        name=new JLabel("姓名");
        nametext=new JTextField(25);
        number=new JLabel("学号");
        numbertext=new JTextField(25);
        jpanel_1.add(name);
        jpanel_1.add(nametext);
        jpanel_1.add(number);
        jpanel_1.add(numbertext);
        //添加
        this.add(jpanel_1);
        this.add(menubar);
        this.setJMenuBar(menubar);
    }
}
