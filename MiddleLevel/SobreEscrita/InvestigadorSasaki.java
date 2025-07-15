package MiddleLevel.SobreEscrita;

public class InvestigadorSasaki extends Investigadores {

    public InvestigadorSasaki(String nome, int idade, String especialidade, int numeroDeMissoes, RankCCG Rank) {
        super(nome, idade, especialidade, numeroDeMissoes, Rank);
    }

    @Override
    public void estrategiaDeCombate() {
        System.out.println(nome + " usa estratégia defensiva com kagune tipo rinkaku.");
    }

    @Override
    public void arma() {
        System.out.println("Eu sou " + nome + " e uso um " + especialidade + " como arma especial.");
    }
}

