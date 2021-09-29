import javax.swing.*;
import java.awt.*;

public class BoxLayoutExample extends JFrame {
    JButton b1 = new JButton("Button 1");
    JButton b2 = new JButton("Button 2");
    JButton b3 = new JButton("Button 3");
    JButton b4 = new JButton("Button 4");
    JButton b5 = new JButton("Long Named Button 5");

    public BoxLayoutExample() {
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
//        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        b1.setAlignmentY(Component.LEFT_ALIGNMENT);
        getContentPane().add(b1);

        b2.setAlignmentY(Component.CENTER_ALIGNMENT);
        getContentPane().add(b2);

        b3.setAlignmentY(Component.RIGHT_ALIGNMENT);
        getContentPane().add(b3);

        b4.setAlignmentY(Component.CENTER_ALIGNMENT);
        getContentPane().add(b4);

        b5.setAlignmentY(Component.LEFT_ALIGNMENT);
        getContentPane().add(b5);


        setSize(600, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BoxLayoutExample();
    }
}
