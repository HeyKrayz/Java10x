package MiddleLevel.ClassesAbst;
public class Uzumaki extends Ninja {
    public Uzumaki(String Nome, int Idade, char Sexo) {
        super (Nome, Idade, Sexo);
    }

    @Override

    public void Poder () {
        System.out.println("Rasenga!");
    }
}
