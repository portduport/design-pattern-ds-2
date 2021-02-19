package com.tetras;

public class Body implements ComposantRequeteHttp {

    private String content;

    public Body(String content) {
        this.content = content;
    }

    @Override
    public String afficher() {
        return this.content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
