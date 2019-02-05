public class Circle implements ShapeInterface {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}