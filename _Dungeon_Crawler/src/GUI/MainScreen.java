package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Author: Silas Kägi
 * Projekt: Dungeon_Crawler
 * Aufgabe:
 * Erstellungsdatum: 22.01.2021
 */
public class MainScreen {
    private JFrame jFrame = new JFrame();
    private JPanel jPanelPicture;
    private JTextArea textAreaOutput;
    private JButton eButton;
    private JButton wButton;
    private JButton dButton;
    private JButton aButton;
    private JScrollBar scrollBar;
    private JPanel mainPanel;

    public MainScreen() {
        wButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("w pressed");
            }
        });
        aButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("a pressed");
            }
        });
        dButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("d prressed");
            }
        });
        eButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("e pressed");
            }
        });
    }

    public void setjPanelPicture(JPanel jPanelPicture) {
        this.jPanelPicture = jPanelPicture;
    }

    public void run() {
        jFrame.setTitle("DUNGEON CRAWLER");
        jFrame.setContentPane(mainPanel);
        mainPanel.setBackground(Color.red);
        jPanelPicture.setBackground(Color.blue);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
