package com.event;

import com.mysqld.Mysqld;
import com.window.LoginStart;
import com.window.Manage;
import com.window.StudentSystem;

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

public class LoginEvent implements ActionListener {
    JButton button;
    JMenuItem item;
    static Manage manage;

    public void actionPerformed(ActionEvent e) {
        try {
            button = (JButton) e.getSource();
            if (button.getName() == "ok") {
                String account = LoginStart.accounttext.getText();
                String password = new String(LoginStart.passwordtext.getPassword());
                if (Mysqld.loginAccount(account, password)) {
                    manage = new Manage();
                }
            }
        } catch (Exception e1) {
        }
        try {
            item = (JMenuItem) e.getSource();
            if (item.getName() == "item1") {
                manage.dispose();
            }

        } catch (Exception e1) {
        }
    }
}