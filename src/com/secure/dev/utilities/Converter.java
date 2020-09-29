package com.secure.dev.utilities;


import org.json.JSONObject;
import org.json.XML;

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
}
