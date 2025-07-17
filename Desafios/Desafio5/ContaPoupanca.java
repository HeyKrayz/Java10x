package Desafios.Desafio5;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca (String nome, double saldo, TiposDeConta tiposDeConta) {
        super(nome,saldo,tiposDeConta);
    }
    @Override
    public double depositar (double valor) {
        valor = valor -(valor * 0.01);
        return saldo = saldo + valor;
    }
    @Override
    public String toString() {
        return nome + " Sua conta é do tipo " + tipoDaConta + " e seu saldo atual é de R$ " + saldo;
    }
}
