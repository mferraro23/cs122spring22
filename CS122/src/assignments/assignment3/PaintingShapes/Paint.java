package assignments.assignment3.PaintingShapes;

public class Paint {
    protected double coverage; // num of square feet per gallon

    public Paint(double c){
        coverage = c;
    }

    public double computeAmount(Shape s){
        double amount = s.area() / coverage;
        System.out.println("Computing for " + s);
        return amount;
    }
}
