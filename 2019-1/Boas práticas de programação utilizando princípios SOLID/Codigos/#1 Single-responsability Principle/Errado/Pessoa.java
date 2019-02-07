public class Pessoa {
    private String email;
    private String nome;
    private String senha;

    public Pessoa(String email, String nome, String senha) {
        this.email = email;
        this.nome = nome;
        this.senha = senha;
    }

    public void seApresenta(){
        System.out.println("Ola, meu nome e' " + this.nome);
    }

    public boolean isEmailValido(){
        // Fazer validacao

        return true;
    }

    public boolean isSenhaSegura(){
        // Fazer validacao

        return true;
    }
}