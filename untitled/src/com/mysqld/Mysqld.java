package com.mysqld;
import java.sql.*;
import com.mysql.jdbc.Connection;
import com.window.Register;

import javax.swing.*;


public class Mysqld {
    public static Connection con = null;

    public Mysqld(String account, String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("加载驱动成功");
        } catch (Exception e) {
            System.out.println("失败");
        }
        String url = "jdbc:mysql://localhost:3306/student?characterEncoding=utf-8&useSSL=false";
        try {
            con = (Connection) DriverManager.getConnection(url, account, password);
            System.out.println("连接成功");
        } catch (SQLException e) {
            System.out.println("连接失败");
        }
    }

    //注册信息写入
    public static boolean loginAccount(String account, String password) {
        Statement sql;
        ResultSet rs;
        String url = "select account,password from user";
        try {
            sql = con.createStatement();
            rs = sql.executeQuery(url);
            while (rs.next()) {
                String acc = rs.getString(1);
                String pass = rs.getString(2);
                if (acc.equals(account) && pass.equals((password))) {
                    return true;
                }
            }
            return false;
        } catch (SQLException e) {
            return false;
        }
    }
    public static void addStudent(String name,String number){
        PreparedStatement preSql;
        String sqlStr="insert into stu(name,number) values(?,?)";
        try{
            preSql=con.prepareStatement(sqlStr);
            preSql.setString(1,name);
            preSql.setString(2,number);
            int ok=preSql.executeUpdate();
            JOptionPane.showMessageDialog(null,"添加成功","增加数据",JOptionPane.WARNING_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"已经存在","增加数据",JOptionPane.WARNING_MESSAGE);
        }
    }
}
