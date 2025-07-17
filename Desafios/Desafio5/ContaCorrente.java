package Desafios.Desafio5;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente (String nome, double saldo, TiposDeConta tiposDeConta) {
        super(nome, saldo, tiposDeConta);
    }
    @Override
    public double depositar (double valor) {
        return saldo = saldo + valor;
    }
    @Override
    public String toString () {
        return nome + " Sua conta é do tipo " + tipoDaConta + " O seu saldo é de " + saldo;
    }
}
