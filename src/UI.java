import com.sun.net.httpserver.Headers;

import javax.swing.*;
import java.awt.*;

public class UI {
  JFrame Screen;
  ImageIcon Logo;
  Icon GithubLogo,InstagramLogo,TwitterLogo,WhatsappLogo;
    UI(){
        System.out.println("UI");
        Screen= new JFrame();
        Screen.setTitle("RBuddy");
        Screen.setSize(400,450);
        Screen.setResizable(false);

        Logo = new ImageIcon("src/Images/Logo.png");
        // Footer logo objects
        InstagramLogo = new ImageIcon("src/Images/Logo.png");
        TwitterLogo = new ImageIcon("src/Images/Logo.png");
        WhatsappLogo = new ImageIcon("src/Images/Logo.png");
        GithubLogo = new ImageIcon("Images/Logo.png");


        Screen.setIconImage(Logo.getImage());

        Screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Screen.setLayout(new BorderLayout(1,1));
        Screen.getContentPane().setBackground(new Color(27,38,44));
    }
}
