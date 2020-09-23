package com.secure.dev.utilities;

import com.secure.dev.utilities.url.EncoderDecoder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JTextArea pasteURLTextArea;
    private JButton decodeURLButton;
    private JButton encodeURLButton;
    private JPanel mainPanel;

    public App() {
        encodeURLButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pasteURLTextArea.setText(EncoderDecoder.encodeValue(pasteURLTextArea.getText()));
            }
        });
        decodeURLButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pasteURLTextArea.setText(EncoderDecoder.decodeValue(pasteURLTextArea.getText()));
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
