public class Principal {

    public static void main(String[] args) {
        String email = "pessoa@email.com";
        String senha = "1234";

        Pessoa pessoa = new Pessoa(email, "pessoa", senha);
        Validator validator = new Validator();

        if (validator.isEmailValido(email)) {
            System.out.println("O seu email e' valido");
        } else {
            System.out.println("Email invalido");
        }

        if (validator.isSenhaSegura(senha)) {
            System.out.println("Sua senha e' segura");
        } else {
            System.out.println("Sua senha nao e' segura, por favor crie outra");
        }
    }
}