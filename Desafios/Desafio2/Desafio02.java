package Desafios.Desafio2;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int NinjaCadastrado = 0;
        int NumeroMax = 10;
        String[] Ninja = new String[NumeroMax];
        int opcao = 0;
        while (true) {
            System.out.println("\n==== Menu Desafios.Desafio3.Ninja ====");
            System.out.println("1 - Cadastrar Desafios.Desafio3.Ninja");
            System.out.println("2 - Listar Ninjas");
            System.out.println("3 - Fechar Programa");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (NinjaCadastrado < NumeroMax) {
                        System.out.print("Digite o nome do seu ninja: ");
                        String nomeNinja = sc.nextLine();
                        Ninja[NinjaCadastrado] = nomeNinja;
                        NinjaCadastrado++;
                    } else {
                        System.out.println("A lista de ninjas está cheia.");
                    }
                    break;

                case 2:
                    if (NinjaCadastrado == 0) {
                        System.out.println("Nenhum ninja cadastrado ainda.");
                    } else {
                        System.out.println("===== Lista de Ninjas =====");
                        for (int i = 0; i < NinjaCadastrado; i++) {
                            System.out.println(Ninja[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Fechando o programa...");
                    sc.close();
                    break;

                default:
                    System.out.println("Essa opção não é válida.");
                    break;
            }
        }
    }
}
