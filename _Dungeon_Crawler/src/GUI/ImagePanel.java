package GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Author: Silas Kägi
 * Projekt: Dungeon_Crawler
 * Aufgabe:
 * Erstellungsdatum: 25.01.2021
 */
public class ImagePanel {

    public JPanel createImageLabel(String imagename) {
        try {
            BufferedImage myPicture = ImageIO.read(new File("C:\\Users\\silas\\OneDrive\\Dokumente\\Lehre\\Berufsschule\\Module\\M226b\\KNC\\git repositori\\M226b_KNC_Group2\\Map\\pictures\\" + imagename));
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
