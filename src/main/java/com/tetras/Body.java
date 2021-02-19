package com.tetras;

public class Body {

    private String content;

    public Body(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String afficher() {
        return this.getContent();
    }
}
