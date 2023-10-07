import javax.swing.*;
import java.awt.*;

public class sem_3 extends Header{

    JPanel sem3,p1,p2,p3,p4,p5;
    JButton sb1,sb2,sb3,sb4,sb5;
    sem_3(){
        System.out.println("Sem-3");
        sem3 = new JPanel(new GridLayout(5,1));
        sem3.setBackground(Color.DARK_GRAY);
        sem3.setSize(395,390);

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();

        p1.setBackground(Color.red);
        p2.setBackground(Color.BLUE);
        p3.setBackground(Color.WHITE);
        p4.setBackground(Color.GREEN);
        p5.setBackground(Color.MAGENTA);

        p1.setBounds(10,10,380,50);
        p2.setBounds(10,70,380,50);
        p3.setBounds(10,135,380,50);
        p4.setBounds(10,200,380,50);
        p5.setBounds(10,265,380,50);


        sem3.add(p1,0);
        sem3.add(p2,1);
        sem3.add(p3,2);
        sem3.add(p4,3);
        sem3.add(p5,4);



        body.add(sem3,BorderLayout.CENTER);
    }
}
