public class Principal {

    public static void main(String[] args) {

        Animal[] animais = new Animal[2];
        
        animais[0] = new Cachorro("rex");
        animais[1] = new Gato("mingau");

        for (int i = 0; i < animais.length; i++) {

            if (animais[i] instanceof Cachorro) {
                System.out.println(animais[i].nome + " diz: Au au!");
            } else if (animais[i] instanceof Gato) {
                System.out.println(animais[i].nome + " diz: Miau!");
            } else {
                animais[i].fazBarulho();
            }
        }
    }
}