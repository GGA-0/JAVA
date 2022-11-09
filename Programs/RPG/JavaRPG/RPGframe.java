import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RPGframe extends JFrame{
    RPGframe(){
        //Frame
        this.setTitle("JavaRPG");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Closes on X pressed
        this.setResizable(false);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setLayout(null);
        this.setBounds(0, 0, 500, 550);
        

        //Label 
        JLabel label = new JLabel();
        label.setText("Welcome to Sorocaba");
        label.setBounds(20, 20, 500, 12);
        

        //Panel
        JPanel panelTop = new JPanel();
        panelTop.setBounds(0, 0, 500, 100);
        panelTop.setBackground(Color.CYAN);
        panelTop.setLayout(null);
        this.add(panelTop);
        panelTop.add(label);

    }    
}