package MiddleLevel.AbstraçãoEPolimorfismo;

public class InvestigadorSuzuya extends Investigadores {

    public InvestigadorSuzuya(String nome, int idade, char rank, String especialidade) {
        super(nome, idade, rank, especialidade);
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