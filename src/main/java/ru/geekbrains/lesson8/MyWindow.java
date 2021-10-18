package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class MyWindow extends JFrame {
//    public MyWindow() {
//        setTitle("My Simple Window");
//        setBounds(600, 300, 400, 400);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setLayout(new FlowLayout());
//
////        JButton button = new JButton("Log");
////        add(button);
////        button.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                System.out.println("1");
////            }
////        });
//
////        for (int i = 0; i < 10; i++) {
////            JButton button = new JButton("" + i);
////            add(button);
////            int finalI = i;
////            button.addActionListener(new ActionListener() {
////                @Override
////                public void actionPerformed(ActionEvent e) {
////                    button.setText("CLICKED!");
////                }
////            });
////        }
//
////        JButton button1 = new JButton("One");
////        JButton button2 = new JButton("Two");
////        button1.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                button2.setText("HELLO");
////            }
////        });
////        add(button1);
////        add(button2);
//
//        JButton[] buttons = new JButton[11];
//        for (int i = 0; i < buttons.length; i++) {
//            buttons[i] = new JButton("" + i);
//            add(buttons[i]);
//        }
//
//        buttons[buttons.length - 1].addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                buttons[buttons.length - 2].setText("HELLO");
//            }
//        });
//
//        setVisible(true);
//    }
//}
