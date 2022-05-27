package com.mid.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
    //    Fields
    JButton button = new JButton("hello");
    JLabel label = new JLabel("lebel");
    //    Constructors
    public  GuessFrame(){
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                System.out.println("hello");
                label.setText("hello!");
            }
        });
        setLayout(new FlowLayout());

        add(button);
        add(label);

        setVisible(true);
        System.out.println("END");
    }
//    Methods





    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
//        guessFrame.setSize(600,400);
//        guessFrame.setVisible(true);
    }
}
