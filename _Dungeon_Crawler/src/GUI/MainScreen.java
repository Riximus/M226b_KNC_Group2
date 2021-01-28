package GUI;

import Classes.Fighter;
import Map.Movement;

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
    private JPanel statsPanel;
    private JLabel hpLabel;
    private JLabel attackDamageLabel;

    private Movement movement = new Movement();
    private Fighter fighter = new Fighter();
    private ImagePanel imagePanel = new ImagePanel();

    public MainScreen() {
        wButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("w pressed");
                jPanelPicture.removeAll();
                jPanelPicture.add(imagePanel.createImageLabel(movement.move('w', fighter)));
                jPanelPicture.validate();
            }
        });
        aButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("a pressed");
                jPanelPicture.removeAll();
                jPanelPicture.add(imagePanel.createImageLabel(movement.move('a', fighter)));
                jPanelPicture.validate();
            }
        });
        dButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("d pressed");
                jPanelPicture.removeAll();
                jPanelPicture.add(imagePanel.createImageLabel(movement.move('d', fighter)));
                jPanelPicture.validate();
            }
        });
        eButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("e pressed");
            }
        });
    }

    public void run() {
        jFrame.setTitle("DUNGEON CRAWLER");
        jFrame.setContentPane(mainPanel);
        mainPanel.setBackground(Color.black);
        jPanelPicture.setBackground(Color.black);
        statsPanel.setBackground(Color.black);
        hpLabel.setText("HP = " + fighter.getHealth());
        attackDamageLabel.setText("Attack Damage = " + fighter.getAttackDamage());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }

    private void createUIComponents() {
        ImagePanel imagePanel = new ImagePanel();
        jPanelPicture = imagePanel.createImageLabel("6_0_1.png");
        // TODO: place custom component creation code here
    }
}
