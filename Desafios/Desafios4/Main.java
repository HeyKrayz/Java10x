package Desafios.Desafios4;

public class Main {
    public static void main(String[] args) {
        NinjaBasico Naruto = new NinjaBasico("Naruto Uzumaki", 16, "Clone da sombras");
        Naruto.ExibirInformações();
        Naruto.Habilidade();

        System.out.println("----------------------");
        ninjaAvançado Itachi = new ninjaAvançado("Itachi uchiha", 30, "Bola de fogo", "Amaterasu");
        Itachi.ExibirInformações();
        Itachi.Habilidade();

    }
}
