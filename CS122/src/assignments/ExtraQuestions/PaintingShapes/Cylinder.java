package assignments.ExtraQuestions.PaintingShapes;

import java.text.DecimalFormat;

import static java.lang.Math.PI;

public class Cylinder extends Shape {
    protected double radius;
    protected double height;
    protected double area;

    public Cylinder(double r, double h){
        super("Cylinder");
        radius = r;
        height = h;
    }

    @Override
    public double area(){
        area = PI * Math.pow(radius, 2) * height;
        return area;
    }

    public String toString() {
        DecimalFormat fmt = new DecimalFormat("0.#");
        String message = super.toString() + " with an area of " + fmt.format(area);
        return message;
    }
}
