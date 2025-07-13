package MiddleLevel.HerançaMultipla;

public class Hatake extends Ninja implements Sharingan, Anbu {

    public void boasVindas () {
        System.out.println(nome + " eu sou um hatake!");
    }

    public void sharingan() {
        System.out.println(nome + " ativou o sharingan!");
    }

    public void ninjaDeElite () {
        System.out.println(nome + " agora é um ninja da anbu");
    }

}
