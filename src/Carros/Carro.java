package Carros;

public class Carro {
    private int quantidadePortas;
    private String modelo;
    private String marca;
    private double potencia;

    public Carro(int quantidadePortas, String modelo, String marca) {
        this.quantidadePortas = quantidadePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = 2.0;
    }

    public Carro(int quantidadePortas, String modelo, String marca, double potencia) {
        this.quantidadePortas = quantidadePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public void ligarCarro() {
        System.out.println("O carro está ligado.");
    }
}