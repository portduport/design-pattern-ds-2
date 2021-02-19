package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClientTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void ServerTestOk() {
        HashMap<String, String> header = new HashMap<String, String>();
        header.put("header", "true");
        RequeteHttp requete = new RequeteHttp();
        requete.add(new Url("/home"));
        requete.add(new Header(header));
        requete.add(new Body("hello"));
        IServeurWeb sw = new ServeurWebProxy(null);
        System.out.println(sw.repondre(requete));

        StringWriter out = new StringWriter();
        PrintWriter writer = new PrintWriter(out);
        writer.println(200);

        //
        assertEquals(out.toString(), outContent.toString());
    }

    @Test
    public void ServerTestKO() {
        HashMap<String, String> header = new HashMap<String, String>();
        header.put("header", "true");
        RequeteHttp requete = new RequeteHttp();
        requete.add(new Url(null));
        requete.add(new Header(header));
        requete.add(new Body("hello"));
        IServeurWeb sw = new ServeurWebProxy(null);
        System.out.println(sw.repondre(requete));

        StringWriter out = new StringWriter();
        PrintWriter writer = new PrintWriter(out);
        writer.println(500);

        //
        assertEquals(out.toString(), outContent.toString());
    }

    @Test
    public void ServerTestEvil() {
        HashMap<String, String> header = new HashMap<String, String>();
        header.put("header", "true");
        RequeteHttp requete = new RequeteHttp();
        requete.add(new Url("/evilurl"));
        requete.add(new Header(header));
        requete.add(new Body("hello"));
        IServeurWeb sw = new ServeurWebProxy(null);
        System.out.println(sw.repondre(requete));

        StringWriter out = new StringWriter();
        PrintWriter writer = new PrintWriter(out);
        writer.println(403);

        //
        assertEquals(out.toString(), outContent.toString());
    }

    @Test
    public void RequetteHttpPrint() {
        HashMap<String, String> header = new HashMap<String, String>();
        header.put("header", "true");
        RequeteHttp requete = new RequeteHttp();
        requete.add(new Url("/home"));
        requete.add(new Header(header));
        requete.add(new Body("hello"));
        System.out.println(requete.afficher());

        StringWriter out = new StringWriter();
        PrintWriter writer = new PrintWriter(out);
        writer.println("/home {header: true} hello ");

        //
        assertEquals(out.toString(), outContent.toString());
    }
}