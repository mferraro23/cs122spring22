package classlab.week1;

public class ShapesDriver {
	
	public static void main(String[] args) {
		Square square1 = new Square(10, "Square");
		Rectangle rectangle1 = new Rectangle(5,10, "Rectangle");
		
		System.out.println(square1.toString() + " It has an area of " + square1.getArea());
		System.out.println(rectangle1.toString() + " It has an area of " + rectangle1.getArea());
	}
	
}
