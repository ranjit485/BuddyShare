import javax.swing.*;
import java.awt.*;

public class Body extends Footer{
    JPanel body;

    Body(){
        System.out.println("body");
        body = new JPanel(new BorderLayout());
        body.setBackground(new Color(27,38,44));

        Screen.add(body, BorderLayout.CENTER);
        Screen.setVisible(true);

    }
}
