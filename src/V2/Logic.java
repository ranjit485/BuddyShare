package V2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Logic extends UI{
    String runName;

    Logic(){
        sem3Download.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                runName = "One.bat";
                try {
                    Brain();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });


        sem4Download.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                runName = "Two.bat";
                try {
                    Brain();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        sem5Download.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                runName = "Sem5";
            }
        });
        sem6Download.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                runName = "Sem6";

            }
        });
        githubLogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sem3Download, "hello");
            }
        });
        buyMeTea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sem3Download, "hello");
            }
        });
    }

    void Brain() throws IOException {
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", runName);
        File dir = new File("D:\\");
        pb.directory(dir);
        Process p = pb.start();
    }
}
