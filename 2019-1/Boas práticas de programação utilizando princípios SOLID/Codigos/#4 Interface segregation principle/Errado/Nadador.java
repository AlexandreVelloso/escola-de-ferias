public class Nadador implements IAtleta {
    String nome;

    public Nadador(String nome) {
        this.nome = nome;
    }

    public void nada() {
        System.out.println("nada");
    }

    public void jogaFutebol() {
        System.out.println("ERRO, jogador de futebol nao joga futebol");
    }

    public void jogaVolei() {
        System.out.println("ERRO, jogador de futebol nao joga volei");
    }

    public String getNome() {
        return this.nome;
    }
}