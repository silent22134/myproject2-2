package com.mid.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin {
    public static void main(String[] args) {
//        swing,SWT,JavaFX
        JFrame frame = new JFrame();
        frame.setSize(600,400);
        frame.setLocation(300,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        add Component
        JButton button = new JButton("OK");
//        匿名類別,Anonymous class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("hahaha");
            }
        });
//        MyActionListener listener = new MyActionListener();
//        button.addActionListener(listener);
        frame.setLayout(new FlowLayout());
        frame.add(button);


        frame.setVisible(true);
        System.out.println("END?");

    }

}
