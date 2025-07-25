package Desafios.Desafio6;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Ninja> NinjasList = new LinkedList<>();
        NinjasList.add (new Ninja("Naruto", 17, "Folha"));
        NinjasList.add (new Ninja("Sasuke", 17, "Folha"));
        NinjasList.add (new Ninja("Konohamaru", 14, "Folha"));
        NinjasList.add (new Ninja("Shikamaru", 17, "Folha"));
        NinjasList.add (new Ninja("Neji", 17, "Folha"));
        NinjasList.add (new Ninja("Gaara", 18, "Folha"));

        for (Ninja ninja : NinjasList) {
            System.out. println(ninja);
        }
        NinjasList.addFirst(new Ninja("Rock lee", 18, "Folha"));
        NinjasList.removeLast();
        NinjasList.addFirst(new Ninja("Boruto", 11, "Folha"));

        System.out.println("------------------------ Nova lista ------------------------");

        for (Ninja ninja : NinjasList) {
            System.out. println(ninja);
        }
    }
}