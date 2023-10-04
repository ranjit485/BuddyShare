import javax.swing.*;
import java.awt.*;

public class sem_3 extends Header{

    JPanel sem3,s1,s2,s3,s4,s5;
    sem_3(){
        System.out.println("Sem-3");
        sem3 = new JPanel();

        s1 = new JPanel();
        s2 = new JPanel();
        s3 = new JPanel();
        s4 = new JPanel();
        s5 = new JPanel();

        sem3.setBackground(Color.BLUE);
        sem3.setSize(300,390);
        sem3.setPreferredSize(new Dimension(380,315));
        body.add(sem3);
    }
}
