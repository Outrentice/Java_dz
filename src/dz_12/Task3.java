package dz_12;

import javax.swing.*;
import java.awt.*;

import static dz_5.Task3.setImage;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame jFrame = new JFrame("my app");

        jFrame.setSize(800, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocation(
                (int) screenSize.getWidth() / 2 - (jFrame.getWidth() / 2),
                (int) screenSize.getHeight() / 2 - (jFrame.getHeight() / 2)
        );

        JPanel[] panels = new JPanel[5];
        for (int i = 1; i < 6; i++)
            panels[i - 1] = setImage("src/dz_12/frame/" + i + ".PNG");

        for (int i = 0; i < 50; i++) {
            jFrame.add(panels[i % 5]);
            jFrame.setVisible(true);
            Thread.sleep(200);
//            jFrame.remove(panels[i % 5]);
            jFrame.repaint();
        }

        System.out.println("Все");
    }
}
