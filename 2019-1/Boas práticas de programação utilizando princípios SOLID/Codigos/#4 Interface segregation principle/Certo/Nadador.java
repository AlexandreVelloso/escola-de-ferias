public class Nadador implements IAtleta, INadador {
    String nome;

    public Nadador(String nome) {
        this.nome = nome;
    }

    public void nada() {
        System.out.println("nada");
    }

    public String getNome() {
        return this.nome;
    }
}