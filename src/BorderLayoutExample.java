import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderLayoutExample extends JFrame implements ActionListener { //extending JFrame means you dont have to add it below

//    JFrame window = new JFrame("Hello World");

//    JPanel panel = new JPanel();

//    JLabel label = new JLabel("Hello");

    JButton buttonN = new JButton("North");
    JButton buttonS = new JButton("South");
    JButton buttonE = new JButton("East");
    JButton buttonW = new JButton("West");
    JButton buttonC = new JButton("Centre");


    public BorderLayoutExample(){
        buttonN.setPreferredSize(new Dimension(300, 100));
        buttonS.setPreferredSize(new Dimension(300, 100));
        buttonE.setPreferredSize(new Dimension(300, 100));
        buttonW.setPreferredSize(new Dimension(300, 100));
        buttonC.setPreferredSize(new Dimension(300, 100));

        buttonN.addActionListener(this);
        buttonS.addActionListener(this);
        buttonE.addActionListener(this);
        buttonW.addActionListener(this);
        buttonC.addActionListener(this);

        getContentPane().setLayout(new BorderLayout());

        getContentPane().add(buttonN, BorderLayout.NORTH);
        getContentPane().add(buttonS, BorderLayout.SOUTH);
        getContentPane().add(buttonE, BorderLayout.EAST);
        getContentPane().add(buttonW, BorderLayout.WEST);
        getContentPane().add(buttonC, BorderLayout.CENTER);

        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
