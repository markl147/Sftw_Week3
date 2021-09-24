import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {
    JButton b1 = new JButton("Button 1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("Button 3");
    JButton b4 = new JButton("Long named Button 4");
    JButton b5 = new JButton("Button 5");

    public GridLayoutExample(){
        getContentPane().setLayout(new GridLayout(2, 3));

        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        getContentPane().add(b4);
        getContentPane().add(b5);
        setSize(500, 75);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutExample();
    }
}
