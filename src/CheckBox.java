import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBox implements ActionListener {
//    this.setLocationRelativeTo(null);

    JFrame window = new JFrame("Hello World");

    JPanel panel = new JPanel();



//    JLabel label = new JLabel("Hello");

    JCheckBox checkBox1 = new JCheckBox("Class is covid compliant");
    JCheckBox checkBox2 = new JCheckBox("Class is not covid compliant");
    JCheckBox checkBox3 = new JCheckBox("What's Covid?");


    public CheckBox() {


        checkBox1.addActionListener(this);
        checkBox2.addActionListener(this);
        checkBox3.addActionListener(this);

        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(checkBox3);

//        panel.add(label);

        window.getContentPane().add(panel);
        window.pack();
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(checkBox1)){
            checkBox1.setSelected(true);
            checkBox2.setSelected(false);
            checkBox3.setSelected(false);
        } else if(e.getSource().equals(checkBox2)) {
            checkBox1.setSelected(false);
            checkBox2.setSelected(true);
            checkBox3.setSelected(false);
        } else if(e.getSource().equals(checkBox3)) {
            checkBox1.setSelected(false);
            checkBox2.setSelected(false);
            checkBox3.setSelected(true);
        }
    }

    public static void main(String[] args) {
        new CheckBox();
    }
}
