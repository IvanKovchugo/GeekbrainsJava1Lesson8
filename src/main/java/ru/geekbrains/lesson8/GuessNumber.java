package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessNumber extends JFrame {
    private int randomNumber;

    private JTextField textField;

    public GuessNumber() {
        randomNumber = (int)(Math.random() * 10) + 1; // [1 ; 10]

        JButton resetButton;
        resetButton = new JButton();
        resetButton.setText("Reset");
        resetButton.setSize(100, 50);
        resetButton.setLocation(0,200);
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });


        setTitle("Guess the number");
        setBounds(600, 300, 600, 140);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        textField.setText("Программа загадала число от 1 до 10");
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.CENTER);

        Font font = new Font("Arial", Font.PLAIN, 18);
        textField.setFont(font);

        JPanel buttonsPanel = new JPanel(new GridLayout(1, 10));
        add(buttonsPanel, BorderLayout.CENTER);

        for (int i = 1; i <= 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.setFont(font);
            buttonsPanel.add(button);
            int buttonIndex = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tryToAnswer(buttonIndex, button);
                }
            });
        }

        setVisible(true);
    }

    public void tryToAnswer(int answer, JButton button) {

        if(answer == randomNumber) {
            textField.setText("Вы угадали! Ответ: " + randomNumber);
            button.setBackground(Color.GREEN);
        } else if(answer > randomNumber) {
            textField.setText("Не угадали! Загадонное число меньше");
        } else {
            textField.setText("Не угадали! Загадонное число больше");
        }

    }

}
