package testing;

// Java program to show Example of CardLayout.
// in java. Importing different Package.
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// class extends JFrame
public class Demo2 extends JFrame {

     int currentCard = 1;

    private CardLayout cl;

    public Demo2()
    {

        setTitle("Card Layout Example");

        setSize(300, 150);

        JPanel cardPanel = new JPanel();

        cardPanel.setLayout(new CardLayout());
        CardLayout cl =new CardLayout();

        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();
        JPanel jp4 = new JPanel();

        JLabel jl1 = new JLabel("Card1");
        JLabel jl2 = new JLabel("Card2");
        JLabel jl3 = new JLabel("Card3");
        JLabel jl4 = new JLabel("Card4");

        jp1.add(jl1);
        jp2.add(jl2);
        jp3.add(jl3);
        jp4.add(jl4);

        cardPanel.add(jp1, "1");
        cardPanel.add(jp2, "2");
        cardPanel.add(jp3, "3");
        cardPanel.add(jp4, "4");

        JPanel buttonPanel = new JPanel();

        JButton firstBtn = new JButton("First");

        JButton SecondtBtn = new JButton("Next");

        JButton ThirdBtn = new JButton("Previous");

        JButton lastBtn = new JButton("Last");

        buttonPanel.add(firstBtn);
        buttonPanel.add(SecondtBtn);
        buttonPanel.add(ThirdBtn);

        firstBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0) {

                cl.show(cardPanel,"1");
            }
        });

        SecondtBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0) {

                cl.show(cardPanel,"2");
            }
        });

        ThirdBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0) {

                cl.show(cardPanel,"3");
            }
        });

        getContentPane().add(cardPanel);

        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args)
    {

        Demo2 cl = new Demo2();

        cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cl.setVisible(true);
    }
}
