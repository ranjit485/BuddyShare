package V2;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class UI {
    JFrame Screen;
    JButton sem3Title,sem4Title,sem5Title,sem6Title;
    JButton buyMeTea, githubLogo,twitterLogo,websiteLogo,support,greet,copyright;
    JButton sem3Download,sem4Download,sem5Download,sem6Download;
    JPanel p1,p2,p3,p4,footer,header,body,advt, coffee;
    Color mainBg = new Color(21, 32, 43);
    UI() {
        System.out.println("UI");
        Screen = new JFrame();
        Screen.setTitle("RBuddy");
        Screen.setSize(350, 480);
        Screen.setResizable(false);
        Screen.setLocationRelativeTo(null);
        Screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Screen.getContentPane().setBackground(mainBg);
        Screen.setLayout(new GridLayout(7,1,8,6));

        // Create important variables
        Color btnBg= new Color(32, 48, 60);
        Border customBorder = BorderFactory.createLineBorder(Color.WHITE, 0,true);
        Border EBorder = BorderFactory.createLineBorder(Color.WHITE, 0,true);

        header = new JPanel();
        footer = new JPanel();
        coffee = new JPanel();


        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();

        sem3Title = new JButton("SEM3");
        sem4Title = new JButton("SEM4");
        sem5Title = new JButton("SEM5");
        sem6Title = new JButton("SEM6");

        sem3Title.setFocusPainted(false);
        sem4Title.setFocusPainted(false);
        sem5Title.setFocusPainted(false);
        sem6Title.setFocusPainted(false);

        ImageIcon downloadIcon = new ImageIcon(((new ImageIcon("src/Images/logo1.png")).getImage()).getScaledInstance(37, 37, java.awt.Image.SCALE_SMOOTH));
        sem3Download = new JButton(downloadIcon);
        sem4Download = new JButton(downloadIcon);
        sem5Download = new JButton(downloadIcon);
        sem6Download = new JButton(downloadIcon);
        sem3Download.setFocusPainted(false);
        sem4Download.setFocusPainted(false);
        sem5Download.setFocusPainted(false);
        sem6Download.setFocusPainted(false);

        sem3Title.setBorder(customBorder);
        sem4Title.setBorder(customBorder);
        sem5Title.setBorder(customBorder);
        sem6Title.setBorder(customBorder);

        sem3Download.setBorder(customBorder);
        sem4Download.setBorder(customBorder);
        sem5Download.setBorder(customBorder);
        sem6Download.setBorder(customBorder);

        sem3Download.setBackground(btnBg);
        sem4Download.setBackground(btnBg);
        sem5Download.setBackground(btnBg);
        sem6Download.setBackground(btnBg);

        sem3Title.setBackground(btnBg);
        sem4Title.setBackground(btnBg);
        sem5Title.setBackground(btnBg);
        sem6Title.setBackground(btnBg);

        sem3Title.setFont(new Font("Sans",Font.PLAIN,15));
        sem4Title.setFont(new Font("Sans",Font.PLAIN,15));
        sem5Title.setFont(new Font("Sans",Font.PLAIN,15));
        sem6Title.setFont(new Font("Sans",Font.PLAIN,15));


        sem3Title.setForeground(Color.white);
        sem4Title.setForeground(Color.white);
        sem5Title.setForeground(Color.white);
        sem6Title.setForeground(Color.white);


        buyMeTea = new JButton("Buy final year project ");
        buyMeTea.setFont(new Font("Sans", Font.PLAIN,18));

        greet = new JButton("COMPUTER SCIENCE");

        githubLogo = new JButton(new ImageIcon(((new ImageIcon("src/Images/github (1).png")).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
        twitterLogo = new JButton(new ImageIcon(((new ImageIcon("src/Images/twitter (1).png")).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
        websiteLogo = new JButton(new ImageIcon(((new ImageIcon("src/Images/github (1).png")).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
        copyright = new JButton(new ImageIcon(((new ImageIcon("src/Images/copyright.png")).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));

        buyMeTea.setForeground(new Color(33, 37, 43));
        buyMeTea.setFocusPainted(false);
        buyMeTea.setBackground(Color.ORANGE);
        buyMeTea.setBorder(customBorder);


        githubLogo.setBackground(btnBg);
        websiteLogo.setBackground(btnBg);
        twitterLogo.setBackground(btnBg);
        copyright.setBackground(btnBg);

        githubLogo.setBorder(customBorder);
        websiteLogo.setBorder(customBorder);
        twitterLogo.setBorder(customBorder);
        copyright.setBorder(customBorder);

        twitterLogo.setFocusPainted(false);
        githubLogo.setFocusPainted(false);
        websiteLogo.setFocusPainted(false);
        copyright.setFocusPainted(false);



        greet.setBackground(btnBg);
        greet.setFont(new Font("Sans",Font.PLAIN,15));
        greet.setForeground(Color.white);
        greet.setFocusPainted(false);
        greet.setEnabled(false);
        greet.setBorder(customBorder);

        p1.setLayout(new GridLayout(1,2,0,0));
        p2.setLayout(new GridLayout(1,2));
        p3.setLayout(new GridLayout(1,2));
        p4.setLayout(new GridLayout(1,2));

        header.setLayout(new GridLayout(1,2));
        footer.setLayout(new GridLayout(1,3,0,3));

        p1.setBackground(new Color(33, 37, 43));
        p2.setBackground(new Color(33, 37, 43));
        p3.setBackground(new Color(33, 37, 43));
        p4.setBackground(new Color(33, 37, 43));

        p1.setBorder(new EmptyBorder(0, 5, 0, 5));
        p2.setBorder(new EmptyBorder(0, 5, 0, 5));
        p3.setBorder(new EmptyBorder(0, 5, 0, 5));
        p4.setBorder(new EmptyBorder(0, 5, 0, 5));



        header.setBackground(new Color(32, 48, 60));
        footer.setBackground(new Color(32, 48, 60));

        header.add(greet);
        p1.add(sem3Title); p1.add(sem3Download);
        p2.add(sem4Title); p2.add(sem4Download);
        p3.add(sem5Title); p3.add(sem5Download);
        p4.add(sem6Title); p4.add(sem6Download);

        footer.add(githubLogo);
        footer.add(twitterLogo);
        footer.add(websiteLogo);
        footer.add(copyright);

        Screen.add(header);
        Screen.add(p1);
        Screen.add(p2);
        Screen.add(p3);
        Screen.add(p4);
        Screen.add(footer);
        Screen.add(buyMeTea);

        Screen.setVisible(true);

    }
}