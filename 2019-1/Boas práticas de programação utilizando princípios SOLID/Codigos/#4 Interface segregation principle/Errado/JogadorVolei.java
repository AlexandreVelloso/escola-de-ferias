public class JogadorVolei implements IAtleta {
    String nome;

    public JogadorVolei(String nome) {
        this.nome = nome;
    }

    public void nada() {
        System.out.println("ERRO, jogador de futebol nao nada");
    }

    public void jogaFutebol() {
        System.out.println("ERRO, jogador de futebol nao joga futebol");
    }

    public void jogaVolei() {
        System.out.println("Joga volei");
    }

    public String getNome() {
        return this.nome;
    }
}