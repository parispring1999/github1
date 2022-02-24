package com.window;

import com.mysqld.Mysqld;

public class StudentSystem {
    public static void main(String[] args){
        Mysqld a=new Mysqld("root",null);
        LoginStart loginstart=new LoginStart();
    }
}