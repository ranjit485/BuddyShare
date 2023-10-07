import javax.swing.*;
import java.awt.*;

public class sem_3 extends Header{

    JPanel sem3,s1,s2,s3,s4,s5;
    JButton sb1,sb2,sb3,sb4,sb5;
    sem_3(){
        System.out.println("Sem-3");
        sem3 = new JPanel(new GridLayout(3,1));
        sem3.setBackground(Color.DARK_GRAY);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        p1.setBorder(BorderFactory.createEmptyBorder(1,2,2,2));

        p2.setBackground(Color.red);
        p1.setBackground(Color.BLUE);
//        p1.setSize(385,50);
//        p2.setSize(385,100);


        sem3.add(p1,SwingConstants.CENTER);
        sem3.add(p2);
        sem3.setSize(395,390);
        body.add(sem3,BorderLayout.CENTER);
    }
}
