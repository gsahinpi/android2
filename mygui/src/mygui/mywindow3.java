package mygui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class mywindow3 {
	 JButton btn1=new JButton("BEni tikla 1");
     JButton btn2=new JButton("BEni tikla 2");
     JButton btn3=new JButton("BEni tikla 3");
     
	 public JButton getBtn1() {
		return btn1;
	}

	public void setBtn1(JButton btn1) {
		this.btn1 = btn1;
	}

	public JButton getBtn2() {
		return btn2;
	}

	public void setBtn2(JButton btn2) {
		this.btn2 = btn2;
	}

	public JButton getBtn3() {
		return btn3;
	}

	public void setBtn3(JButton btn3) {
		this.btn3 = btn3;
	}

	public mywindow3() {
		myListener m=new myListener(this);
		 btn1.addActionListener(m);
		btn2.addActionListener(m);
		btn3.addActionListener(m);
	}

	public static void main(String[] args) {
	        //Schedule a job for the event-dispatching thread:
	        //creating andmywin showing this application's GUI.
		   mywindow3 m=new mywindow3();
		   
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
