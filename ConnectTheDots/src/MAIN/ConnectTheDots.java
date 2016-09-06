package MAIN;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ConnectTheDots {

	public static void main(String[] args) {
		
		// Make a JFrame to display the points
		JFrame tester = new JFrame("Connect The Dots");
		tester.setSize(400,400);
		tester.setLocationRelativeTo(null);
		tester.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.white);
		tester.add(panel);
		
		
		// Create a list of points
		ArrayList<Point> points = new ArrayList<Point>();
		points.add(new Point());
		
		
		tester.setVisible(true);
	}

}
