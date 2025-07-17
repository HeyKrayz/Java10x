package MiddleLevel.GettersSetters;

public abstract class Ninja {

    private String nome;
    private int idade;
    private String aldeia;
    private int numeroDeMissoesConcluidas;
    private double altura;

    public Ninja () {

    }
    public Ninja (String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.altura = altura;
    }

    public String getNome (String nome) {
        return nome;
    }
    public int getIdade (int idade) {
        return idade;
    }
    public String getAldeia (String aldeia) {
        return aldeia;
    }
    public int getNumeroDeMissoesConcluidas (int numeroDeMissoesConcluidas) {
        return numeroDeMissoesConcluidas;
    }
    public double getAltura (double altura) {
        return altura;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }
    public void setIdade (int idade) {
        this.idade = idade;
    }
    public void setALdeia (String aldeia) {
        this.aldeia = aldeia;
    }
    public void setNumeroDeMissoesConcluidas (int numeroDeMissoesConcluidas) {
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    }
    public void altura (double altura) {
        this.altura = altura;
    }
}