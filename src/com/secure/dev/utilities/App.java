package com.secure.dev.utilities;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel mainPanel;
    private JList list1;
    private JTextArea urlEncoderDecoderArea;
    private JButton decodeUrlButton;
    private JButton encodeUrlButton;
    private JPanel urlEncoderDecoder;
    private JPanel base64EncoderDecoder;
    private JButton encodeToBase64Button;
    private JPanel switchPanel;
    private JButton decodeFromBase64Button;
    private JTextArea base64Area;

    public App() {

        decodeUrlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                urlEncoderDecoderArea.setText(EncoderDecoder.decodeUrlValue(urlEncoderDecoderArea.getText()));
            }
        });
        encodeUrlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                urlEncoderDecoderArea.setText(EncoderDecoder.encodeUrlValue(urlEncoderDecoderArea.getText()));
            }
        });
        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()){
                    JList source = (JList)e.getSource();
                    String selected = source.getSelectedValue().toString();
                    CardLayout layout = (CardLayout)switchPanel.getLayout();

                    switch (selected){
                        case "URL Encoder/Decoder": {
                            layout.show(switchPanel, "Card1");
                            break;
                        }
                        case "Base64 Encoder/Decoder": {
                            layout.show(switchPanel, "Card2");
                            break;
                        }
                        default: {
                            /*urlEncoderDecoder.setVisible(false);*/
                        }
                    }

                }
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
