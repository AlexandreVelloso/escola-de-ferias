public class Principal {

    public static void main(String[] args) {

        Animal[] animais = new Animal[2];
        
        animais[0] = new Cachorro("rex");
        animais[1] = new Gato("mingau");

        for (int i = 0; i < animais.length; i++) {

            animais[i].fazBarulho();
        }
    }
}