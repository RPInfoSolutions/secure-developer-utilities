package main.java.com.secure.dev.utilities;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;
import java.io.IOException;

public class Validator {

    public static void validateJSON(String json, String schema){
        JSONObject jsonSchema = new JSONObject(schema);
        JSONObject jsonData = new JSONObject(json);

        Schema sch = SchemaLoader.load(jsonSchema);
        sch.validate(jsonData);
    }

    public static void validateXMLSchema(String xml, String xsd) throws IOException, SAXException{
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        javax.xml.validation.Schema schema = factory.newSchema(new StreamSource(new java.io.StringReader(xsd)));
        javax.xml.validation.Validator validator = schema.newValidator();
        validator.validate(new StreamSource(new java.io.StringReader(xml)));
     }
}
