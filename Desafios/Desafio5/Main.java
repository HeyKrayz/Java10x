package Desafios.Desafio5;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca conta1 = new ContaPoupanca("Gabriel", 120.00, TiposDeConta.POUPANÇA);
        ContaCorrente conta2 = new ContaCorrente("Davi", 12.50, TiposDeConta.CORRENTE);

        conta2.depositar(20);
        conta2.consultarSaldo();
        conta1.consultarSaldo();
    }
}
