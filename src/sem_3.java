import javax.swing.*;
import java.awt.*;

public class sem_3 extends Header{

    JPanel sem3,p1,p2,p3,p4,p5;
    JButton sb1,sb2,sb3,sb4,sb5;

    sem_3(){
        System.out.println("Sem-3");
        sem3 = new JPanel();
//        sem3.setBackground(Color.DARK_GRAY);
        sem3.setBackground(new Color(27,38,44));
        sem3.setSize(395,390);


        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();

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

        sb1 = new JButton("Download");
        sb2 = new JButton("Download");
        sb3= new JButton("Download");
        sb4= new JButton("Download");
        sb5= new JButton("Download");




        sem3.add(p1,0);
        sem3.add(p2,1);
        sem3.add(p3,2);
        sem3.add(p4,3);
        sem3.add(p5,4);



        body.add(sem3,BorderLayout.CENTER);
    }
}
