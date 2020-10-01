package main.java.com.secure.dev.utilities;

import org.apache.commons.lang.StringEscapeUtils;
import org.json.JSONObject;

public class Escaper {

    public static String escapeHTMLText(String value){
        return StringEscapeUtils.escapeHtml(value);
    }

    public static String escapeXMLText(String value){
        return StringEscapeUtils.escapeXml(value);
    }

    public static String escapeJSONText(String value){
        return new JSONObject(value).toString();
    }

    public static String escapeJavaText(String value){
        return StringEscapeUtils.escapeJava(value);
    }

    public static String escapeCSVText(String value){
        return StringEscapeUtils.escapeCsv(value);
    }

    public static String escapeSQLText(String value){
        return StringEscapeUtils.escapeSql(value);
    }

    public static String escapeJavascriptText(String value){
        return StringEscapeUtils.escapeJavaScript(value);
    }

}
