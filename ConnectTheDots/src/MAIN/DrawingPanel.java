package MAIN;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	// All of the points to draw
	ArrayList<Point> pointsToDraw;
	
	
	public DrawingPanel(ArrayList<Point> p) {
		pointsToDraw = p;
	}

	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		

		// Draw each point on the JFrame
		for(Point p : pointsToDraw) {
			g.fillOval(p.x, p.y, 5, 5);
		}
	}
}