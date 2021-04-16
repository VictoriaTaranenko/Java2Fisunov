package com.geekbrains.lesson2;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class AppForm extends JFrame {
    public AppForm() throws HeadlessException {
        setBounds(200,200,500,500);
        JButton jButton = new JButton("1");
        jButton.addActionListener((e) -> {
            ReportMaker reportMaker = new ReportMaker();
            try {
                reportMaker.createReport("1.txt","23456789");
            } catch (IOException ioException) {
                JOptionPane.showMessageDialog(null, "ERROR!!!!!!");
            }
        });
        setTitle("Application");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(jButton);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AppForm();
    }
}
