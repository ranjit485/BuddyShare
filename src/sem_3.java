import javax.swing.*;
import java.awt.*;

public class sem_3 extends Header{

    JPanel sem3,p1,p2,p3,p4,p5;
    JButton sb1,sb2,sb3,sb4,sb5;

    sem_3(){
        System.out.println("Sem-3");
        sem3 = new JPanel(new GridLayout(5,2));
//        sem3.setBackground(Color.DARK_GRAY);
        sem3.setBackground(new Color(27,38,44));
        sem3.setSize(395,390);

        p1 = new JPanel(new GridLayout(1,2));
        p2 = new JPanel(new GridLayout(1,2));
        p3 = new JPanel(new GridLayout(1,2));
        p4 = new JPanel(new GridLayout(1,2));
        p5 = new JPanel(new GridLayout(1,2));

        Color pBg = new Color(0,51,51);
        p1.setBackground(pBg);
        p2.setBackground(pBg);
        p3.setBackground(pBg);
        p4.setBackground(pBg);
        p5.setBackground(pBg);

        p1.setBounds(10,10,380,40);
        p2.setBounds(10,70,380,40);
        p3.setBounds(10,135,380,40);
        p4.setBounds(10,200,380,40);
        p5.setBounds(10,265,380,40);

        JButton sName1 = new JButton("Software Testing");
        JButton sName2 = new JButton("Advance java");
        JButton sName3 = new JButton("Operating system");
        JButton sName4 = new JButton("Javascript");
        JButton sName5 = new JButton("ESt 22415");


        Icon Dicon = new ImageIcon("src/Images/D2.png");

        sb1 = new JButton(new ImageIcon(((new ImageIcon("src/Images/D2.png")).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
        sb2 = new JButton("Download");
        sb3= new JButton("Download");
        sb4= new JButton("Download");
        sb5= new JButton("Download");


        sb1.setBounds(285,4,90,30);
        sb2.setBounds(285,4,90,30);
        sb3.setBounds(285,4,90,30);
        sb4.setBounds(285,4,90,30);
        sb5.setBounds(285,4,90,30);

        p1.add(sName1);
        p1.add(sb1);

        p2.add(sName2);
        p2.add(sb2);

        p3.add(sName3);
        p3.add(sb3);

        p4.add(sName4);
        p4.add(sb4);

        p5.add(sName5);
        p5.add(sb5);


        sem3.add(p1,0);
        sem3.add(p2,1);
        sem3.add(p3,2);
        sem3.add(p4,3);
        sem3.add(p5,4);


        body.add(sem3,BorderLayout.CENTER);
    }
}
