public class JogadorFutebol implements IAtleta, IJogadorFutebol {
    String nome;

    public JogadorFutebol(String nome) {
        this.nome = nome;
    }

    public void jogaFutebol() {
        System.out.println("Joga futebol");
    }

    public String getNome() {
        return this.nome;
    }
}