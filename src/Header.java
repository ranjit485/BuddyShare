import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Header extends Body{
       JPanel Header;
       Color btnBg,HeaderBg;
       Header(){
           System.out.println("Header");
           Header = new JPanel();
           Header.setBackground(new Color(62,62,66));
//           Header.setBackground(Color.darkGray);
           JButton sem3Btn = new JButton("SEM-3");
           JButton sem4Btn = new JButton("SEM-4");
           JButton sem5Btn = new JButton("SEM-5");
           JButton sem6Btn = new JButton("SEM-6");

           Insets NavButtonMargin = new Insets(4, 24, 4, 24);
           sem3Btn.setMargin(NavButtonMargin);
           sem4Btn.setMargin(NavButtonMargin);
           sem5Btn.setMargin(NavButtonMargin);
           sem6Btn.setMargin(NavButtonMargin);

//           btnBg= Color.DARK_GRAY;
           btnBg= new Color(0,122,204);

           sem3Btn.setBackground(btnBg);
           sem4Btn.setBackground(btnBg);
           sem5Btn.setBackground(btnBg);
           sem6Btn.setBackground(btnBg);

           sem3Btn.setForeground(Color.white);
           sem4Btn.setForeground(Color.white);
           sem5Btn.setForeground(Color.white);
           sem6Btn.setForeground(Color.white);

           sem3Btn.setFocusPainted(false);
           sem4Btn.setFocusPainted(false);
           sem5Btn.setFocusPainted(false);
           sem6Btn.setFocusPainted(false);
           sem3Btn.setBorderPainted(false);
           sem4Btn.setBorderPainted(false);
           sem5Btn.setBorderPainted(false);
           sem6Btn.setBorderPainted(false);



           Font font = new Font("SANS-SERIF",Font.BOLD,12);
           sem3Btn.setFont(font);
           sem4Btn.setFont(font);
           sem5Btn.setFont(font);
           sem6Btn.setFont(font);



           Header.add(sem3Btn);
           Header.add(sem4Btn);
           Header.add(sem5Btn);
           Header.add(sem6Btn);

           Screen.add(Header,BorderLayout.PAGE_START);
           Screen.setVisible(true);

       }

}
