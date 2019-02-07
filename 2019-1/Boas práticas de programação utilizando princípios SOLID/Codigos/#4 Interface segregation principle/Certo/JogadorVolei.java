public class JogadorVolei implements IAtleta, IJogadorVolei {
    String nome;

    public JogadorVolei(String nome) {
        this.nome = nome;
    }

    public void jogaVolei() {
        System.out.println("Joga volei");
    }

    public String getNome() {
        return this.nome;
    }
}