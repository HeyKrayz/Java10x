package MiddleLevel.SobreEscrita;

public class InvestigadorSuzuya extends Investigadores {

    public InvestigadorSuzuya(String nome, int idade, String especialidade, int numeroDeMissoes, RankCCG Rank) {
        super(nome, idade,especialidade, numeroDeMissoes, Rank);
    }

    @Override
    public void estrategiaDeCombate() {
        System.out.println(nome + " usa sua foice ");
    }

    @Override
    public void arma() {
        System.out.println("Eu sou " + nome + " e uso uma " + especialidade + " como arma especial.");
    }
}