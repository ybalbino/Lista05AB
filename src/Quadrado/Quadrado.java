package Quadrado;

public class Quadrado {
    private double tamanhoLado;

    public Quadrado(double tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }

    public void mudarValorLado(double novoTamanho) {
        this.tamanhoLado = novoTamanho;
    }

    public double retornarValorLado() {
        return this.tamanhoLado;
    }

    public double calcularArea() {
        return this.tamanhoLado * this.tamanhoLado;
    }
}
