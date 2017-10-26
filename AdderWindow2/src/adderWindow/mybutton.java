package adderWindow;

import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class mybutton extends JButton implements ActionListener {
	
	JFrame j;
	ArrayList<JTextField> m;
	int g;

	public mybutton(JFrame pencere, ArrayList<JTextField> mytexts, int gridy) {
		// TODO Auto-generated constructor stub
		g=gridy+1;
		m=mytexts;
		j=pencere;
		setText("HEsapla");
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
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

	}

}
