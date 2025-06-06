package Desafios.Desafio3;
public class Ninja {
    String nome;
    String Missão;
    char NivelDeDificuldade;
    String StatusDaMissão;
    int idade;

    public void mostrarInformações () {
        System.out.println("Nome: " + nome + "\n Idade: " + idade + "\n Missão atual: " + Missão + "\n Nivel de missão: " + NivelDeDificuldade + "\n Status: "+ StatusDaMissão);
        System.out.println("-------------------------------------------------");
    }
}
