package OnlineExam;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;

public class Cppcourse extends Selectcourse {

    int cppmark = 0, timer1 = 1, timer2 = 1;

    Cppcourse()
    {
        try {
            JFrame jf = new JFrame("C++ TEST");
            JPanel jp = new JPanel();
            jp.setLayout(null);
            jp.setBackground(Color.lightGray);
            jp.setBounds(50, 50, 1250, 600);
            jf.add(jp);
            JLabel jl = new JLabel("WELCOME TO THEEROS ONLINE EXAM");
            jl.setBounds(650, 10, 500, 20);
            jf.add(jl);
            JLabel jl1 = new JLabel("1.Which of the following is called address operator?");
            jl1.setBounds(50, 30, 600, 20);
            jp.add(jl1);
            JRadioButton jrb1 = new JRadioButton("$");
            jrb1.setBounds(50, 50, 300, 20);
            jp.add(jrb1);
            JRadioButton jrb2 = new JRadioButton("&");
            jrb2.setBounds(50, 70, 300, 20);
            jp.add(jrb2);
            JRadioButton jrb3 = new JRadioButton("*");
            jrb3.setBounds(50, 90, 300, 20);
            jp.add(jrb3);
            ButtonGroup bg1 = new ButtonGroup();
            bg1.add(jrb1);
            bg1.add(jrb2);
            bg1.add(jrb3);

            JLabel jl2 = new JLabel("2.Which operator is overloaded for a cout object?");
            jl2.setBounds(50, 130, 600, 20);
            jp.add(jl2);
            JRadioButton jrb4 = new JRadioButton(">>");
            jrb4.setBounds(50, 150, 300, 20);
            jp.add(jrb4);
            JRadioButton jrb5 = new JRadioButton("<");
            jrb5.setBounds(50, 170, 300, 20);
            jp.add(jrb5);
            JRadioButton jrb6 = new JRadioButton("<<");
            jrb6.setBounds(50, 190, 300, 20);
            jp.add(jrb6);
            ButtonGroup bg2 = new ButtonGroup();
            bg2.add(jrb4);
            bg2.add(jrb5);
            bg2.add(jrb6);

            JLabel jl3 = new JLabel("3.Which of the following is not a type of inheritance?");
            jl3.setBounds(50, 230, 600, 20);
            jp.add(jl3);
            JRadioButton jrb7 = new JRadioButton("Multiple");
            jrb7.setBounds(50, 250, 300, 20);
            jp.add(jrb7);
            JRadioButton jrb8 = new JRadioButton("Distributive");
            jrb8.setBounds(50, 270, 300, 20);
            jp.add(jrb8);
            JRadioButton jrb9 = new JRadioButton("Multilevel");
            jrb9.setBounds(50, 290, 300, 20);
            jp.add(jrb9);
            ButtonGroup bg3 = new ButtonGroup();
            bg3.add(jrb7);
            bg3.add(jrb8);
            bg3.add(jrb9);

            JLabel jl4 = new JLabel("4.Which of the following is correct about static variables?");
            jl4.setBounds(50, 330, 600, 20);
            jp.add(jl4);
            JRadioButton jrb10 = new JRadioButton("Static functions do not support polymorphism");
            jrb10.setBounds(50, 350, 600, 20);
          
            jp.add(jrb10);
            JRadioButton jrb11 = new JRadioButton("Static data members cannot be accessed by non-static member functions");
            jrb11.setBounds(50, 370, 600, 20);
            
            jp.add(jrb11);
            JRadioButton jrb12 = new JRadioButton("Static data members functions can access only static data members");
            jrb12.setBounds(50, 390, 600, 20);
           
            jp.add(jrb12);
            ButtonGroup bg4 = new ButtonGroup();
            bg4.add(jrb10);
            bg4.add(jrb11);
            bg4.add(jrb12);

            JLabel jl5 = new JLabel("5.Which of the following describes the protected access specifier?");
            jl5.setBounds(50, 430, 600, 20);
            jp.add(jl5);
            JRadioButton jrb13 = new JRadioButton("The variable is visible only outside inside the block");
            jrb13.setBounds(50, 450, 600, 20);
            jp.add(jrb13);
            JRadioButton jrb14 = new JRadioButton("The variable is visible everywhere");
            jrb14.setBounds(50, 470, 600, 20);
           
            jp.add(jrb14);
            JRadioButton jrb15 = new JRadioButton("The variable is visible to its block and to it’s derived class");
            jrb15.setBounds(50, 490, 600, 20);
          
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
                    if (jrb2.isSelected()) {
                        cppmark++;
                    }
                    if (jrb6.isSelected()) {
                        cppmark++;
                    }
                    if (jrb8.isSelected()) {
                        cppmark++;
                    }
                    if (jrb12.isSelected()) {
                        cppmark++;
                    }
                    if (jrb15.isSelected()) {
                        cppmark++;
                    }
                    cppcourse();
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

    public void cppcourse() {
        try {
            JFrame jf = new JFrame("C++ TEST");

            JPanel jp = new JPanel();
            jp.setLayout(null);
            jp.setBackground(Color.lightGray);
            jp.setBounds(50, 50, 1250, 600);
            jf.add(jp);
            JLabel jl = new JLabel("WELCOME TO THEEROS ONLINE EXAM");
            jl.setBounds(600, 10, 500, 60);
            jf.add(jl);
            JLabel jl1 = new JLabel("6.Where are the strings stored?");
            jl1.setBounds(50, 30, 600, 20);
            jp.add(jl1);
            JRadioButton jrb1 = new JRadioButton("Stack");
            jrb1.setBounds(50, 50, 300, 20);
                     jp.add(jrb1);
            JRadioButton jrb2 = new JRadioButton("Heap");
            jrb2.setBounds(50, 70, 300, 20);
            
            jp.add(jrb2);
            JRadioButton jrb3 = new JRadioButton("Both Stack & Heap");
            jrb3.setBounds(50, 90, 300, 20);
             
            jp.add(jrb3);
            ButtonGroup bg1 = new ButtonGroup();
            bg1.add(jrb1);
            bg1.add(jrb2);
            bg1.add(jrb3);

            JLabel jl2 = new JLabel("7.Which keyword is used to represent a friend function?");
            jl2.setBounds(50, 130, 600, 20);
            jp.add(jl2);
            JRadioButton jrb4 = new JRadioButton("friend");
            jrb4.setBounds(50, 150, 300, 20);
          
            jp.add(jrb4);
            JRadioButton jrb5 = new JRadioButton("Friend");
            jrb5.setBounds(50, 170, 300, 20);
  
            jp.add(jrb5);
            ButtonGroup bg2 = new ButtonGroup();
            bg2.add(jrb4);
            bg2.add(jrb5);

            JLabel jl3 = new JLabel("8.Which is used to get the input during runtime?");
            jl3.setBounds(50, 230, 600, 20);
            jp.add(jl3);
            JRadioButton jrb7 = new JRadioButton("cout");
            jrb7.setBounds(50, 250, 300, 20);
      
            jp.add(jrb7);
            JRadioButton jrb8 = new JRadioButton("cin");
            jrb8.setBounds(50, 270, 300, 20);
        
            jp.add(jrb8);
            JRadioButton jrb9 = new JRadioButton("coi");
            jrb9.setBounds(50, 290, 300, 20);
             
            jp.add(jrb9);
            ButtonGroup bg3 = new ButtonGroup();
            bg3.add(jrb7);
            bg3.add(jrb8);
            bg3.add(jrb9);

            JLabel jl4 = new JLabel("9.Which header file is required to use file I/O operations?");
            jl4.setBounds(50, 330, 600, 20);
            jp.add(jl4);
            JRadioButton jrb10 = new JRadioButton("<ifstream>");
            jrb10.setBounds(50, 350, 300, 20);
          
            jp.add(jrb10);
            JRadioButton jrb11 = new JRadioButton("<ostream>");
            jrb11.setBounds(50, 370, 300, 20);
           
            jp.add(jrb11);
            JRadioButton jrb12 = new JRadioButton("<fstream>");
            jrb12.setBounds(50, 390, 300, 20);
            
            jp.add(jrb12);
            ButtonGroup bg4 = new ButtonGroup();
            bg4.add(jrb10);
            bg4.add(jrb11);
            bg4.add(jrb12);

            JLabel jl5 = new JLabel("To which type does the numeric limits are suitable?");
            jl5.setBounds(50, 430, 600, 20);
            jp.add(jl5);
            JRadioButton jrb13 = new JRadioButton("Character types");
            jrb13.setBounds(50, 450, 300, 20);
     
            jp.add(jrb13);
            JRadioButton jrb14 = new JRadioButton("Arithmetic types");
            jrb14.setBounds(50, 470, 300, 20);
    
            jp.add(jrb14);
            JRadioButton jrb15 = new JRadioButton("Mixed type");
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
                    if (jrb3.isSelected()) {
                        cppmark++;
                    }
                    if (jrb4.isSelected()) {
                        cppmark++;
                    }
                    if (jrb8.isSelected()) {
                        cppmark++;
                    }
                    if (jrb12.isSelected()) {
                        cppmark++;
                    }
                    if (jrb14.isSelected()) {
                        cppmark++;
                    }
                    JOptionPane.showMessageDialog(jf, "MARKS SCORED" + cppmark + "/10");
                    cppdb();
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

    public void cppdb() {
        main m = new main();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "rootroot");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("update marks set cppmark='" + cppmark + "' where user_name='" + usrid + "'");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        Cppcourse cpp = new Cppcourse();
    }
}
