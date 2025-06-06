package Desafios.Desafio3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Ninja Boruto = new Ninja();
        Boruto.nome = "Boruto Uzumaki";
        Boruto.idade = 13;
        Boruto.Missão = "Espionagem em outra aldeia";
        Boruto.NivelDeDificuldade = 'S';
        Boruto.StatusDaMissão = "Concluida";

        Ninja Neji = new Ninja();
        Neji.nome = "Neji hyuuga";
        Neji.idade = 16;
        Neji.Missão = "Derrotar 5 bandidos";
        Neji.NivelDeDificuldade = 'A';
        Neji.StatusDaMissão = "em andamento";

        Uchiha Obito = new Uchiha();
        Obito.nome = "Obito Uchiha";
        Obito.idade = 29;
        Obito.Missão = "Ganhar a guerra";
        Obito.NivelDeDificuldade = 'S';
        Obito.StatusDaMissão = "em andamento";

        System.out.println("Escolha qual ninja deseja ver as informações: ");
        System.out.println("1 - boruto \n 2 - neji \n 3 - obito");

        Scanner sc = new Scanner(System.in);
        int escolher = sc.nextInt();
        switch (escolher) {
            case 1:
                System.out.println("as informações do ninja abaixo");
                Boruto.mostrarInformações();
                break;
            case 2:
                System.out.println();
                Neji.mostrarInformações();
                break;
            case 3:
                System.out.println();
                Obito.AtivarOSharingan();
                Obito.mostrarInformações();
                break;
            default:
                System.out.println("erro, tente novamente!");
        }
    }
}
