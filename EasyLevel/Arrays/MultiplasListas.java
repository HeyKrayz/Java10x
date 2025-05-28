package EasyLevel.Arrays;
public class MultiplasListas {
    public static void main(String[] args) {
        String [][] Ligas_E_Jogadores = new String [3][4];
        Ligas_E_Jogadores [0][0] = "Brasileirão";
        Ligas_E_Jogadores [0][1] = "Ganso";
        Ligas_E_Jogadores [0][2] = "Oscar";
        Ligas_E_Jogadores [0][3] = "Yuri alberto";

        Ligas_E_Jogadores [1][0] = "Laliga";
        Ligas_E_Jogadores [1][1] = "Pedri";
        Ligas_E_Jogadores [1][2] = "Griezmann";
        Ligas_E_Jogadores [1][3] = "Rodrygo";

        Ligas_E_Jogadores [2][0] = "Premier League";
        Ligas_E_Jogadores [2][1] = "Casemiro";
        Ligas_E_Jogadores [2][2] = "Son";
        Ligas_E_Jogadores [2][3] = "Haaland";

        for (int x = 0; x < Ligas_E_Jogadores.length; x++) {
            System.out.println(Ligas_E_Jogadores[2][x]);
        }
    }
}
