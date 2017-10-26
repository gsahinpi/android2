package mygui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class myListener implements ActionListener {
 mywindow3 m;
	public myListener(mywindow3 mywindow3) {
		// TODO Auto-generated constructor stub
		m=mywindow3;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String input=e.getActionCommand();
		if (input.contains("BEni tikla 1"))
		{
			m.btn2.setBackground(new Color(0, 250, 0));
		}
		
	}

}
