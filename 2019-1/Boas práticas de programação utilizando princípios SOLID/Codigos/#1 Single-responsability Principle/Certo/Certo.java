public class Certo {
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