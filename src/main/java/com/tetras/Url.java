package com.tetras;

public class Url implements ComposantRequeteHttp {
    private String path;

    public Url(String path) {
        this.path = path;
    }

    @Override
    public String afficher() {
        if (path == null) {
            return null;
        }
        return this.path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
