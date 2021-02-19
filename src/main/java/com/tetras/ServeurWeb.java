package com.tetras;

public class ServeurWeb implements IServeurWeb {
    @Override
    public int repondre(RequeteHttp requete) {
        if (requete.getComposant() != null) {
            return 200;
        }
        return 500;
    }

    public ServeurWeb() {
    }
}
