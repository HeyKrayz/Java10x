package EasyLevel.Condiçoes;
import java.util.Scanner;
public class Scanners {
    public static void main(String[] args) {
        Scanner CaixaDeMensagem = new Scanner(System.in);
        System.out.print("Qual nome do seu ninja: ");
        String nomeNinja = CaixaDeMensagem.nextLine();

        System.out.print("Qual a idade desse ninja: ");
        int idadeNinja = CaixaDeMensagem.nextInt();

        if (idadeNinja >= 18) {
            System.out.println("seu ninja já é adulto");
        } else {
            System.out.println("seu ninja é menor de idade ainda");
        }
        CaixaDeMensagem.close();
    }
}
