package MiddleLevel.ArrayList;
import java.util.ArrayList;
import java.util.List;
public class Main_array {
    public static void main(String[] args) {
        String [] NinjaArray = new String [3];
        NinjaArray[0] = "Naruto";
        NinjaArray[1] = "Sasuke";
        NinjaArray[2] = "Sakura";

        List <String> NinjaList = new ArrayList<>();
        NinjaList.add ("Minato");
        NinjaList.add ("Itachi");
        NinjaList.add ("Nagato");

        System.out.println("Conteudo da List - " + NinjaList);

        NinjaList.remove ( "Itachi");
        NinjaList.set (2, "Naruto");

        System.out.println("Conteudo atualizado - " + NinjaList);
    }
}
