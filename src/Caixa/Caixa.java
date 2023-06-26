package Caixa;

public class Caixa {
    private double saldo;
    public Caixa() {
        this.saldo = 1000.0;
    }

    public void credito(double valor) {
        this.saldo += valor;
    }

    public void debito(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
