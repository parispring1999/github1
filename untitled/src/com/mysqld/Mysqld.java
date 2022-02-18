package com.mysqld;
import java.sql.*;
import com.mysql.jdbc.Connection;
public class Mysqld {
    Connection con=null;
    public Mysqld(String account,String password){
        try{Class.forName("com.mysql.jdbc.Driver");
            System.out.println("加载驱动成功");
        }catch(Exception e){
            System.out.println("失败");
        }
        String url="jdbc:mysql://localhost:3306/student?characterEncoding=utf-8&useSSl=false\";";
        try{con= (Connection) DriverManager.getConnection(url,account,password);
            System.out.println("连接成功");
        }
        catch(SQLException e){
            System.out.println("连接失败");
        }
}
}
