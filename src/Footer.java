import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Footer extends UI{
    JButton ThankMe,Instagram,Github,Twitter;
    JPanel footer;
    Footer(){
        System.out.println("footer");
        footer = new JPanel();
        footer.setBackground(new Color(62,62,66));
//        footer.setBackground(Color.darkGray);


        ThankMe = new JButton("Buy Me a Tea");
        Instagram = new JButton("Instagram");
        Twitter = new JButton("T",InstagramLogo);
        Github = new JButton("Github");

//        ThankMe.setMargin(new Insets(5,25,5,25));

//        Insets SButtonMargin = new Insets(5, 5, 5, 5);
//        Instagram.setMargin(SButtonMargin);
//        Instagram.setForeground(Color.YELLOW);

//        To remove the border
//        Border customBorder = BorderFactory.createLineBorder(Color.RED, 1);
//        Instagram.setBorder(customBorder);


        footer.add(ThankMe);
//        footer.add(Twitter);
        footer.add(Github);
        footer.add(Instagram);

        Screen.add(footer, BorderLayout.PAGE_END);
    }
}
