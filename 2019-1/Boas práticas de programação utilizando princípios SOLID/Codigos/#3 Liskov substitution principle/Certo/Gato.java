public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void fazBarulho() {
        System.out.println(this.nome + " diz: Miau!");
    }
}