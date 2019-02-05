public class Certo {
    public static void main(String[] args) {
        ShapeInterface[] shapes = new ShapeInterface[3];

        shapes[0] = new Circle(2);
        shapes[1] = new Square(5);
        shapes[2] = new Square(6);

        AreaCalculator areas = new AreaCalculator(shapes);
        VolumeCalculator volumes = new VolumeCalculator(shapes);

        SumCalculatorOutputter outputAreas = new SumCalculatorOutputter(areas);
        SumCalculatorOutputter outputVolumes = new SumCalculatorOutputter(volumes);

        System.out.println(outputAreas.string());
        System.out.println(outputVolumes.string());
    }
}