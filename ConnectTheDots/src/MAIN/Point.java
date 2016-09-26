package MAIN;

import java.util.ArrayList;

/** An extention to the java.awt.Point class. This Point class allows the user to see which other points this one is 
 * connected to. */
public class Point extends java.awt.Point {
	private static final long serialVersionUID = 1L;

	// The point that this one is connected to
	private Point connectedPoint;
	
	// A list of potential points that this point could connect to
	private ArrayList<Point> potentialPoints;
	
	
	
	/** New point object. */
	public Point() { potentialPoints = new ArrayList<Point>(); }
	
	
	/** New point object with coordinates x and y. 
	 * @param x -- The x coordinate.
	 * @param y -- The y coordinate. */
	public Point(int x, int y) { super(x,y); potentialPoints = new ArrayList<Point>(); }

	
	
	////////// Methods ///////////
	
	/** Connects another point, p, to this point.
	 * @param p -- The point to connect to this one. */
	public void connectPoint(Point p) { connectedPoint = p; }
	
	
	/** Adds a new point to the list of potential points.
	 * @param p -- The point to add. */
	public void addPotentialPoint(Point p) { potentialPoints.add(p); }
	
	
	////////// Getters ///////////
	
	/** Returns the point that this one is connected to.
	 * @return The point connected to this one. */
	public Point getConnectedPoint() { return connectedPoint; }
	
	
	/** Returns a list of the potential points that this point could connect to.
	 * @return A list of potential points. */
	public ArrayList<Point> getPotentialPoints() { return potentialPoints; }
	
	
	/** Returns the distance from this point to another.
	 * @return the distance between points. */
	public double distanceTo(Point p) {
		return super.distance(p.x, p.y);
	}
	

	@Override
	public String toString() {
		return String.format("Point: (%d, %d)", x, y);
	}
}
