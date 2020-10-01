package com.secure.dev.utilities;


import org.json.JSONObject;
import org.json.XML;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;

public class Converter {


    public static String convertJsonToXml(String value) {
        return XML.toString(new JSONObject(value));
    }

    public static String convertXmlToJson(String value) {
        return XML.toJSONObject(value, true).toString(2);
    }

    public static String convertEpochTimestampToDate(long timestamp) {
        return new java.util.Date((long)timestamp*1000).toString();
    }

    public static String formatJson(String value) {
        return new JSONObject(value).toString(4);
    }

    public static String minifyJson(String value) {
        return new JSONObject(value).toString(0);
    }

    public static String formatXml(String value) throws TransformerException, ParserConfigurationException, IOException, SAXException {
        return transformXml(value, "yes");
    }

    public static String minifyXml(String value) throws TransformerException, ParserConfigurationException, IOException, SAXException {
        Reader inputString = new StringReader(value);
        BufferedReader reader = new BufferedReader(inputString);

        String line;
        StringBuilder sb = new StringBuilder();

        while((line=reader.readLine())!= null){
            sb.append(line.trim());
        }
        return sb.toString();
    }

    private static String transformXml(String value, String indent) throws ParserConfigurationException, SAXException, IOException, TransformerException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setValidating(false);
        DocumentBuilder db = dbf.newDocumentBuilder();

        Document xml = db.parse(new ByteArrayInputStream(value.getBytes()));

        Transformer tf = TransformerFactory.newInstance().newTransformer();
        tf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        tf.setOutputProperty(OutputKeys.INDENT, indent);
        Writer out = new StringWriter();
        tf.transform(new DOMSource(xml), new StreamResult(out));
        return out.toString();
    }
}
