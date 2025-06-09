package Desafios.Desafios4;

public class ninjaAvançado extends NinjaBasico implements Ninja {
    String Especial;

    public ninjaAvançado (String Nome, int Idade, String Habilidade, String Especial) {
        super (Nome,Idade, Habilidade);
        this.Especial = Especial;
    }

    @Override
    public void ExibirInformações () {
        super.ExibirInformações();
        System.out.println("A Habilidade unica do " + Nome + " é : " + Especial);
    }
}
