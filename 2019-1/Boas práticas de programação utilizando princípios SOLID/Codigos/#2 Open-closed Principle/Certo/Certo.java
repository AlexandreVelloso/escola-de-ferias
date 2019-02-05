interface ShapeInterface {
    public double area();
}

class Circle implements ShapeInterface {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}

class Square implements ShapeInterface{
    protected double length;

    public Square(double length) {
        this.length = length;
    }

    public double area() {
        return Math.pow(this.length, 2);
    }
}

class AreaCalculator {
    protected ShapeInterface[] shapes;

    public AreaCalculator(ShapeInterface[] shapes) {
        this.shapes = shapes.clone();
    }

    public double sum() {
        double sum = 0.0;

        for (ShapeInterface shape : shapes) {
            sum += shape.area();
        }

        return sum;
    }
}

class SumCalculatorOutputter {

    protected AreaCalculator shapes;

    public SumCalculatorOutputter(AreaCalculator shapes) {
        this.shapes = shapes;
    }

    public String string() {
        return "Sum of the areas of provided shapes: " + shapes.sum();
    }
}

public class Certo {
    public static void main(String[] args) {
        ShapeInterface[] shapes = new ShapeInterface[3];

        shapes[0] = new Circle(2);
        shapes[1] = new Square(5);
        shapes[2] = new Square(6);

        AreaCalculator areas = new AreaCalculator(shapes);
        SumCalculatorOutputter output = new SumCalculatorOutputter(areas);

        System.out.println(output.string());
    }
}