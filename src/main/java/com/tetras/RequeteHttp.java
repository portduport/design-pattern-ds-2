package com.tetras;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class RequeteHttp implements ComposantRequeteHttp {

    private List<ComposantRequeteHttp> children;

    public RequeteHttp() {
        this.children = new ArrayList<ComposantRequeteHttp>();
    }

    public void add(ComposantRequeteHttp composant) {
        children.add(composant);
    }

    public void remove(ComposantRequeteHttp composant) {
        children.remove(composant);
    }

    public ComposantRequeteHttp getComposant(int id) {
        return (ComposantRequeteHttp) children.get(id);
    }

    @Override
    public String afficher() {
        String result = "";
        Iterator<ComposantRequeteHttp> iterator = children.iterator();
        while (iterator.hasNext()) {
            result = result + iterator.next().afficher() + " ";
        }
        return result;
    }
}
