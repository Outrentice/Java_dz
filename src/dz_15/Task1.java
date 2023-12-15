package dz_15;

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

        JPanel flow_panel_1 = new JPanel(new FlowLayout());
        JPanel flow_panel_2 = new JPanel(new FlowLayout());
        JPanel grid_lay = new JPanel(new GridLayout(7, 1));

        JTextField number_text_1 = new JTextField(7);
        JTextField number_text_2 = new JTextField(7);
        JLabel number_label_1 = new JLabel("1st number");
        JLabel number_label_2 = new JLabel("2st number");

        flow_panel_1.add(number_label_1);
        flow_panel_1.add(number_text_1);
        flow_panel_2.add(number_label_2);
        flow_panel_2.add(number_text_2);

        JButton addition = new JButton("Add");
        addition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {run_operation(number_text_1, number_text_2, "+");}
        });

        JButton difference = new JButton("Difference");
        difference.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {run_operation(number_text_1, number_text_2, "-");}
        });

        JButton multiply = new JButton("Multiply");
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {run_operation(number_text_1, number_text_2, "*");}
        });

        JButton division = new JButton("Division");
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {run_operation(number_text_1, number_text_2, "/");}
        });

        grid_lay.add(flow_panel_1);
        grid_lay.add(flow_panel_2);
        grid_lay.add(addition);
        grid_lay.add(difference);
        grid_lay.add(multiply);
        grid_lay.add(division);
        jFrame.add(grid_lay);

        jFrame.setVisible(true);
    }

    public static void run_operation(JTextField x1, JTextField x2, String oper) {

        try {
            double num1 = Double.parseDouble(x1.getText());
            double num2 = Double.parseDouble(x2.getText());
            double res = 0;

            switch (oper) {
                case "+":
                    res = num1 + num2;
                    break;
                case "-":
                    res = num1 - num2;
                    break;
                case "/":
                    res = num1 / num2;
                    break;
                case "*":
                    res = num1 * num2;
                    break;

            }

            JOptionPane.showMessageDialog(
                    null, "Result = "+(res),
                    "Alert",JOptionPane.INFORMATION_MESSAGE
            );
        } catch (Exception ignored) {
            JOptionPane.showMessageDialog(
                    null, "Error in Numbers !",
                    "alert" , JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
