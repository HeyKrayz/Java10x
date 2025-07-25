package Desafios.Desafio6;

public class Ninja {
    private String nome;
    private int idade;
    private String vila;

    public Ninja() {
    }
    public Ninja(String nome, int idade, String vila) {
        this.nome = nome;
        this.idade = idade;
        this.vila = vila;
    }

    public String getNome (String nome) {
        return nome;
    }
    public int getIdade (int idade) {
        return idade;
    }
    public String getVila (String vila) {
        return vila;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    public void setIdade (int idade) {
        this.idade = idade;
    }
    public void setVila (String vila) {
        this.vila = vila;
    }


    @Override
    public String toString() {
        return "Meu nome é "
                + nome
                + " tenho "
                + idade
                + " anos"
                + " e sou da vila da "
                + vila;
    }
}