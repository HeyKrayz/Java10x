package MiddleLevel.Objetos;

public class main {
    public static void main(String[] args) {
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 17;
        Naruto.aldeia = "Folha";
        String chamandoMetodo = Naruto.MyNameIS();
        System.out.println(chamandoMetodo);

        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 17;
        Sasuke.aldeia = "Folha";
        Sasuke.Shanringan();
        int quantoTempoFalta = Sasuke.IdadeParaSerHokage ( 40);
        System.out.println("Voce tem " + Sasuke.idade + " anos então falta no minimo mais " + quantoTempoFalta + " anos para voce se tornar um hokage");
    }
}
