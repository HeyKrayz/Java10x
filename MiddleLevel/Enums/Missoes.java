package MiddleLevel.Enums;

public class Missoes {

    private String nome;
    private RankDeMissoes rank;

    public void exibirDetalhes () {
        System.out.println("Nome da missão: " + nome +" Rank: " + rank);
    }

    public Missoes (String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }
    public String getNome (String nome) {
        return nome;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
}
