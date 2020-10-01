package com.secure.dev.utilities;

import org.apache.commons.text.StringEscapeUtils;
import org.json.JSONObject;

public class EscaperUnescaper {

    public static String escapeHTMLText(String value){
        return StringEscapeUtils.escapeHtml4(value);
    }

    public static String escapeXMLText(String value){
        return StringEscapeUtils.escapeXml10(value);
    }

    public static String escapeJSONText(String value){
        return StringEscapeUtils.escapeJson(value);
    }

    public static String escapeJavaText(String value){
        return StringEscapeUtils.escapeJava(value);
    }

    public static String escapeCSVText(String value){
        return StringEscapeUtils.escapeCsv(value);
    }

    public static String escapeJavascriptText(String value){
        return StringEscapeUtils.escapeEcmaScript(value);
    }

    public static String unescapeHTMLText(String value){
        return StringEscapeUtils.unescapeHtml4(value);
    }

    public static String unescapeXMLText(String value){
        return StringEscapeUtils.unescapeXml(value);
    }

    public static String unescapeJSONText(String value){
        return StringEscapeUtils.unescapeJson(value);
    }

    public static String unescapeJavaText(String value){
        return StringEscapeUtils.unescapeJava(value);
    }

    public static String unescapeCSVText(String value){
        return StringEscapeUtils.unescapeCsv(value);
    }

    public static String unescapeJavascriptText(String value){
        return StringEscapeUtils.unescapeEcmaScript(value);
    }

}
