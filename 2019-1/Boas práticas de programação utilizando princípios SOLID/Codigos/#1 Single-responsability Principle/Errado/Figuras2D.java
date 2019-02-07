public class Figuras2D {

    public static double calculaAreaQuadrado(double lado) {
        return Math.pow(lado, 2);
    }

    public static double calculaAreaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    public static double calculaAreaRetangulo(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public static void mostraArea(double area) {
        System.out.println("O valor da area e' " + area);
    }

    public static void main(String[] args) {
        double areaQuadrado = calculaAreaQuadrado(5);
        double areaCirculo = calculaAreaCirculo(3);
        double areaRetangulo = calculaAreaRetangulo(2, 3);

        mostraArea(areaQuadrado);
        mostraArea(areaCirculo);
        mostraArea(areaRetangulo);
    }
}