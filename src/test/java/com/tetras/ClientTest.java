package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

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
    public void testClient() {
        //
        // Dessin dessin = new Dessin();
        // dessin.ajouter(new Rond());
        // dessin.ajouter(new Carre());
        // dessin.dessiner();
        //
        StringWriter out = new StringWriter();
        PrintWriter writer = new PrintWriter(out);
        writer.println("Rond dessiné");
        writer.println("Carré dessiné");
        writer.println("Dessin dessiné");
        //
        assertEquals(out.toString(), outContent.toString());
    }
}