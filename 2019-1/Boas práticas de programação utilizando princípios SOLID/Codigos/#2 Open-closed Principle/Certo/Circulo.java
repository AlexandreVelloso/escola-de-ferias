public class Circulo extends Figura2D{
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double area(){
        return Math.PI * Math.pow(this.raio, 2);
    }
}