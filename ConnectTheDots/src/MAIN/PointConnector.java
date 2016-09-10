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
		PROXIMITY,
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
			ConnectBySameX(proximity);
		if(type == ConnectionType.SAME_Y)
			ConnectBySameY(proximity);
		if(type == ConnectionType.PROXIMITY)
			ConnectByProximity(proximity);
	}
	
	
	/** Connects the points based on the which ones are both near each other and have the same X values. Will return a list
	 * of Point objects that the user can then use to see which points are connected to other points. 
	 * @return points -- The same list that was inserted at the beginning of the algorithm, now with connected points. */
	private void ConnectBySameX(int proximity) {
		
		for(int i = 0; i < points.size(); i++) {
			
			// Start with the current point at "i".
			Point pointi = points.get(i);
			
			for(int j = 0; j < points.size(); j++) {
				
				// After looping through every other point, add it as a connected point if it has the same "x" value.
				if(points.get(j).x == pointi.x) {
					
					// Check if the points are close enough to each other.
					if(points.get(j).distance(pointi) <= proximity) {
					
						pointi.connectPoint(points.get(j));
						
					}
				}
			}
		}
		
	}
	
	
	/** Connects the points based on the which ones are both near each other and have the same Y values. */
	private void ConnectBySameY(int proximity) {
		
	}
	
	
	/** Connects the points based on how close they are to each other. */
	private void ConnectByProximity(int proximity) {
		
		for(int i = 0; i < points.size(); i++) {
			
			// Start with the current point at "i".
			Point pointi = points.get(i);
			
			for(int j = 0; j < points.size(); j++) {
				
				// Check if the points are close enough to each other.
				if(points.get(j).distance(pointi) <= proximity) {
				
					pointi.connectPoint(points.get(j));
					
				}
			}
		}
		
	}
	
} // End of class
