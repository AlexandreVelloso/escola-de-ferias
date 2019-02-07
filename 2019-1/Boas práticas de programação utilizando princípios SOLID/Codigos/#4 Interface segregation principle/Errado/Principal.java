public class Principal {

    public static void main(String[] args) {
        IAtleta[] atletas = new IAtleta[3];

        atletas[0] = new JogadorFutebol("neymar");
        atletas[1] = new Nadador("Felps");
        atletas[2] = new JogadorVolei("Giba");

        for (IAtleta atleta : atletas) {

            System.out.println("Nome: " + atleta.getNome());

            atleta.nada();
            atleta.jogaFutebol();
            atleta.jogaVolei();

            System.out.println(".............");
        }
    }
}