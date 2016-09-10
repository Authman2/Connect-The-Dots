package MAIN;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;

import MAIN.PointConnector.ConnectionType;

public class ConnectTheDots {

	public static void main(String[] args) {
		
		// Make a JFrame to display the points
		JFrame tester = new JFrame("Connect The Dots");
		tester.setSize(400,400);
		tester.setLocationRelativeTo(null);
		tester.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// Create a list of points
		ArrayList<Point> points = new ArrayList<Point>();
		points.add(new Point(5,20));
		points.add(new Point(100,70));
		points.add(new Point(27,5));
		points.add(new Point(80,90));
		points.add(new Point(19,13));
		points.add(new Point(135,120));
		points.add(new Point(89,135));
		points.add(new Point(5,150));
		

		// Create the panel that draws all of the points from the list above
		DrawingPanel panel = new DrawingPanel(points);
		panel.setBackground(Color.white);
		tester.add(panel);
		
		
		// Create a new PointConnector object
		PointConnector pointConnector = new PointConnector(points);
		pointConnector.connectBy(ConnectionType.PROXIMITY, 50);
		
		
		
		
		tester.setVisible(true);
	}

}
