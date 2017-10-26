package adderWindow;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class myFrame {
	JFrame pencere;
	ArrayList<JTextField> mytexts;
	public myFrame()
	{
		mytexts=new ArrayList<JTextField>();
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
		pencere =new JFrame();
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Display the window.
        pencere.setLayout(new GridBagLayout());
        GridBagConstraints contraints = new GridBagConstraints();
        JTextField input=new JTextField(10);
        contraints.gridx = 0;
    	contraints.gridy = 0;
    	pencere.add(input,contraints);
    	JButton inputbtn=new JButton("create");
    	inputbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			String in=input.getText();
			int num=Integer.parseInt(in);
			for (int i=0;i<num;i++)
			{
				contraints.gridx = 0;
		    	contraints.gridy = 2+i;
		    	JTextField tf=new JTextField(10);
		    	mytexts.add(tf);
		    	pencere.add(tf,contraints);
			}
			//ad button
			
			
			contraints.gridx = 0;
	    	contraints.gridy += 1;
	    	mybutton calbtn=new mybutton(pencere,mytexts,contraints.gridy);
			pencere.add(calbtn,contraints);
			pencere.pack();	
			
			}
		});
    	 contraints.gridx = 0;
      	contraints.gridy = 1;
     	pencere.add(inputbtn,contraints);
		pencere.pack();
        pencere.setVisible(true);
            }
		});
            

	}//myframe
	

}
