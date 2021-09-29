import javax.swing.*;
import java.awt.*;

public class GridBagLayoutExample extends JFrame {
    JButton b1 = new JButton("Button 1");
    JButton b2 = new JButton("Button 2");
    JButton b3 = new JButton("Button 3");
    JButton b4 = new JButton("Button 4");
    JButton b5 = new JButton("Long Named Button 5");

    public GridBagLayoutExample() {

        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        getContentPane().setLayout(gridbag);
        constraints.fill = GridBagConstraints.HORIZONTAL;


        constraints.gridx = 0;
        constraints.gridy = 0;
        gridbag.setConstraints(b1, constraints);
        getContentPane().add(b1);

        constraints.gridx = 1;
        constraints.gridy = 0;
        gridbag.setConstraints(b2, constraints);
        getContentPane().add(b2);

        constraints.gridx = 2;
        constraints.gridy = 0;
        gridbag.setConstraints(b3, constraints);
        getContentPane().add(b3);

        constraints.gridx = 3;
        constraints.gridy = 0;
        gridbag.setConstraints(b4, constraints);
        getContentPane().add(b4);

        constraints.gridx = 4;
        constraints.gridy = 0;
        gridbag.setConstraints(b5, constraints);
        getContentPane().add(b5);

        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        new GridBagLayoutExample();
    }
}
