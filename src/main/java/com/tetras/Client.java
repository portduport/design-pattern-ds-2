package com.tetras;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        HashMap<String, String> header = new HashMap<String, String>();
        header.put("header", "true");
        RequeteHttp requete = new RequeteHttp();
        requete.add(new Url(null));
        requete.add(new Header(header));
        requete.add(new Body("hello"));
        IServeurWeb sw = new ServeurWebProxy(null);
        sw.repondre(requete);
        System.out.println(requete.afficher());
    }
}
