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
		
		// Draw a line for each point connection
		for(Point point : pointsToDraw) {
			
			if(!point.getConnectedPoints().isEmpty()) {
				
				// Loop through all of that point's current connections.
				for(int i = 0; i < point.getConnectedPoints().size(); i++) {
					
					g.drawLine(point.x, point.y, point.getConnectedPoints().get(i).x, point.getConnectedPoints().get(i).y);
					
				}
			}
		}
	}
	
	
} // End of class
