public class Principal {
    public static void main(String[] args) {

        Figura2D[] figuras = new Figura2D[3];

        figuras[0] = new Quadrado(2);
        figuras[1] = new Circulo(3);
        figuras[2] = new Retangulo(2, 3);

        double somaAreas = 0.0;
        for( Figura2D figura : figuras){

            if( figura instanceof Quadrado ){

                somaAreas += Math.pow(((Quadrado)figura).lado, 2);

            }else if( figura instanceof Circulo ){

                somaAreas += Math.PI * Math.pow(((Circulo)figura).raio, 2);

            }else if( figura instanceof Retangulo ){

                somaAreas += ((Retangulo)figura).lado1 * ((Retangulo)figura).lado2;

            }
        }

        System.out.println("A soma das areas e' " + somaAreas);
    }
}