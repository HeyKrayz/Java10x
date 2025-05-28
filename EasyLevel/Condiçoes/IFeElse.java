package EasyLevel.Condiçoes;

public class IFeElse {
    public static void main (String []args) {
        String Rank;
        String nome = "Naruto";
        int idade = 16;
        boolean HOkage = false;
        short NumeroDeMissoes = 29;

        if (NumeroDeMissoes >= 10 && idade > 15) {
            Rank = "Chunnin";
            System.out.println(nome + " esta pronto para passa de nivel!");
            System.out.println("agora o " + nome + " esta no Rank: " + Rank);
        }
        else if (NumeroDeMissoes >= 20) {
            Rank = "Jounin";
            System.out.println("agora o " + nome + " é de nivel " + Rank);
        }
        else {
            Rank = "Gennim";
            System.out.println(nome + " não ta pronto para passar!");
            System.out.println("então ele vai continuar sendo " + Rank);
        }
    }
}
