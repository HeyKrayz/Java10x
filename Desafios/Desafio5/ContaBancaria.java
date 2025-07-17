package Desafios.Desafio5;

public abstract class ContaBancaria implements Conta{
    double saldo;
    TiposDeConta tipoDaConta;
    String nome;

    public void ContaBancaria () {}

    public ContaBancaria (String nome, double saldo, TiposDeConta tipoDaConta) {
        this.nome = nome;
        this.saldo = saldo;
        this.tipoDaConta = tipoDaConta;
    }
    @Override
    public void consultarSaldo () {
        System.out.println(nome + " Seu saldo atual é de R$ " + saldo);
    }
}