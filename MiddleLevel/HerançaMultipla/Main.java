package MiddleLevel.HerançaMultipla;
public class Main {
    public static void main(String[] args) {
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke uchiha";
        Sasuke.aldeia = "Konoha";
        Sasuke.idade = 16;
        Sasuke.sharingan();

        Hatake kakashi = new Hatake ();
        kakashi.nome = "kakashi hatake";
        kakashi.aldeia = "konoha";
        kakashi.idade = 48;
        kakashi.boasVindas();
        kakashi.sharingan();
        kakashi.ninjaDeElite();
    }
}
