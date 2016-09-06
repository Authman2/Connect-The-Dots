package MAIN;

import java.util.ArrayList;

public class PointConnector {
	
	// An arraylist that contains all of the points that need to be connected.
	private ArrayList<Point> points;
	

	/** Creates an empty object with no points to connect. */
	public PointConnector() { points = new ArrayList<Point>(); }
	
	
	/** Creates a new PointConnecter object and initializes it with a list of points to connect to each other.
	 * @param points -- The list of coordinate points that need to be connected. */
	public PointConnector(ArrayList<Point> points) { this.points = points; }
	
	
	////// Enum //////
	
	/** This enum represents the different ways that the points should be connected by. */
	public enum ConnectionType {
		
		/** Connects the points by X value, meaning that if any two points have the same X coordinate and are within a
		 * certain proximity of each other, they will be connected. */
		SAME_X,
		
		
		/** Connects the points by Y value, meaning that if any two points have the same Y coordinate and are within a
		 * certain proximity of each other, they will be connected. */
		SAME_Y,
		
		
		/** Connects a point to one or more points based on proximity alone. If there are any points within the specified
		 * distance from the point in question, then those two points will be connected. */
		NEAREST_NEIGHBOR,
	}
	
	
	///////// Getters //////////
	
	/** Returns all of the points that are supposed to be connected. */
	public ArrayList<Point> getPoints() { return points; }
	
	
	///////// Methods //////////
	
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
	
	
	/** Starts the point connection process. 
	 * @param type -- The way that the algorithm should connect the dots by.
	 * @param proximity -- The farthest radial distance that any two points can be from each other and still connect. */
	public void connectBy(ConnectionType type, int proximity) {
		
		if(type == ConnectionType.SAME_X)
			ConnectBySameX();
		if(type == ConnectionType.SAME_Y)
			ConnectBySameY();
		//if(type == ConnectionType.NEAREST_NEIGHBOR)
			// There is no nearest neighbor method yet
	}
	
	
	/** Connects the points based on the which ones are both near each other and have the same X values. Will return a list
	 * of Point objects that the user can then use to see which points are connected to other points. */
	private void ConnectBySameX() {
		
	}
	
	
	/** Connects the points based on the which ones are both near each other and have the same Y values. */
	private void ConnectBySameY() {
		
	}
}
