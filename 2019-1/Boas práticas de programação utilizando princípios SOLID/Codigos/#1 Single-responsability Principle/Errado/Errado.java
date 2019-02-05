class Circle extends Object {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
}

class Square extends Object {
    protected double length;

    public Square(double length) {
        this.length = length;
    }
}

class AreaCalculator {
    protected Object[] shapes;

    public AreaCalculator(Object[] shapes) {
        this.shapes = shapes.clone();
    }

    public double sum() {
        double sum = 0.0;

        // TODO sum logic
        sum = 10.0;

        return sum;
    }

    public String output() {
        return "Sum of the areas of provided shapes: " + sum();
    }
}

public class Errado {
    public static void main(String[] args) {
        Object[] shapes = new Object[3];

        shapes[0] = new Circle(2);
        shapes[1] = new Square(5);
        shapes[2] = new Square(6);

        AreaCalculator areas = new AreaCalculator(shapes);

        System.out.println(areas.output());
    }
}