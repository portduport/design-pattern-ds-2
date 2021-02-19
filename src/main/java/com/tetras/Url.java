package com.tetras;

public class Url {
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Url(String path) {
        this.path = path;
    }

    public String afficher() {
        if (path == null) {
            return null;
        }
        return this.getPath();
    }
}
