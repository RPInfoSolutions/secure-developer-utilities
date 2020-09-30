package com.secure.dev.utilities;

import org.xml.sax.SAXException;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import static javax.swing.JOptionPane.showMessageDialog;

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
    private JPanel jsonFormatter;
    private JTextArea jsonFormatterTextArea;
    private JButton formatJSONButton;
    private JTextArea jsonMinifiertextArea;
    private JButton minifyJSONButton;
    private JPanel jsonMinifier;
    private JPanel xmlFormatter;
    private JPanel xmlMinifier;
    private JTextArea xmlFormattertextArea;
    private JTextArea xmlMinifierTextArea;
    private JButton formatXMLButton;
    private JButton minifyXMLButton;
    private JPanel jsonValidator;
    private JTextArea jsonValidatorTextArea;
    private JButton validateJSONButton;
    private JTextArea jsonValidatorSchemaTextArea;
    private JPanel xmlXsdValidator;
    private JTextArea xmlValidatorTextArea;
    private JTextArea xmlXsdValidatorTextArea;
    private JButton validateXMLButton;

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
                        case "JSON Formatter": {
                            layout.show(switchPanel, "Card6");
                            break;
                        }
                        case "JSON Minifier": {
                            layout.show(switchPanel, "Card7");
                            break;
                        }
                        case "XML Formatter": {
                            layout.show(switchPanel, "Card8");
                            break;
                        }
                        case "XML Minifier": {
                            layout.show(switchPanel, "Card9");
                            break;
                        }
                        case "JSON Schema Validator": {
                            layout.show(switchPanel, "Card10");
                            break;
                        }
                        case "XML Validator (XSD)": {
                            layout.show(switchPanel, "Card11");
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
        formatJSONButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jsonFormatterTextArea.setText(Converter.formatJson(jsonFormatterTextArea.getText()));
            }
        });
        minifyJSONButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jsonMinifiertextArea.setText(Converter.minifyJson(jsonMinifiertextArea.getText()));
            }
        });
        formatXMLButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    xmlFormattertextArea.setText(Converter.formatXml(xmlFormattertextArea.getText()));
                } catch (Exception transformerException) {
                    transformerException.printStackTrace();
                }
            }
        });
        minifyXMLButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    xmlMinifierTextArea.setText(Converter.minifyXml(xmlMinifierTextArea.getText()));
                } catch (Exception transformerException) {
                    transformerException.printStackTrace();
                }
            }
        });
        validateJSONButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Validator.validateJSON(jsonValidatorTextArea.getText(), jsonValidatorSchemaTextArea.getText());
                    showMessageDialog(null, "Congrats, Valid JSON");
                }
                catch (Exception ex){
                    showMessageDialog(null, "Oops, INVALID JSON.. please check stacktrace \n\n " + ex.getMessage());
                }
            }
        });
        validateXMLButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Validator.validateXMLSchema(xmlValidatorTextArea.getText(), xmlXsdValidatorTextArea.getText());
                    showMessageDialog(null, "Congrats, Valid XML");
                }
                catch (Exception ex){
                    showMessageDialog(null, "Oops, INVALID XML.. please check stacktrace \n\n " + ex.getMessage());
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
