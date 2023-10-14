package dz_5;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame frame = new JFrame("test");

        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation((int) screenSize.getWidth() / 2 - frame.getWidth()/2,
                          (int) screenSize.getHeight() / 2 - frame.getHeight()/2);

        JPanel panel = setImage(args[0]);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static JPanel setImage(String path) {
        File f = new File(path);

        BufferedImage img = null;
        try {
            img = ImageIO.read(f);
        } catch (IOException ioe) {
            System.out.println("Такого файла нет");
        }

        JLabel label = new JLabel(new ImageIcon(img));
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add("Center", label);

        return panel;
    }
}
