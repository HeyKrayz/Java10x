package MiddleLevel.Enums;
public enum RankDeMissoes {
    D ("Baixo", 2),
    C ("Normal", 5),
    B("Médio", 8),
    A ("Dificil", 15),
    S ("Muito dificil", 30);

    private String Descricao;
    private int Dificuldade;


    private RankDeMissoes (String Descricao, int Dificuldade) {
        this.Descricao = Descricao;
        this.Dificuldade = Dificuldade;
    }
}