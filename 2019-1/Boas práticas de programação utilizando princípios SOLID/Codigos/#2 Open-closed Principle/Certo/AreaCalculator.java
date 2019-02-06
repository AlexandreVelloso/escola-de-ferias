public class AreaCalculator {
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