public class AreaCalculator {
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