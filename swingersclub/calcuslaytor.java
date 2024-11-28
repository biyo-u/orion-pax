package swingersclub;

import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calcuslaytor {

    public static void mygooeyGUI() {
        //make da frame
        JFrame a = new JFrame("Calcuslaytor");
        a.setSize(400,400);
        a.setLayout(null);
        a.setVisible(true);

        //make da text
        final JTextField wtf = new JTextField();
        wtf.setBounds(40,30,200,20);

        // make da buttons
        JButton zero = new JButton("0");
        zero.setBounds(50,50,50,50);
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wtf.setText("Congrats on your suffering pookie!");
            }
        });
        zero.setVisible(true);

        // add the shit in
        a.add(zero);
        a.add(wtf);
    }

    public static void main(String[] args) {
        mygooeyGUI();
    }
}
