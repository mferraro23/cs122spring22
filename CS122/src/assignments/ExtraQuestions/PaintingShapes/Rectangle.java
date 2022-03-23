package assignments.ExtraQuestions.PaintingShapes;

import java.text.DecimalFormat;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    protected double area;

    public Rectangle(double w, double l){
        super("Rectangle");
        width = w;
        length = l;
    }

    @Override
    public double area() {
        area = width * length;
        return area;
    }

    public String toString() {
        DecimalFormat fmt = new DecimalFormat("0.#");
        String message = super.toString() + " with an area of " + fmt.format(area);
        return message;
    }
}
