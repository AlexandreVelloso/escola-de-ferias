public class SumCalculatorOutputter {

    protected AreaCalculator shapes;

    public SumCalculatorOutputter(AreaCalculator shapes) {
        this.shapes = shapes;
    }

    public String string() {
        return "Sum of the areas of provided shapes: " + shapes.sum();
    }
}