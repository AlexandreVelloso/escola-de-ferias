public class Quadrado extends Figura2D{
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double area() {
        return Math.pow(lado, 2);
    }
}