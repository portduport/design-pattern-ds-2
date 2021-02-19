package com.tetras;

import java.util.HashMap;

public class Header {

    private HashMap<String, String> header = new HashMap<String, String>();

    public Header(HashMap<String, String> header) {
        this.header = header;
    }

    public HashMap<String, String> getHeader() {
        return header;
    }

    public void setHeader(HashMap<String, String> header) {
        this.header = header;
    }

    public String convertWithIteration(HashMap<String, String> map) {
        StringBuilder mapAsString = new StringBuilder("{");
        for (String key : map.keySet()) {
            mapAsString.append(key + ": " + map.get(key) + ", ");
        }
        mapAsString.delete(mapAsString.length() - 2, mapAsString.length()).append("}");
        return mapAsString.toString();
    }

    public String afficher() {
        return this.convertWithIteration(getHeader());
    }
}
