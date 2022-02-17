package com.window;

import com.stytle.Fronts;

import javax.swing.*;
import java.awt.*;

import static java.awt.FlowLayout.CENTER;

public class Register extends JFrame {
    final int WIDTH=480;
    final int HEIGHT=800;
    FlowLayout flowlayout;
    JPanel jpanel_1;
    JPanel jpanel_2;
    JPanel jpanel_3;
    JLabel bgimg;
    JLabel title;
    //构造器
    public Register(){
        init();
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        validate();
    }
    void init(){
        //居中对齐
        flowlayout = new FlowLayout(CENTER);
        //窗口位置和大小
        Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension screenSize=kit.getScreenSize();
        int width=screenSize.width;
        int height=screenSize.height;
        int x=(width-WIDTH)/2;
        int y=(height-HEIGHT)/2;
        this.setBounds(x,y,WIDTH,HEIGHT);
        this.setLayout(null);
        //盘子1，图片和其他盘子
        jpanel_1=new JPanel();
        jpanel_1.setBounds(0,0,width,height);
        jpanel_1.setLayout(null);
        jpanel_1.setOpaque(false);
        //背景
        ImageIcon img=new ImageIcon("src/img/2.jpeg");
        bgimg=new JLabel(img);
        bgimg.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
        //标题
        title=new JLabel("账号注册");
        Fronts fronts=new Fronts();
        title.setFont(fronts.title);
        title.setForeground(Color.orange);
        //盘子2，标题
        jpanel_2=new JPanel();
        jpanel_2.setBounds(0,30,WIDTH,70);
        jpanel_2.setOpaque(false);
        //盘子3
        jpanel_3=new JPanel();
        jpanel_3.setBounds(0,30,WIDTH,500);
        jpanel_3.setOpaque(false);
        //添加
        jpanel_2.add(title);
        jpanel_1.add(jpanel_2);
        jpanel_1.add(bgimg);
        this.add(jpanel_1);

    }
}
