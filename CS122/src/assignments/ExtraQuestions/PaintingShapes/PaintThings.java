package assignments.ExtraQuestions.PaintingShapes;
import java.text.DecimalFormat;

public class PaintThings {
    public static void main(String[] args) {
        final double COVERAGE = 350;
        double patioAmount;
        double globeStatueAmount;
        double poolAmount;

        Paint paint = new Paint(COVERAGE);
        Rectangle patio = new Rectangle(50, 75);
        Sphere globeStatue = new Sphere(25);
        Cylinder pool = new Cylinder(20, 6);

        System.out.println("\nNumber of gallons of paint needed...");
        DecimalFormat fmt = new DecimalFormat("0.#");
        patioAmount = paint.computeAmount(patio);
        System.out.println("Patio: " + fmt.format(patioAmount));
        globeStatueAmount = paint.computeAmount(globeStatue);
        System.out.println("Basketball: " + fmt.format(globeStatueAmount));
        poolAmount = paint.computeAmount(pool);
        System.out.println("Pool: " + fmt.format(poolAmount));
    }
}
