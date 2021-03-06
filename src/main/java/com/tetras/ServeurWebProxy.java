package com.tetras;

public class ServeurWebProxy implements IServeurWeb {
    private ServeurWeb sw;

    @Override
    public int repondre(RequeteHttp requete) {
        if (sw == null)
            sw = new ServeurWeb();
        if (requete.getComposant() == "/evilurl") {
            return 403;
        }
        return sw.repondre(requete);
    }

    public ServeurWebProxy(ServeurWeb sw) {
        super();
        this.sw = sw;
    }
}
