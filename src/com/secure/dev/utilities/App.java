package com.secure.dev.utilities;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel mainPanel;
    private JList list1;
    private JTextArea textArea;
    private JButton decodeUrlButton;
    private JButton encodeUrlButton;

    public App() {

        decodeUrlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(EncoderDecoder.decodeUrlValue(textArea.getText()));
            }
        });
        encodeUrlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(EncoderDecoder.encodeUrlValue(textArea.getText()));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
