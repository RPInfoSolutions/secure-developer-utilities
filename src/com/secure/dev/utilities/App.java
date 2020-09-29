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
    private JPanel jsonToXmlConverterPanel;
    private JButton convertToXML;
    private JTextArea jsonToXmlTextArea;
    private JButton convertToJSONButton;
    private JPanel xmlToJsonConverter;
    private JTextArea xmlToJsonTextArea;
    private JTextArea epochTimestampToDateTextArea;
    private JButton epochTimestampToDateButton;
    private JPanel epochTimestampToDate;

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
                        case "JSON To XML Converter": {
                            layout.show(switchPanel, "Card3");
                            break;
                        }
                        case "XML To JSON Converter": {
                            layout.show(switchPanel, "Card4");
                            break;
                        }
                        case "Epoch Timestamp To Date": {
                            layout.show(switchPanel, "Card5");
                            break;
                        }
                        default: {
                            /*urlEncoderDecoder.setVisible(false);*/
                        }
                    }

                }
            }
        });
        encodeToBase64Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                base64Area.setText(EncoderDecoder.encodeToBase64(base64Area.getText()));
            }
        });
        decodeFromBase64Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                base64Area.setText(EncoderDecoder.decodeFromBase64(base64Area.getText()));
            }
        });
        convertToXML.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jsonToXmlTextArea.setText(Converter.convertJsonToXml(jsonToXmlTextArea.getText()));
            }
        });
        convertToJSONButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xmlToJsonTextArea.setText(Converter.convertXmlToJson(xmlToJsonTextArea.getText()));
            }
        });
        epochTimestampToDateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                epochTimestampToDateTextArea.setText(Converter.convertEpochTimestampToDate(Long.parseLong(epochTimestampToDateTextArea.getText())));
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
