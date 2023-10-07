package testing;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class demo1 {

    demo1() {
        // The main GUI. Everything else is added to this panel
        JPanel gui = new JPanel(new BorderLayout(5, 5));
        gui.setBorder(new EmptyBorder(4, 4, 4, 4));
        gui.setBackground(Color.RED);

        // The custom painted area - it is a panel that defines its preferred size.
        gui.add(new GamePanel());

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
        buttonPanel.setBackground(Color.GREEN);

        for (int ii = 1; ii<5; ii++) {
            buttonPanel.add(new JButton("B " + ii));
        }
        gui.add(buttonPanel,BorderLayout.PAGE_END);

        JFrame f = new JFrame("Game Layout");
        f.setContentPane(gui);
        f.setLocationByPlatform(true);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Runnable r = () -> new demo1();
        SwingUtilities.invokeLater(r);
    }
}

class GamePanel extends JPanel {
    GamePanel() {
        setBackground(Color.YELLOW);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 100);
    }
}