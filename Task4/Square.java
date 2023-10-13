package Task4;

public class Square implements Shape {
    private double sideLength;

    // double that represent the length of the square
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }
}
