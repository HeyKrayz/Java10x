package MiddleLevel.Objetos;
public class Ninja {
    String nome;
    String aldeia;
    int idade;

    public void Shanringan() {
        System.out.println("Sharingan Ativado!");
    }
    public String MyNameIS() {
        return "Eu sou o naruto";
    }
    public int IdadeParaSerHokage(int IdadeMinimaParaSerHokage) {
        return IdadeMinimaParaSerHokage - idade;
    }
}

