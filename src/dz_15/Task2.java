package dz_15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task2 {
    public static void main(String[] args) {
        String[] countries = new String[] {"Australia", "China", "England", "Russia"};
        String[] description = new String[] {
                "<html>Государство в Южном полушарии, расположенное на одноимённом материке,<br>" +
                        " а также близлежащих островах Тихого и Индийского океанов.</html>",
                "<html>Китай (Китайская Народная Республика) — государство в Восточной Азии.<br>" +
                        " Занимает 4-е место в мире по территории</html>",
                "<html>Страна в составе Соединённого Королевства. Население Англии составляет<br>" +
                        " 84 % от общего числа населения Великобритании.</html>",
                "<html>Росси́я, или Росси́йская Федера́ция (сокр. РФ), — государство в Восточной<br>" +
                        " Европе и Северной Азии. Россия — крупнейшее государство в мире</html>"
        };


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame jFrame = new JFrame("my app");

        jFrame.setSize(500, 300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocation((int) screenSize.getWidth() / 2 - 250,(int) screenSize.getHeight() / 2 - 150);

        JComboBox<String> box = new JComboBox<String>(countries);

        JPanel grid = new JPanel(new GridLayout(2, 1));
        JPanel vert = new JPanel(new FlowLayout());
        JPanel vert_text = new JPanel(new FlowLayout());
        JLabel text = new JLabel(description[0], SwingConstants.CENTER);

        box.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(description[box.getSelectedIndex()]);
            }
        });

        vert.add(box);
        vert_text.add(text);
        grid.add(vert);
        grid.add(vert_text);
        jFrame.add(grid);

        jFrame.setVisible(true);
    }
}
