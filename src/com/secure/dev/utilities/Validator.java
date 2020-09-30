package com.secure.dev.utilities;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;

public class Validator {

    public static void validateJSON(String json, String schema){
        JSONObject jsonSchema = new JSONObject(schema);
        JSONObject jsonData = new JSONObject(json);

        Schema sch = SchemaLoader.load(jsonSchema);
        sch.validate(jsonData);
    }
}
