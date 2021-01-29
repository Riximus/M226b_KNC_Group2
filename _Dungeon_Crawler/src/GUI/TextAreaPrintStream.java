package GUI;

import javax.swing.*;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.PortUnreachableException;

/**
 * Author: Silas Kägi
 * Projekt: Dungeon_Crawler
 * Aufgabe:
 * Erstellungsdatum: 29.01.2021
 */
public class TextAreaPrintStream {
    private JTextPane textPane = new JTextPane();

    public JTextPane getTextPane() {
        return textPane;
    }

    public void printText(String string) {
        textPane.setText(textPane.getText() + "\n" + string);
    }
}