import javax.swing.*;
import java.awt.*;

public class GUI {

    public static void main(String[] args) {
        JFrame window = new JFrame("Hello Val");

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton button = new JButton("Button");
        button.setPreferredSize(new Dimension(150, 28));


        JLabel label = new JLabel("I am a swing label");

        panel.add(label);
        panel.add(button);

        window.getContentPane().add(label);
        window.getContentPane().add(panel);

        window.pack();
        window.setSize(300,250);
        window.setVisible(true);
    }
}
