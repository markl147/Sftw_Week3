import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonBackground implements ActionListener {

        JFrame window = new JFrame("Hello World");

        JPanel panel = new JPanel();

        JLabel label = new JLabel("Hello");
        JButton buttonL = new JButton("Make us Red");
        JButton buttonM = new JButton("Make us Blue");
        JButton buttonR = new JButton("Make us Green");


        public ButtonBackground() {


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
            new ButtonBackground();
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource().equals(buttonL)) {
                buttonL.setBackground(Color.red);
                buttonM.setBackground(Color.red);
                buttonR.setBackground(Color.red);
            } else if (e.getSource().equals(buttonM)) {
                buttonL.setBackground(Color.blue);
                buttonM.setBackground(Color.blue);
                buttonR.setBackground(Color.blue);
            } else if (e.getSource().equals(buttonR)) {
                buttonL.setBackground(Color.green);
                buttonM.setBackground(Color.green);
                buttonR.setBackground(Color.green);
            }
        }
    }

