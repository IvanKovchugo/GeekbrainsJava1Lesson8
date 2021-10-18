package ru.geekbrains.lesson8;

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class AppWindow extends JFrame {
//    public AppWindow() {
//        setTitle("My Simple Window");
//        setBounds(600, 300, 600, 100);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setResizable(false);
//
//        JTextField textField = new JTextField();
//        add(textField, BorderLayout.NORTH);
//
//        Font font = new Font("Arial", Font.PLAIN, 18);
//        textField.setFont(font);
//
//        JPanel buttonsPanel = new JPanel(new GridLayout(1, 3));
//        add(buttonsPanel, BorderLayout.CENTER);
//
//        JButton button1 = new JButton("1");
//        JButton button2 = new JButton("2");
//        JButton button3 = new JButton("3");
//
//        buttonsPanel.add(button1);
//        buttonsPanel.add(button2);
//        buttonsPanel.add(button3);
//
//        button1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                textField.setText(textField.getText() + "1");
//            }
//        });
//
//        button2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                textField.setText("2");
//            }
//        });
//
//        button3.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                textField.setText("3");
//            }
//        });
//
//        setVisible(true);
//    }
//}
