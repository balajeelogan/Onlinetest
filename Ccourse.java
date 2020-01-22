package OnlineExam;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;

public class Ccourse extends Selectcourse {

    int cmark = 0, timer1 = 1, timer2 = 1;

    Ccourse() {
        try {
            JFrame jf = new JFrame("C TEST");
            JPanel jp = new JPanel();
            jp.setLayout(null);
            jp.setBackground(Color.lightGray);
            jp.setBounds(50, 50, 1250, 600);
            jf.add(jp);
            JLabel jl = new JLabel("WELCOME TO THEEROS ONLINE EXAM");
            jl.setBounds(650, 10, 500, 20);
            jf.add(jl);
            JLabel jl1 = new JLabel("1.Which of the following is not a valid C variable name?");
            jl1.setBounds(50, 30, 600, 20);
            jp.add(jl1);
            JRadioButton jrb1 = new JRadioButton("int number");
            jrb1.setBounds(50, 50, 300, 20);
            jp.add(jrb1);
            JRadioButton jrb2 = new JRadioButton("float variable_count");
            jrb2.setBounds(50, 70, 300, 20);
            jp.add(jrb2);
            JRadioButton jrb3 = new JRadioButton("String $main");
            jrb3.setBounds(50, 90, 300, 20);
            jp.add(jrb3);
            ButtonGroup bg1 = new ButtonGroup();
            bg1.add(jrb1);
            bg1.add(jrb2);
            bg1.add(jrb3);

            JLabel jl2 = new JLabel("2.The format identifier ‘%i’ is also used for _____ data type.");
            jl2.setBounds(50, 130, 600, 20);
            jp.add(jl2);
            JRadioButton jrb4 = new JRadioButton("int");
            jrb4.setBounds(50, 150, 300, 20);
            jp.add(jrb4);
            JRadioButton jrb5 = new JRadioButton("float");
            jrb5.setBounds(50, 170, 300, 20);
            jp.add(jrb5);
            JRadioButton jrb6 = new JRadioButton("double");
            jrb6.setBounds(50, 190, 300, 20);
            jp.add(jrb6);
            ButtonGroup bg2 = new ButtonGroup();
            bg2.add(jrb4);
            bg2.add(jrb5);
            bg2.add(jrb6);

            JLabel jl3 = new JLabel("3.A variable declared in a function can be used in main().");
            jl3.setBounds(50, 230, 600, 20);
            jp.add(jl3);
            JRadioButton jrb7 = new JRadioButton("True");
            jrb7.setBounds(50, 250, 300, 20);
            jp.add(jrb7);
            JRadioButton jrb8 = new JRadioButton("Flase");
            jrb8.setBounds(50, 270, 300, 20);
            jp.add(jrb8);
            ButtonGroup bg3 = new ButtonGroup();
            bg3.add(jrb7);
            bg3.add(jrb8);

            JLabel jl4 = new JLabel("4.The keyword ‘break’ cannot be simply used within _________");
            jl4.setBounds(50, 330, 600, 20);
            jp.add(jl4);
            JRadioButton jrb10 = new JRadioButton("do-while");
            jrb10.setBounds(50, 350, 300, 20);

            jp.add(jrb10);
            JRadioButton jrb11 = new JRadioButton("if-else");
            jrb11.setBounds(50, 370, 300, 20);

            jp.add(jrb11);
            JRadioButton jrb12 = new JRadioButton("for");
            jrb12.setBounds(50, 390, 300, 20);

            jp.add(jrb12);
            ButtonGroup bg4 = new ButtonGroup();
            bg4.add(jrb10);
            bg4.add(jrb11);
            bg4.add(jrb12);

            JLabel jl5 = new JLabel("5.Is initialisation mandatory for local static variables?");
            jl5.setBounds(50, 430, 600, 20);
            jp.add(jl5);
            JRadioButton jrb13 = new JRadioButton("Yes");
            jrb13.setBounds(50, 450, 300, 20);

            jp.add(jrb13);
            JRadioButton jrb14 = new JRadioButton("No");
            jrb14.setBounds(50, 470, 300, 20);

            jp.add(jrb14);
            JRadioButton jrb15 = new JRadioButton("Depends on the compiler");
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
                    if (jrb3.isSelected()) {
                        cmark++;
                    }
                    if (jrb4.isSelected()) {
                        cmark++;
                    }
                    if (jrb8.isSelected()) {
                        cmark++;
                    }
                    if (jrb11.isSelected()) {
                        cmark++;
                    }
                    if (jrb14.isSelected()) {
                        cmark++;
                    }
                    ccourse();
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

    public void ccourse() {
        try {
            JFrame jf = new JFrame("C TEST");
            JPanel jp = new JPanel();
            jp.setLayout(null);
            jp.setBackground(Color.lightGray);
            jp.setBounds(50, 50, 1250, 600);
            jf.add(jp);
            JLabel jl = new JLabel("WELCOME TO THEEROS ONLINE EXAM");
            jl.setBounds(600, 10, 500, 60);
            jf.add(jl);
            JLabel jl1 = new JLabel("6.A user defined data type, which is used to assign names to integral constants is called:");
            jl1.setBounds(50, 30, 600, 20);
            jp.add(jl1);
            JRadioButton jrb1 = new JRadioButton("Union");
            jrb1.setBounds(50, 50, 300, 20);

            jp.add(jrb1);
            JRadioButton jrb2 = new JRadioButton("Array");
            jrb2.setBounds(50, 70, 300, 20);
            jp.add(jrb2);
            JRadioButton jrb3 = new JRadioButton("Enum");
            jrb3.setBounds(50, 90, 300, 20);
            jp.add(jrb3);
            ButtonGroup bg1 = new ButtonGroup();
            bg1.add(jrb1);
            bg1.add(jrb2);
            bg1.add(jrb3);

            JLabel jl2 = new JLabel("7.String handling functions such as strcmp(), strcpy() etc can be used with enumerated types.");
            jl2.setBounds(50, 130, 600, 20);
            jp.add(jl2);
            JRadioButton jrb4 = new JRadioButton("True");
            jrb4.setBounds(50, 150, 300, 20);
            jp.add(jrb4);
            JRadioButton jrb5 = new JRadioButton("False");
            jrb5.setBounds(50, 170, 300, 20);

            jp.add(jrb5);
            ButtonGroup bg2 = new ButtonGroup();
            bg2.add(jrb4);
            bg2.add(jrb5);

            JLabel jl3 = new JLabel("8.const int *ptr;");
            jl3.setBounds(50, 230, 600, 20);
            jp.add(jl3);
            JRadioButton jrb7 = new JRadioButton("You cannot change the value pointed by ptr");
            jrb7.setBounds(50, 250, 300, 20);

            jp.add(jrb7);
            JRadioButton jrb8 = new JRadioButton("You cannot change the pointer ptr itself");
            jrb8.setBounds(50, 270, 300, 20);

            jp.add(jrb8);
            JRadioButton jrb9 = new JRadioButton("You May or may not change the value pointed by ptr");
            jrb9.setBounds(50, 290, 300, 20);

            jp.add(jrb9);
            ButtonGroup bg3 = new ButtonGroup();
            bg3.add(jrb7);
            bg3.add(jrb8);
            bg3.add(jrb9);

            JLabel jl4 = new JLabel("9.int *ptr, p;");
            jl4.setBounds(50, 330, 600, 20);
            jp.add(jl4);
            JRadioButton jrb10 = new JRadioButton("ptr is a pointer to integer, p is not");
            jrb10.setBounds(50, 350, 300, 20);

            jp.add(jrb10);
            JRadioButton jrb11 = new JRadioButton("ptr and p, both are pointers to integer");
            jrb11.setBounds(50, 370, 300, 20);

            jp.add(jrb11);
            JRadioButton jrb12 = new JRadioButton("ptr is a pointer to integer, p may or may not be");
            jrb12.setBounds(50, 390, 300, 20);

            jp.add(jrb12);
            ButtonGroup bg4 = new ButtonGroup();
            bg4.add(jrb10);
            bg4.add(jrb11);
            bg4.add(jrb12);

            JLabel jl5 = new JLabel("10.Which of the following cannot be static in C?");
            jl5.setBounds(50, 430, 600, 20);
            jp.add(jl5);
            JRadioButton jrb13 = new JRadioButton("Variables");
            jrb13.setBounds(50, 450, 300, 20);

            jp.add(jrb13);
            JRadioButton jrb14 = new JRadioButton("Functions");
            jrb14.setBounds(50, 470, 300, 20);

            jp.add(jrb14);
            JRadioButton jrb15 = new JRadioButton("None of the mentioned");
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
                @Override
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
                    if (jrb3.isSelected()) {
                        cmark++;
                    }
                    if (jrb5.isSelected()) {
                        cmark++;
                    }
                    if (jrb7.isSelected()) {
                        cmark++;
                    }
                    if (jrb10.isSelected()) {
                        cmark++;
                    }
                    if (jrb15.isSelected()) {
                        cmark++;
                    }
                    JOptionPane.showMessageDialog(jf, "MARKS SCORED" + cmark + "/10");
                    cdb();
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

    public void cdb() {
        main m = new main();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "rootroot");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("update marks set cmark='" + cmark + "' where user_name='" + usrid + "'");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {

        Ccourse cc = new Ccourse();
    }
}
