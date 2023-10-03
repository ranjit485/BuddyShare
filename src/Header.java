import javax.swing.*;
import java.awt.*;

public class Header extends Body{
       JPanel Header;
       Header(){
           System.out.println("Header");
           Header = new JPanel();
           Header.setBackground(Color.darkGray);
           JButton sem3Btn = new JButton("SEM-3");
           JButton sem4Btn = new JButton("SEM-4");
           JButton sem5Btn = new JButton("SEM-5");
           JButton sem6Btn = new JButton("SEM-6");

           Insets NavButtonMargin = new Insets(5, 24, 5, 24);
           sem3Btn.setMargin(NavButtonMargin);
           sem4Btn.setMargin(NavButtonMargin);
           sem5Btn.setMargin(NavButtonMargin);
           sem6Btn.setMargin(NavButtonMargin);

           Header.add(sem3Btn);
           Header.add(sem4Btn);
           Header.add(sem5Btn);
           Header.add(sem6Btn);

           Screen.add(Header,BorderLayout.NORTH);
           Screen.setVisible(true);

       }

}
