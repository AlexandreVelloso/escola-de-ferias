public class Circulo {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }
}