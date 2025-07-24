import java.util.LinkedList;
import java.util.Queue;

public class QueueFilas {
    public static void main(String[] args) {
//        queue filas
        Queue<String> ninjaQueue = new LinkedList<>();
        ninjaQueue.add ("Naruto");
        ninjaQueue.add ("Sasuke");
        ninjaQueue.add ("Sakura");
        ninjaQueue.add ("Kakashi");

        System.out.println("Fila - " + ninjaQueue);
        ninjaQueue.poll();
        System.out.println("Ninja da fila dps do - "+ ninjaQueue);

//        ver qm é o head da fila
        ninjaQueue.peek();

        System.out.println("Ninja do head: - " + ninjaQueue);
        ninjaQueue.add ("Hashirama");
        ninjaQueue.add ("Minato");

        if (ninjaQueue.isEmpty()) {
            System.out.println("fila está vazia.");
        }

    }
}
