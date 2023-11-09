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

    Logic() {
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
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openUrl("https://github.com/ranjit485/BuddyShare");
            }
        });
        copyright.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openUrl("https://github.com/ranjit485/StudyMaterials");
            }
        });
        websiteLogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openUrl("https://demon-brother.blogspot.com/");
            }
        });
        twitterLogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openUrl("https://twitter.com/_ranjit_patil");
            }
        });
        buyMeTea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openUrl("https://wa.me/917499491002?text=Final%20Year%20Project%20buy");
            }
        });

    }

    void Brain() throws IOException {
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", runName);
        File dir = new File("src/Bats");
        pb.directory(dir);
        Process p = pb.start();
        System.out.println(p.info());
        System.out.println(p.isAlive());
            if (p.isAlive()) {
                JOptionPane.showMessageDialog(p2, "Downloading...");
            } else {
                JOptionPane.showMessageDialog(sem3Download, "Downloaded in c Drive StudyMaterial folder");
            }
    }
    void openUrl(String url){
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
