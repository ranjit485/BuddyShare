package V2;

import testing.demo1;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        Runnable r = Logic::new;
        SwingUtilities.invokeLater(r);

    }
}
