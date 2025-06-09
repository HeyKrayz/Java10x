package Desafios.Desafios4;

public class NinjaBasico implements Ninja {
    String Nome;
    int Idade;
    String Habilidade;

    public NinjaBasico (String Nome, int Idade, String Habilidade) {this.Nome = Nome; this.Idade = Idade; this.Habilidade = Habilidade; }

    @Override
    public void ExibirInformações () {
        System.out.println("Nome: " + Nome + "\n Idade: "+ Idade + "\n Minha habilidade é: " + Habilidade);
    }
    public void Habilidade() {
        System.out.println("Habilidade " + Habilidade + " foi usada!");
    }
}
