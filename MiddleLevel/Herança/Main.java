package MiddleLevel.Herança;

public class Main {
    public static void main(String[] args) {
        Sano M = new Sano();
        M.nome = "Manjiro sano";
        M.sexo = "Masculino";
        M.idade = 16;
        M.infor();
        M.DarkImpulse();
        M.espaço();

        Membros K = new Membros();
        K.nome = "ken ryuguji";
        K.sexo = "Masculino";
        K.idade = 17;
        K.infor();
        K.espaço();

        Membros T = new Membros();
        T.nome = "Takemichy hanagaki";
        T.sexo = "Masculino";
        T.idade = 15;
        T.infor();
    }
}
