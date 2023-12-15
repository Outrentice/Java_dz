package dz_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task1 {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame jFrame = new JFrame("my app");

        jFrame.setSize(500, 300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocation((int) screenSize.getWidth() / 2 - 250,(int) screenSize.getHeight() / 2 - 150);

        JPanel grid_panel = new JPanel(new GridLayout(3, 1));
        grid_panel.setPreferredSize(new Dimension(500, 300));

        JPanel flow_panel = new JPanel(new FlowLayout());

        JButton but_real = new JButton("Real Madrid");
        JButton but_milan = new JButton("AC Milan");
        JLabel result = new JLabel("Result: 0 X 0",SwingConstants.CENTER);
        JLabel last_scorer = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
        JLabel winner = new JLabel("Winner: DRAW", SwingConstants.CENTER);

        but_real.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] prom_mas = result.getText().split(" ");

                result.setText(
                        "Result: " +
                        Integer.toString(Integer.parseInt(prom_mas[1]) + 1) +
                        " X " + prom_mas[prom_mas.length - 1]
                );
                last_scorer.setText("Last Scorer: Real Madrid");
                set_winner(result.getText().split(" "), winner);
            }
        });

        but_milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] prom_mas = result.getText().split(" ");

                result.setText("Result: " + prom_mas[1] + " X " +
                        Integer.toString(Integer.parseInt(prom_mas[prom_mas.length - 1]) + 1));
                last_scorer.setText("Last Scorer: AC Milan");
                set_winner(result.getText().split(" "), winner);
            }
        });

        flow_panel.add(but_real);
        flow_panel.add(but_milan);

        grid_panel.add(flow_panel);
        grid_panel.add(result);
        grid_panel.add(last_scorer);
        grid_panel.add(winner);

        jFrame.add(grid_panel);
        jFrame.pack();
        jFrame.setVisible(true);
    }

    public static void set_winner(String[] mas_result, JLabel winner) {
        if (Integer.parseInt(mas_result[1]) > Integer.parseInt(mas_result[mas_result.length - 1]))
            winner.setText("Winner: Real Madrid");
        else if (Integer.parseInt(mas_result[1]) < Integer.parseInt(mas_result[mas_result.length - 1]))
            winner.setText("Winner: AC Milan");
        else
            winner.setText("Winner: DRAW");
    }
}
