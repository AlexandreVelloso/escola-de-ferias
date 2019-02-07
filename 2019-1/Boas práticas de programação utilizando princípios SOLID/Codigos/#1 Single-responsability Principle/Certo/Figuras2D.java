public class Figuras2D {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        Circulo circulo = new Circulo(3);
        Retangulo retangulo = new Retangulo(2, 3);

        Print.mostraArea(quadrado.area());
        Print.mostraArea(circulo.area());
        Print.mostraArea(retangulo.area());
    }
}