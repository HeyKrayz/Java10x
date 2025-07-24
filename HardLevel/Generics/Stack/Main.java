package HardLevel.Stack;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        Array - gerenciar memoria
        String[] arrayNormal = new String [4];
//        List - memoria aumenta e diminiu sem precisar gerenciar,
        List<String> arrayList = new ArrayList<>();
//        Stack - o ultimo elemento a entrar se torna o primeiro da Stack
        Stack <String> StackNinja = new Stack<>();

        StackNinja.add("Naruto");
        StackNinja.push ("Sasuke");
        StackNinja.push ("Sakura");
        System.out.println("MInha stack - " + StackNinja);
        StackNinja.pop();
        System.out.println("Minha stack atualizada - " + StackNinja);
        System.out.println("Tamanho da stack - " + StackNinja.size());
    }
}
