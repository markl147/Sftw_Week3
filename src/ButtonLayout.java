import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonLayout implements ActionListener {

    JFrame window = new JFrame("Hello World");

    JPanel panel = new JPanel();

    JLabel label = new JLabel("Hello");
    JButton buttonL = new JButton("Left");
    JButton buttonM = new JButton("Middle");
    JButton buttonR = new JButton("Right");


    public ButtonLayout() {


        buttonL.setPreferredSize(new Dimension(300, 100));
        buttonM.setPreferredSize(new Dimension(300, 100));
        buttonR.setPreferredSize(new Dimension(300, 100));

        buttonL.addActionListener(this);
        buttonM.addActionListener(this);
        buttonR.addActionListener(this);


        panel.add(buttonL);
        panel.add(buttonM);
        panel.add(buttonR);
        panel.add(label);

        window.getContentPane().add(panel);
        window.pack();
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new ButtonLayout();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(buttonL)) {

            label.setText("Lefty");
            System.out.println("Lefty");
            panel.setBackground(Color.red);

        } else if (e.getSource().equals(buttonM)) {
            label.setText("Middle");
            System.out.println("Middle");
            panel.setBackground(Color.blue);
        } else if (e.getSource().equals(buttonR)) {
            label.setText("Right");
            System.out.println("Right");
            panel.setBackground(Color.yellow);
        }
    }
}