package Task4;

import java.util.ArrayList;

// 4.3 Create a class shape builder
public class ShapeBuilder {
    private ArrayList<Shape> shapes;

    public ShapeBuilder() {
        shapes = new ArrayList<>();
    }

    // Create a method addShape(Shape s) which is used to add new Shape objects.
    public void addShape(Shape s) {
        shapes.add(s);
    }

    // 4.4 Create the getTotalArea() method in the ShapeBuilder class, which returns the total area of all the Shape objects in the ArrayList.
    public double getTotalArea() {
        double totalArea = 0.0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}