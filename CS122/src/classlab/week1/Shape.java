package classlab.week1;

public class Shape {
	double area = 0;
	double side1, side2;
	String shapeName;
	public Shape(double x, double y, String name) {
		side1 = x;
		side2 = y;
		shapeName = name;
	}
	public String getName() {
		return shapeName;
	}
	public double getArea() {
		area = side1*side2;
		return area;
	}
	
	public String toString() {
		String message = "The shapes name is: " + getName() + ".";
		return message;
	}
	
}
