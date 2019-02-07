public class Principal {

    public static void main(String[] args) {

        JogadorFutebol neymar = new JogadorFutebol("neymar");
        Nadador felps = new Nadador("Felps");
        JogadorVolei giba = new JogadorVolei("Giba");

        System.out.println("Nome: " + neymar.getNome());
        neymar.jogaFutebol();
        System.out.println(".............");

        System.out.println("Nome: " + felps.getNome());
        felps.nada();
        System.out.println(".............");

        System.out.println("Nome: " + giba.getNome());
        giba.jogaVolei();
        System.out.println(".............");
    }
}