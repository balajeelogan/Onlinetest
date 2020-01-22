package OnlineExam;

import javax.swing.*;

import java.awt.event.*;

public class Selectcourse extends main {

    public static void main(String args[]) {
        try {
            JFrame jf = new JFrame("COURSES");
            JLabel jl = new JLabel("WELCOME TO THEEROS ONLINE EXAM");
            jl.setBounds(650, 10, 500, 20);
            jf.add(jl);
            JButton jb1 = new JButton("C TEST");
            jb1.setBounds(650, 100, 200, 50);
            jf.add(jb1);
            jb1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Ccourse.main(null);
                    jf.setVisible(false);
                }
            });
            JButton jb2 = new JButton("C++ TEST");
            jb2.setBounds(650, 200, 200, 50);
            jf.add(jb2);
            jb2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Cppcourse.main(null);
                    jf.setVisible(false);
                }
            });
            JButton jb3 = new JButton("JAVA TEST");
            jb3.setBounds(650, 300, 200, 50);
            jf.add(jb3);
            jb3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Javacourse.main(null);
                    jf.setVisible(false);
                }
            });
            JButton jb4 = new JButton("EXIT");
            jb4.setBounds(650, 400, 200, 50);
            jf.add(jb4);
            jb4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
            jf.setLayout(null);
            jf.setSize(1366, 768);
            jf.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
