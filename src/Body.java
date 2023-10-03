import javax.swing.*;
import java.awt.*;

public class Body extends Footer{
    JPanel body;
    JPanel SubThree,SubFour,SubFive,SubSix;
    JPanel sem3,sem4,sem5,sem6;
    Body(){
        System.out.println("body");
        body = new JPanel();
        body.setBackground(new Color(27,38,44));

        sem3 = new JPanel();
        sem4 = new JPanel();
        sem5 = new JPanel();
        sem6 = new JPanel();

        SubThree =new JPanel();
        SubFour =new JPanel();
        SubFive =new JPanel();
        SubSix =new JPanel();

        sem3.add(SubThree);
        sem3.add(SubFive);
        sem3.add(SubFour);

        sem3.setSize(300,390);
        sem3.setPreferredSize(new Dimension(380,315));
        body.add(sem3);
        Screen.add(body, BorderLayout.CENTER);
        Screen.setVisible(true);

    }
}
