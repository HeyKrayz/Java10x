package EasyLevel.Condiçoes;
public class Laço {
    public static void main(String[] args) {
        int NumeroDeClone = 0;
        int NumeroMaximoDeClone = 50;

        while (NumeroDeClone <= NumeroMaximoDeClone) {
            NumeroDeClone ++;
            System.out.println("O naruto fez " + NumeroDeClone + " das sombras");
        }

        for (int x = 0; x <= NumeroMaximoDeClone; x++) {
            System.out.println("O naruto fez "+ x + " das sombras");
        }
    }
}
