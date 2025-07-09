package MiddleLevel.ClassesAbst;
abstract class Ninja {
    String Nome;
    int Idade;
    char Sexo;

    public Ninja (String Nome, int Idade, char Sexo) {
        this.Nome = Nome;
        this.Idade = Idade;
        this.Sexo = Sexo;
    }
    public abstract void Poder();
}
