package EasyLevel.Condiçoes;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("1 - naruto \n 2 - sasuke \n 3 - rock lee \n 4 - shikamaru");
        System.out.print("Escolha um desses ninjas (usando o numero): ");

        int escolha = sc.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Naruto é o mais determinado");
            break;
            case 2:
                System.out.println ("Sasuke é o mais habilidoso no geral");
            break;
            case 3:
                System.out.println("Rock lee é o melhor personagem em combate fisico");
                break;
            case 4:
                System.out.println("Shikamaru é o personagem mais inteligente entre os demais da lista");
                break;
            default:
                System.out.println("voce digitou uma resposta que não é valida");
                break;
        }

        sc.close();
    }
}