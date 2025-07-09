package MiddleLevel.ClassesAbst;

public class Uchiha extends Ninja{
    public Uchiha(String Nome, int Idade, char Sexo) {
        super(Nome, Idade, Sexo);
    }

    @Override
    public void Poder () {
        System.out.println("Amaterasu!");
    }
}
