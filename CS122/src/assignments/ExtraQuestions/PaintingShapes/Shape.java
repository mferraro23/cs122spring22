package assignments.ExtraQuestions.PaintingShapes;

public abstract class Shape {
    String shapeName;

    public Shape(String name) {
        shapeName = name;
    }

    public abstract double area();

     public String toString() {
         return shapeName;
     }
}
