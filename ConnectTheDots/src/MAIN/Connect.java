package MAIN;

import java.awt.Point;
import java.util.ArrayList;

public class Connect {
	
	// An arraylist that contains all of the points that need to be connected.
	private ArrayList<Point> points;
	

	/** Creates an empty object with no points to connect. */
	public Connect() { points = new ArrayList<Point>(); }
	
	
	/** Creates a new Connect object and initializes it with a list of points to connect to each other.
	 * @param points -- The list of coordinate points that need to be connected. */
	public Connect(ArrayList<Point> points) { this.points = points; }
	
	
	
	///////// Methods ///////////
	
	/** Sets the list of points to have connected to each other. 
	 * @param points -- The list of coordinate points that need to be connected. */
	public void setPoints(ArrayList<Point> points) { this.points = points; }
	
	
	/** Adds a point to the list of points that must be connected. 
	 * @param p -- The point to add to the list of points. */
	public void addPoint(Point p) { this.points.add(p); }
	
	
	/** Adds a point to the list of points with the specified x and y coordinate points.
	 * @param x -- The x coordinate. 
	 * @param y -- The y coordinate. */
	public void addPoint(int x, int y) { this.points.add(new Point(x, y)); }
}
