package MiddleLevel.AbstraçãoEPolimorfismo;

public class InvestigadorSasaki extends Investigadores {

    public InvestigadorSasaki(String nome, int idade, char rank, String especialidade) {
        super(nome, idade, rank, especialidade);
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

