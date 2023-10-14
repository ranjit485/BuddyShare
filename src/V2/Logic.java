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
                runName = "sem5.bat";
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
                runName = "sem4.bat";
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
                runName = "sem5.bat";
                System.out.println("Downloading..");
                try {
                    Brain();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(sem5Download, "Download Failed");
                    throw new RuntimeException(ex);
                }
            }
        });
        sem6Download.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                runName = "sem6.bat";
                System.out.println("Downloading..");
                try {
                    Brain();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(sem6Download, "Download Failed");
                    throw new RuntimeException(ex);
                }

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
        File dir = new File("src/Bats");
        pb.directory(dir);
        Process p = pb.start();
        if (p.isAlive()){
            JOptionPane.showMessageDialog(p2, "Downloading...");
        }
        else {
            JOptionPane.showMessageDialog(sem3Download, "Downloaded in c Drive StudyMaterial folder");
        }
    }
}
