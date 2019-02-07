public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazBarulho() {
        System.out.println(this.nome + " diz: Au au!");
    }
}