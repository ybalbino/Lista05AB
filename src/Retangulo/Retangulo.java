package Retangulo;

public class Retangulo {
    private double ladoA;
    private double ladoB;

    public Retangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public void mudarValorLados(double novoLadoA, double novoLadoB) {
        this.ladoA = novoLadoA;
        this.ladoB = novoLadoB;
    }

    public double retornarValorLados() {
        return this.ladoA;
    }

    public double calcularArea() {
        return this.ladoA * this.ladoB;
    }

    public double calcularPerimetro() {
        return 2 * (this.ladoA + this.ladoB);
    }
}
