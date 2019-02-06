public class Square implements ShapeInterface{
    protected double length;

    public Square(double length) {
        this.length = length;
    }

    public double area() {
        return Math.pow(this.length, 2);
    }
}