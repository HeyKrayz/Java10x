package MiddleLevel.ClassesAbst;
public class Main {
    public static void main(String[] args) {
        Uchiha Sasuke = new Uchiha("Sasuke uchiha", 17, 'M');
        System.out.println("Nome: " + Sasuke.Nome + "\n Idade: "+ Sasuke.Idade + "\n Sexo: " + Sasuke.Sexo);
        Sasuke.Poder();

        System.out.println("-----------------------------------");

        Uzumaki Naruto = new Uzumaki("Naruto uzumaki", 16, 'M');
        System.out.println("Nome: " + Naruto.Nome + "\n Idade: " + Naruto.Idade + "\n Sexo: " + Naruto.Sexo);
        Naruto.Poder();
    }
}
