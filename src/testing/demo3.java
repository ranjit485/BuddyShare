package testing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class demo3 {
    JFrame frame = new JFrame("CardLayout demo");
    JPanel panelCont = new JPanel();

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();

    JButton buttonOne = new JButton("one");
    JButton buttonTwo = new JButton("two");
    JButton buttonThree = new JButton("three");
    JButton buttoneFour = new JButton("four");

    CardLayout cl = new CardLayout();

    public demo3() {
        panelCont.setLayout(cl);

        panel1.add(buttonOne).setBackground(Color.BLUE);
        panel2.add(buttonTwo).setBackground(Color.cyan);
        panel3.add(buttonThree).setBackground(Color.MAGENTA);
        panel4.add(buttoneFour).setBackground(Color.red);


        panelCont.add(panel1, "1");
//        panelCont.add(panel2, "2");
        panelCont.add(panel3, "3");
        panelCont.add(panel4, "4");

        cl.show(panelCont, "1");

        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                panelCont.add(panel2, "2");
                cl.show(panelCont, "2");
            }
        });

        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "3");
            }
        });

        buttonThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "4");
            }
        });

        buttoneFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "1");
            }
        });

        frame.add(panelCont);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new demo3();
            }
        });
    }

}