package mygui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class myWindow2 {
	 JButton btn1=new JButton("BEni tikla 1");
     JButton btn2=new JButton("BEni tikla 2");
     JButton btn3=new JButton("BEni tikla 3");
     
	 public myWindow2() {
		btn1.addActionListener(new  ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			btn2.setBackground(new Color(0, 0, 255));
				
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btn3.setBackground(new Color(0, 255, 0));
				
			}
		});
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btn1.setBackground(new Color(255, 0, 0));
				
				
			}
		});
	 }
		

	public static void main(String[] args) {
	        //Schedule a job for the event-dispatching thread:
	        //creating andmywin showing this application's GUI.
		   myWindow2 m=new myWindow2();
		   
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	            	JFrame frame = new JFrame("GridBagLayoutDemo");
	                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	                //Set up the content pane.
	              
	             
                               //Display the window.
	               frame.setLayout(new GridBagLayout());
	               GridBagConstraints contraints = new GridBagConstraints();
	               contraints.gridx = 0;
	            	contraints.gridy = 0;
	               frame.add(m.btn1,contraints);
	               contraints.gridx = 0;
	            	contraints.gridy = 1;
	            	  frame.add(m.btn2,contraints);
	            	  contraints.gridx = 1;
		            	contraints.gridy = 0;
		            	  frame.add(m.btn3,contraints);
	                frame.pack();
	                frame.setVisible(true);
	            }
	        });
	    }

	

}
