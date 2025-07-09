package MiddleLevel.AbstraçãoEPolimorfismo;

public class Main {
    public static void main(String[] args) {
       Investigadores sasaki = new InvestigadorSasaki("sasaki", 21, 'A', "ataque rapido");
       Investigadores suzuya = new InvestigadorSuzuya("suzuya", 22, 'S', "flexibilidade");

        sasaki.estrategiaDeCombate();
        sasaki.arma();

        suzuya.estrategiaDeCombate();
        suzuya.arma();
    }
}