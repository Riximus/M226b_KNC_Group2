package GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Author: Silas Kägi
 * Projekt: Dungeon_Crawler
 * Aufgabe:
 * Erstellungsdatum: 25.01.2021
 */
public class ImagePanel {

    public JPanel createImageLabel(String imageName) {
        try {
            BufferedImage myPicture = ImageIO.read(new File("src\\pictures\\" + imageName));
            JLabel label = new JLabel(new ImageIcon(myPicture));
            JPanel panel = new JPanel();
            panel.add(label);
            return panel;
        } catch (Exception e) {
            e.printStackTrace();
            return new JPanel();
        }
    }
}
