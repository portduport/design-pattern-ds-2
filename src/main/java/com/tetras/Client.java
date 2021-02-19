package com.tetras;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        HashMap<String, String> header = new HashMap<String, String>();
        header.put("Trop", "bet");
        RequeteHttp requete = new RequeteHttp(new Url(null), new Header(header), new Body("hello"));
        IServeurWeb sw = new ServeurWebProxy(null);
        System.out.println(sw.repondre(requete));
        System.out.println(requete.afficher());
    }
}
