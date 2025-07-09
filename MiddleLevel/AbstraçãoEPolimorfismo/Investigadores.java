package MiddleLevel.AbstraçãoEPolimorfismo;

public abstract class Investigadores implements Estrategia {
    protected String nome;
    protected int idade;
    protected char rank;
    protected String especialidade;

    public Investigadores(String nome, int idade, char rank, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.rank = rank;
        this.especialidade = especialidade;
    }

    public void arma() {
        System.out.println("Eu sou " + nome + " e minha arma é " + especialidade);
    }
}