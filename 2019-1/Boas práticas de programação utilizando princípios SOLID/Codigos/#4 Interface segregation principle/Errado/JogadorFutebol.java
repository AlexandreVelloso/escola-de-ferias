public class JogadorFutebol implements IAtleta {
    String nome;

    public JogadorFutebol(String nome) {
        this.nome = nome;
    }

    public void nada() {
        System.out.println("ERRO, jogador de futebol nao nada");
    }

    public void jogaFutebol() {
        System.out.println("Joga futebol");
    }

    public void jogaVolei() {
        System.out.println("ERRO, jogador de futebol nao joga volei");
    }

    public String getNome() {
        return this.nome;
    }
}