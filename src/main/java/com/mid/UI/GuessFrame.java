package com.mid.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
    //    Fields
    JButton button = new JButton("Enter");
    JLabel label = new JLabel("lebel");
    JTextField number = new JTextField(8);
    Random random = new Random();
    int secret = random.nextInt(10)+1;
    //    Constructors
    public  GuessFrame(){
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num  = Integer.parseInt(number.getText());
                if(num < secret){
                    System.out.println("Bigger");
                    label.setText("Bigger");
                }else if(num > secret){
                    System.out.println("Smaller");
                    label.setText("Smaller");
                }else {
                    System.out.println("You Win");
                    label.setText("You Win");
                }
//                label.setText("hello!");
            }
        });
        setLayout(new FlowLayout());

        add(number);
        add(button);
        add(label);

        setVisible(true);
    }
//    Methods





    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
//        guessFrame.setSize(600,400);
//        guessFrame.setVisible(true);
    }
}
