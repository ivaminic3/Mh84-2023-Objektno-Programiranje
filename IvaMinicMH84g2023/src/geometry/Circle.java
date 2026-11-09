package geometry;

public class Circle {


	private int radius;
	private Point center;
	private boolean selected;
	
	public Circle() {
		
		
	}
	public Circle(int radius, Point center) {
		this.radius=radius;
		this.center=center;
		
		
	}
	
	public Circle(int radius, Point center, boolean selected) {
		this(radius, center);
		this.selected=selected;
		
	}
	public double circumference() {
		return 2*radius*Math.PI;
		
	}
	
	@Override
	public String toString() {
		return String.format("(%s,%s) -> (%s)" , center.getX(), center.getY(), radius); 
	}
	public double area() {
		return Math.PI*radius*radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}
	
}
