package adderWindow;

import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class calculateButtonlistener implements ActionListener {
 JFrame j;
 ArrayList<JTextField> m;
 int g;
	public calculateButtonlistener(JFrame pencere, ArrayList<JTextField> mytexts, int gridy) {
		// TODO Auto-generated constructor stub
		j=pencere;
		m=mytexts;
		g=gridy+1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int sum=0;
		for(JTextField dummy:m)
		{
			sum=sum+Integer.parseInt(dummy.getText());
		}
		  GridBagConstraints contraints = new GridBagConstraints();
		contraints.gridx = 0;
    	contraints.gridy =g;
    	JLabel label=new JLabel(sum+" ");
		j.add(label,contraints);
		j.pack();	
		
	}//aperformed

}
