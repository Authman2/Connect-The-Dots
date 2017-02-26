package MAIN;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

import je.other.pointconnector.DrawingPanel;
import je.other.pointconnector.Point;
import je.other.pointconnector.PointConnector;


public class ConnectTheDots {
	
	public static void main(String[] args) {
		
		// Make a JFrame to display the points
		JFrame tester = new JFrame("Connect The Dots");
		tester.setSize(400,400);
		tester.setLocationRelativeTo(null);
		tester.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create a list of points
		ArrayList<Point> points = createRandomPoints();
		
		// Point connector
		PointConnector pc = configurePointConnector(points);

		// Create the panel that draws all of the points from the list above
		DrawingPanel panel = new DrawingPanel(pc.getOutput(), true);
		panel.setBackground(Color.white);
		tester.add(panel, BorderLayout.CENTER);
		
		tester.setVisible(true);
	}

	
	public static ArrayList<Point> createRandomPoints() {
		ArrayList<Point> p = new ArrayList<Point>();
		Random rand = new Random();
		int size = new Integer("50");
		for(int i = 0; i < size; i++) p.add(new Point( rand.nextInt(300), rand.nextInt(300) ));
		return p;
	}
	
	public static PointConnector configurePointConnector(ArrayList<Point> points) {
		PointConnector pc = new PointConnector(points);
		pc.connect();
		return pc;
	}
	
}
