package de.telran.swingprogram;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

//import javafx.scene.shape.*;
public class Example {

    public static void main(String[] args) {
        JFrame frame = new JFrame("example");

        JButton btn1 = new JButton("click me");
        btn1.setBounds(40,90,85,20);
        frame.add(btn1);

        JTextField txt1 = new JTextField("edureka");
        txt1.setBounds(50,120,200,30);
        frame.add(txt1);

        JMenu menu = new JMenu("options");
        JMenuBar m1 = new JMenuBar();
        JMenuItem a1 = new JMenuItem("example");
        JMenuItem a2 = new JMenuItem("example1");
        menu.add(a1);
        menu.add(a2);
        m1.add(menu);
        frame.setJMenuBar(m1);

        //Ellipse ellipse = new Ellipse(30, 30, 20, 20);
        //DrawCircle dr = new DrawCircle;
        //dr.xxx = 2;
        //dr.paintComponent();

        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        //System.exit(1);
    } // End Main

     class DrawCircle extends JPanel {
        int xxx = 1;
        public void paintComponent(Graphics g) {
            g.drawOval(50, 50, 100, 100);
            g.setColor(Color.WHITE);
            g.fillOval(60, 60, 40, 40);

        }
    }

}
