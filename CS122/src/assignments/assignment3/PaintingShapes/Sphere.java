package assignments.assignment3.PaintingShapes;

import java.text.DecimalFormat;

import static java.lang.Math.PI;

public class Sphere extends Shape {
    protected double radius;
    protected double surfaceArea;

    public Sphere(double r){
        super("Sphere");
        radius = r;
    }

    @Override
    public double area() {
        surfaceArea = 4 * PI * Math.pow(radius, 2);
        return surfaceArea;

    }
    public String toString() {
        DecimalFormat fmt = new DecimalFormat("0.#");
        return super.toString() + " with a surface area of " + fmt.format(surfaceArea);
    }
}
