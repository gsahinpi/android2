package mygui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class myWindow implements ActionListener{
	 JButton btn1=new JButton("BEni tikla 1");
     JButton btn2=new JButton("BEni tikla 2");
     JButton btn3=new JButton("BEni tikla 3");
     
	 public myWindow() {
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
	}

	public static void main(String[] args) {
	        //Schedule a job for the event-dispatching thread:
	        //creating andmywin showing this application's GUI.
		   myWindow m=new myWindow();
		   
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.toString());
	}

}
