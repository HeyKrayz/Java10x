package MiddleLevel.Enums;
public class Main {
    public static void main(String[] args) {
        Missoes missao1 = new Missoes("Resgate", RankDeMissoes.D);
        missao1.exibirDetalhes();

        Missoes missoes2 = new Missoes("Derrotar o Zabuza", RankDeMissoes.A);
        missoes2.exibirDetalhes();
    }
}