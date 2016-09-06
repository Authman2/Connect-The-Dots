package MAIN;

import java.util.ArrayList;

/** An extention to the java.awt.Point class. This Point class allows the user to see which other points this one is 
 * connected to. */
public class Point extends java.awt.Point {
	private static final long serialVersionUID = 1L;

	// The list of points that are connected to this point.
	ArrayList<Point> connectedPoints;
	
	
	/** New point object. */
	public Point() {}
	
	/** New point object with coordinates x and y. 
	 * @param x -- The x coordinate.
	 * @param y -- The y coordinate. */
	public Point(int x, int y) { super(x,y); }

	
	
	////////// Getters ///////////
	
	/** Returns a list of points that are connected to this point. */
	public ArrayList<Point> getConnectedPoints() { return connectedPoints; }
	
}
