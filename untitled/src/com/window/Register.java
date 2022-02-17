package com.window;

import javax.swing.*;
import java.awt.*;

import static java.awt.FlowLayout.CENTER;

public class Register extends JFrame {
    final int WIDTH=500;
    final int HEIGHT=200;
    FlowLayout flowlayout;
    JPanel jpanel_1;
    JLabel bgimg;

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
        //盘子大小
        jpanel_1=new JPanel();
        jpanel_1.setBounds(0,0,width,height);
        jpanel_1.setLayout(flowlayout);
        //背景
        ImageIcon img=new ImageIcon("src/img/2.jpeg");
        bgimg=new JLabel(img);
        bgimg.setBounds(0,0,img.getIconWidth(),img.getIconHeight());

    }
}
