package Task4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);

        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShape((Shape) circle);
        shapeBuilder.addShape(square);


        double totalArea = shapeBuilder.getTotalArea();
        System.out.println("The Total Area of the Shapes are: " + totalArea);
    }
}