package com.vmoiseenko.Assignment5;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingForm {
	 private JFrame frame;
     private JPanel panel;
     private JLabel lblNumber;
   //  private JLabel lblNumber2;
     
 //    private JTextField txtNumber;
    // private JTextField txtNumber2;
     
     private JButton btnSubmit;
    // private JLabel lblPrime;
   
     private final int OFFSETX =200;
     private final int OFFSETY =200;
     private final int X=720;
     private final int Y=350;
        public SwingForm()
     {
      createFrame();
     }
     private void createFrame()
     {
      frame = new JFrame();
      frame.setBounds(OFFSETX,OFFSETY,X,Y);
     
      frame.setTitle("Playing Card");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(createPanel());
      frame.setVisible(true);
     }
     private JPanel createPanel()
     {
      panel =new JPanel();
      panel.setLayout(new GridLayout(2,2,5,5));
      lblNumber = new JLabel("Let's see what you will get");
    //  txtNumber = new JTextField();  
              
      //lblBattingAver = new JLabel();
     // lblBaseAverag = new JLabel();
      btnSubmit = new JButton("Get Result");
      btnSubmit.addActionListener(new AverageListener());
     // lblPrime = new JLabel();     
      panel.add(lblNumber);
     
      //panel.add(lblNumber2);
     
      panel.add(btnSubmit);
     
      return panel;
     }
     private class SubmitListener implements ActionListener
     { @Override
         public void actionPerformed(ActionEvent e) {
           // TODO Auto-generated method stub
           System.exit(0);
          }       
         }//end of ExitListenerClas
     private class AverageListener implements ActionListener{

          @Override
          public void actionPerformed(ActionEvent e) {
           //Card c = new Card();
           //cardArray  ca = new cardArray();
        //  c.getSuit();
        cardArray c = new cardArray();
  		ArrayList<Card> cards = c.getDeck();
  		for(Card s:cards){
  		lblNumber.setText("Here what you've got: " + s.getValue() + " " + s.getSuit()); 
            }         
          }
     }
}
