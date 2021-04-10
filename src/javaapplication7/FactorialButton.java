/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Orkhan
 */
public class FactorialButton extends JFrame{
    private static final int height = 300;
    private static final int base = 150;
    private JTextField acfac;
    private JTextField refac;
    private JButton button;

    public FactorialButton() {
        setTitle("Factorial Button");
        setSize (height,base);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        createcontents();
        setLayout(new FlowLayout());
        
    }
    private void createcontents(){
        JLabel abc = new JLabel("X:");
        JLabel cba = new JLabel("factorial");
        acfac = new JTextField(5);
        refac = new JTextField(5);
        button = new JButton("Press");
        add(abc);
        add(acfac);
        add(cba);
        add(refac);
        add(button);
        button.setBackground(Color.red);
        acfac.setBackground(Color.black);
        acfac.setForeground(Color.white);
        refac.setBackground(Color.yellow);
        getContentPane().setBackground(Color.pink);
        button.addActionListener(new Listener());
    }

    private class Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           int x ; //user's entering number
           int result;//result
           if(e.getActionCommand().equals("Press")){
               JOptionPane.showMessageDialog(null, "GET Suck");
           }

           try{
               x=Integer.parseInt(acfac.getText());
           }
           catch(NumberFormatException nfe){
               x=-1;
               
           }
           if(x<0){
               acfac.setText("Undefined");
           }
           else{
               if(x==0 || x==1){
                 
                   JOptionPane.showMessageDialog(null, "GET THE FUCK OUT");
               }
               
               else{
                   result=1;
                   for(int i =2;i<=x;i++){
                       result*=i;
                       refac.setText(Integer.toString(result));
                       
                   }
                    
                   
               }
              
               
           }
           
           
           
           
           
           
           
           
           
           
        }

       
    }

    
    
    
    
    
    
}
