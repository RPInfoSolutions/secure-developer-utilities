package main.java.com.secure.dev.utilities;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JPanel xPathTester;
    private JPanel regexTester;
    private JPanel cronGenerator;
    private JPanel htmlEscape;
    private JPanel xmlEscape;
    private JPanel javaEscape;
    private JPanel javascriptEscape;
    private JPanel jsonEscape;
    private JPanel csvEscape;
    private JTextArea htmlEscapeTextArea;
    private JButton escapeHTMLButton;
    private JTextArea xmlEscapeTextArea;
    private JButton escapeXMLButton;
    private JTextArea javaEscapeTextArea;
    private JButton javaEscapeButton;
    private JTextArea javascriptTextArea;
    private JButton javascriptEscapeButton;
    private JTextArea jsonEscapeTextArea;
    private JButton JSONEscapeButton;
    private JTextArea csvEscapeTextArea;
    private JButton CSVEscapeButton;
    private JPanel messageDigester;
    private JPanel hmacGenerator;
    private JPanel md5Generator;
    private JPanel sha256Generator;
    private JPanel sha512Generator;
    private JButton unescapeHTMLButton;
    private JButton unescapeXMLButton;
    private JButton unescapeJavaButton;
    private JButton unescapeJavascriptButton;
    private JButton unescapeJSONButton;
    private JButton unescapeCSVButton;

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
                        case "XPath Tester": {
                            layout.show(switchPanel, "Card12");
                            break;
                        }
                        case "RegEx Tester": {
                            layout.show(switchPanel, "Card13");
                            break;
                        }
                        case "Cron Expression Generator": {
                            layout.show(switchPanel, "Card14");
                            break;
                        }
                        case "HTML Escape": {
                            layout.show(switchPanel, "Card15");
                            break;
                        }
                        case "XML Escape": {
                            layout.show(switchPanel, "Card16");
                            break;
                        }
                        case "Java and .Net Escape": {
                            layout.show(switchPanel, "Card17");
                            break;
                        }
                        case "JavaScript Escape": {
                            layout.show(switchPanel, "Card18");
                            break;
                        }
                        case "JSON Escape": {
                            layout.show(switchPanel, "Card19");
                            break;
                        }
                        case "CSV Escape": {
                            layout.show(switchPanel, "Card20");
                            break;
                        }
                        /*case "SQL Escape": {
                            layout.show(switchPanel, "Card21");
                            break;
                        }*/
                        case "Message Digester (MD5, SHA-256, SHA-512)": {
                            layout.show(switchPanel, "Card22");
                            break;
                        }
                        case "HMAC Generator": {
                            layout.show(switchPanel, "Card23");
                            break;
                        }
                        case "MD5 Generator": {
                            layout.show(switchPanel, "Card24");
                            break;
                        }
                        case "SHA-256 Generator": {
                            layout.show(switchPanel, "Card25");
                            break;
                        }
                        case "SHA-512 Generator": {
                            layout.show(switchPanel, "Card26");
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
        escapeHTMLButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                htmlEscapeTextArea.setText(EscaperUnescaper.escapeHTMLText(htmlEscapeTextArea.getText()));
            }
        });
        escapeXMLButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xmlEscapeTextArea.setText(EscaperUnescaper.escapeXMLText(xmlEscapeTextArea.getText()));
            }
        });

        javaEscapeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                javaEscapeTextArea.setText(EscaperUnescaper.escapeJavaText(javaEscapeTextArea.getText()));
            }
        });

        javascriptEscapeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                javascriptTextArea.setText(EscaperUnescaper.escapeJavascriptText(javascriptTextArea.getText()));
            }
        });

        JSONEscapeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jsonEscapeTextArea.setText(EscaperUnescaper.escapeJSONText(jsonEscapeTextArea.getText()));
            }
        });

        CSVEscapeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                csvEscapeTextArea.setText(EscaperUnescaper.escapeCSVText(csvEscapeTextArea.getText()));
            }
        });

        /*SQLEscapeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sqlEscapeTextArea.setText(EscaperUnescaper.escapeSQLText(sqlEscapeTextArea.getText()));
            }
        });*/
        unescapeHTMLButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                htmlEscapeTextArea.setText(EscaperUnescaper.unescapeHTMLText(htmlEscapeTextArea.getText()));
            }
        });
        unescapeXMLButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xmlEscapeTextArea.setText(EscaperUnescaper.unescapeXMLText(xmlEscapeTextArea.getText()));
            }
        });
        unescapeJavaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                javaEscapeTextArea.setText(EscaperUnescaper.unescapeJavaText(javaEscapeTextArea.getText()));
            }
        });
        unescapeJavascriptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                javascriptTextArea.setText(EscaperUnescaper.unescapeJavascriptText(javascriptTextArea.getText()));
            }
        });
        unescapeJSONButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jsonEscapeTextArea.setText(EscaperUnescaper.unescapeJSONText(jsonEscapeTextArea.getText()));
            }
        });
        unescapeCSVButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                csvEscapeTextArea.setText(EscaperUnescaper.unescapeCSVText(csvEscapeTextArea.getText()));
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
