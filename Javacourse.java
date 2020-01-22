package OnlineExam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Javacourse extends Selectcourse {

    int Javamark = 0, timer1 = 1, timer2 = 1;

    Javacourse() {
        try {
            JFrame jf = new JFrame("JAVA TEST");
            JPanel jp = new JPanel();
            jp.setLayout(null);
            jp.setBackground(Color.lightGray);
            jp.setBounds(50, 50, 1250, 600);
            jf.add(jp);
            JLabel jl = new JLabel("WELCOME TO THEEROS ONLINE EXAM");
            jl.setBounds(600, 10, 500, 60);
            jf.add(jl);
            JLabel jl1 = new JLabel("1.What is the range of byte data type in Java?");
            jl1.setBounds(50, 30, 600, 20);
            jp.add(jl1);
            JRadioButton jrb1 = new JRadioButton("128 to 127");
            jrb1.setBounds(50, 50, 300, 20);

            jp.add(jrb1);
            JRadioButton jrb2 = new JRadioButton("32768 to 32767");
            jrb2.setBounds(50, 70, 300, 20);

            jp.add(jrb2);
            JRadioButton jrb3 = new JRadioButton("None of the mentioned");
            jrb3.setBounds(50, 90, 300, 20);

            jp.add(jrb3);
            ButtonGroup bg1 = new ButtonGroup();
            bg1.add(jrb1);
            bg1.add(jrb2);
            bg1.add(jrb3);

            JLabel jl2 = new JLabel("2.Which method can be defined only once in a program?");
            jl2.setBounds(50, 130, 600, 20);
            jp.add(jl2);
            JRadioButton jrb4 = new JRadioButton("static method");
            jrb4.setBounds(50, 150, 300, 20);

            jp.add(jrb4);
            JRadioButton jrb5 = new JRadioButton("finalize method");
            jrb5.setBounds(50, 170, 300, 20);

            jp.add(jrb5);
            JRadioButton jrb6 = new JRadioButton("main method");
            jrb6.setBounds(50, 190, 300, 20);

            jp.add(jrb6);
            ButtonGroup bg2 = new ButtonGroup();
            bg2.add(jrb4);
            bg2.add(jrb5);
            bg2.add(jrb6);

            JLabel jl3 = new JLabel("3.Which of these keywords is used to refer to member of base class from a subclass?");
            jl3.setBounds(50, 230, 600, 20);
            jp.add(jl3);
            JRadioButton jrb7 = new JRadioButton("this");
            jrb7.setBounds(50, 250, 300, 20);

            jp.add(jrb7);
            JRadioButton jrb8 = new JRadioButton("super");
            jrb8.setBounds(50, 270, 300, 20);

            jp.add(jrb8);
            JRadioButton jrb9 = new JRadioButton("upper");
            jrb9.setBounds(50, 290, 300, 20);

            jp.add(jrb9);
            ButtonGroup bg3 = new ButtonGroup();
            bg3.add(jrb7);
            bg3.add(jrb8);
            bg3.add(jrb9);

            JLabel jl4 = new JLabel("4.Which of these is necessary to specify at time of array initialization?");
            jl4.setBounds(50, 330, 600, 20);
            jp.add(jl4);
            JRadioButton jrb10 = new JRadioButton("Row");
            jrb10.setBounds(50, 350, 300, 20);

            jp.add(jrb10);
            JRadioButton jrb11 = new JRadioButton("Column");
            jrb11.setBounds(50, 370, 300, 20);

            jp.add(jrb11);
            JRadioButton jrb12 = new JRadioButton("Both Row and Column");
            jrb12.setBounds(50, 390, 300, 20);

            jp.add(jrb12);
            ButtonGroup bg4 = new ButtonGroup();
            bg4.add(jrb10);
            bg4.add(jrb11);
            bg4.add(jrb12);

            JLabel jl5 = new JLabel("5.Which component is responsible to run java program?");
            jl5.setBounds(50, 430, 600, 20);
            jp.add(jl5);
            JRadioButton jrb13 = new JRadioButton("JVM");
            jrb13.setBounds(50, 450, 300, 20);

            jp.add(jrb13);
            JRadioButton jrb14 = new JRadioButton("JDK");
            jrb14.setBounds(50, 470, 300, 20);

            jp.add(jrb14);
            JRadioButton jrb15 = new JRadioButton("JRE");
            jrb15.setBounds(50, 490, 300, 20);

            jp.add(jrb15);
            ButtonGroup bg5 = new ButtonGroup();
            bg5.add(jrb13);
            bg5.add(jrb14);
            bg5.add(jrb15);

            JButton jb1 = new JButton("NEXT");
            jb1.setBounds(1200, 660, 100, 30);
            jf.add(jb1);
            JLabel j0 = new JLabel();
            j0.setBounds(1100, 30, 600, 20);
            jp.add(j0);
            Thread A = new Thread() {
                public void run() {
                    int k, l;
                    for (k = 9; k >= 0; k--) {
                        for (l = 99; l >= 0; l--) {
                            if (timer1 == 0) {
                                break;
                            }
                            NumberFormat nf = new DecimalFormat("00");
                            j0.setText(nf.format(k) + ":" + nf.format(l));
                            try {
                                Thread.sleep(10);
                            } catch (Exception e) {
                            }
                        }
                    }
                    if (jrb1.isSelected()) {
                        Javamark++;
                    }
                    if (jrb6.isSelected()) {
                        Javamark++;
                    }
                    if (jrb8.isSelected()) {
                        Javamark++;
                    }
                    if (jrb10.isSelected()) {
                        Javamark++;
                    }
                    if (jrb15.isSelected()) {
                        Javamark++;
                    }
                    javacourse();
                    jf.setVisible(false);

                }
            };
            jb1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    timer1 = 0;
                }
            });
            jf.setSize(1366, 768);
            jf.setLayout(null);
            jf.setVisible(true);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            A.start();
        } catch (Exception e) {
            System.out.println("SELECT THE CORRECT INPUT EG.1");
        }
    }

    public void javacourse() {
        try {
            JFrame jf = new JFrame("JAVA TEST");

            JPanel jp = new JPanel();
            jp.setLayout(null);
            jp.setBackground(Color.lightGray);
            jp.setBounds(50, 50, 1250, 600);
            jf.add(jp);
            JLabel jl = new JLabel("WELCOME TO THEEROS ONLINE EXAM");
            jl.setBounds(600, 10, 500, 60);
            jf.add(jl);
            JLabel jl1 = new JLabel("6.What is true about constructor?");
            jl1.setBounds(50, 30, 600, 20);
            jp.add(jl1);
            JRadioButton jrb1 = new JRadioButton("It can contain return type");
            jrb1.setBounds(50, 50, 300, 20);

            jp.add(jrb1);
            JRadioButton jrb2 = new JRadioButton("It can take any number of parameters");
            jrb2.setBounds(50, 70, 300, 20);

            jp.add(jrb2);
            JRadioButton jrb3 = new JRadioButton("It can have any non access modifiers");
            jrb3.setBounds(50, 90, 300, 20);

            jp.add(jrb3);
            ButtonGroup bg1 = new ButtonGroup();
            bg1.add(jrb1);
            bg1.add(jrb2);
            bg1.add(jrb3);

            JLabel jl2 = new JLabel("7.Using which of the following, multiple inheritance in Java can be implemented?");
            jl2.setBounds(50, 130, 600, 20);
            jp.add(jl2);
            JRadioButton jrb4 = new JRadioButton("Interfaces");
            jrb4.setBounds(50, 150, 300, 20);

            jp.add(jrb4);
            JRadioButton jrb5 = new JRadioButton("Multithreading");
            jrb5.setBounds(50, 170, 300, 20);

            jp.add(jrb5);
            JRadioButton jrb6 = new JRadioButton("Protected methods");
            jrb6.setBounds(50, 190, 300, 20);

            jp.add(jrb6);
            ButtonGroup bg2 = new ButtonGroup();
            bg2.add(jrb4);
            bg2.add(jrb5);
            bg2.add(jrb6);

            JLabel jl3 = new JLabel("8.Which of the following keywords is used for throwing exception manually?");
            jl3.setBounds(50, 230, 600, 20);
            jp.add(jl3);
            JRadioButton jrb7 = new JRadioButton("finally");
            jrb7.setBounds(50, 250, 300, 20);

            jp.add(jrb7);
            JRadioButton jrb8 = new JRadioButton("try");
            jrb8.setBounds(50, 270, 300, 20);

            jp.add(jrb8);
            JRadioButton jrb9 = new JRadioButton("throw");
            jrb9.setBounds(50, 290, 300, 20);

            jp.add(jrb9);
            ButtonGroup bg3 = new ButtonGroup();
            bg3.add(jrb7);
            bg3.add(jrb8);
            bg3.add(jrb9);

            JLabel jl4 = new JLabel("9.Which of the following is used to rollback a JDBC transaction?");
            jl4.setBounds(50, 330, 600, 20);
            jp.add(jl4);
            JRadioButton jrb10 = new JRadioButton("rollback()");
            jrb10.setBounds(50, 350, 300, 20);

            jp.add(jrb10);
            JRadioButton jrb11 = new JRadioButton("rollforward()");
            jrb11.setBounds(50, 370, 300, 20);

            jp.add(jrb11);
            JRadioButton jrb12 = new JRadioButton("deleteTransaction()");
            jrb12.setBounds(50, 390, 300, 20);

            jp.add(jrb12);
            ButtonGroup bg4 = new ButtonGroup();
            bg4.add(jrb10);
            bg4.add(jrb11);
            bg4.add(jrb12);

            JLabel jl5 = new JLabel("10.Which of the following is a correct constructor for thread?");
            jl5.setBounds(50, 430, 600, 20);
            jp.add(jl5);
            JRadioButton jrb13 = new JRadioButton("Thread(Runnable a, String str)");
            jrb13.setBounds(50, 450, 300, 20);

            jp.add(jrb13);
            JRadioButton jrb14 = new JRadioButton("Thread(int priority)");
            jrb14.setBounds(50, 470, 300, 20);

            jp.add(jrb14);
            JRadioButton jrb15 = new JRadioButton("Thread(Runnable a, int priority)");
            jrb15.setBounds(50, 490, 300, 20);

            jp.add(jrb15);
            ButtonGroup bg5 = new ButtonGroup();
            bg5.add(jrb13);
            bg5.add(jrb14);
            bg5.add(jrb15);

            JButton jb1 = new JButton("FINISH");
            jb1.setBounds(1200, 660, 100, 30);
            jf.add(jb1);
            JLabel j0 = new JLabel();
            j0.setBounds(1100, 30, 600, 20);
            jp.add(j0);
            Thread B = new Thread() {
                public void run() {
                    int k, l;
                    for (k = 9; k >= 0; k--) {
                        for (l = 99; l >= 0; l--) {
                            if (timer2 == 0) {
                                break;
                            }
                            NumberFormat nf = new DecimalFormat("00");
                            j0.setText(nf.format(k) + ":" + nf.format(l));
                            try {
                                Thread.sleep(10);
                            } catch (Exception e) {
                            }
                        }
                    }
                    if (jrb2.isSelected()) {
                        Javamark++;
                    }
                    if (jrb4.isSelected()) {
                        Javamark++;
                    }
                    if (jrb9.isSelected()) {
                        Javamark++;
                    }
                    if (jrb10.isSelected()) {
                        Javamark++;
                    }
                    if (jrb13.isSelected()) {
                        Javamark++;
                    }
                    JOptionPane.showMessageDialog(jf, "MARKS SCORED" + Javamark + "/10");
                    javadb();
                    Selectcourse.main(null);
                    jf.setVisible(false);
                }
            };
            jb1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    timer2 = 0;
                }
            });
            jf.setSize(1366, 768);
            jf.setLayout(null);
            jf.setVisible(true);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            B.start();
        } catch (Exception e) {
            System.out.println("SELECT THE CORRECT INPUT EG.1");
        }
    }

    public void javadb() {
        main m = new main();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "rootroot");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("update marks set javamark='" + Javamark + "' where user_name='" + usrid + "'");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        Javacourse jc = new Javacourse();
    }

}
