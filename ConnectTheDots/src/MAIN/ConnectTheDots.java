package MAIN;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ConnectTheDots {

	public static void main(String[] args) {
		
		JFrame tester = new JFrame("Connect The Dots");
		tester.setSize(400,400);
		tester.setLocationRelativeTo(null);
		tester.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.white);
		tester.add(panel);
		
		
		
		
		
		tester.setVisible(true);
	}

}
