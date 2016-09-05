package MAIN;

import java.awt.Point;
import java.util.ArrayList;

public class Connect {
	
	// An arraylist that contains all of the points that need to be connected.
	ArrayList<Point> points;
	

	/** Creates an empty object with no points to connect. */
	public Connect() { points = new ArrayList<Point>(); }
	
	
	/** Creates a new Connect object and initializes it with a list of points to connect to each other.
	 * @param points -- The list of coordinate points that need to be connected. */
	public Connect(ArrayList<Point> points) { this.points = points; }
	
	
	

}
