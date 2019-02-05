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

        for (Object shape : shapes) {
            if (shape instanceof Circle) {

                sum += Math.PI * Math.pow(((Circle) shape).radius, 2);
            } else if (shape instanceof Square) {

                sum += Math.pow(((Square) shape).length, 2);
            }
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

public class Errado {
    public static void main(String[] args) {
        Object[] shapes = new Object[3];

        shapes[0] = new Circle(2);
        shapes[1] = new Square(5);
        shapes[2] = new Square(6);

        AreaCalculator areas = new AreaCalculator(shapes);
        SumCalculatorOutputter output = new SumCalculatorOutputter(areas);

        System.out.println(output.string());
    }
}