package MiddleLevel.SobreEscrita;

public class Main {
    public static void main(String[] args) {
        Investigadores sasaki = new InvestigadorSasaki("sasaki", 21,  "ataque rapido", 20, RankCCG.RANK_3);
        Investigadores suzuya = new InvestigadorSuzuya("suzuya", 22, "flexibilidade", 32, RankCCG.RANK_ESPECIAL);
        Investigadores arima = new InvestigadorArima("Arima", 33, "força", 79, RankCCG.RANK_ESPECIAL);
        sasaki.estrategiaDeCombate();
        sasaki.arma();

        suzuya.estrategiaDeCombate();
        suzuya.arma();
    }
}