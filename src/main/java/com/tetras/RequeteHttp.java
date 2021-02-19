package com.tetras;

public class RequeteHttp {
    private Url path;
    private Header header;
    private Body content;

    public RequeteHttp(Url path, Header header, Body content) {
        this.path = path;
        this.header = header;
        this.content = content;
    }

    public Url getPath() {
        return path;
    }

    public void setPath(Url path) {
        this.path = path;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Body getContent() {
        return content;
    }

    public void setContent(Body content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "RequeteHttp{" + "path=" + path + ", header=" + header + ", content=" + content + '}';
    }

    public String afficher() {
        return "RequeteHttp{" + "path=" + path.afficher() + ", header=" + header.afficher() + ", content="
                + content.afficher() + '}';
    }
}
