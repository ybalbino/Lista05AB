package Bola;
public class Bola {
    double circunferencia;
    private String cor;
    private String marca;
    private String material;
    private Double velocidade;

    public Bola(double circunferencia, String cor, String marca, String material, Double velocidade) {
        this.circunferencia = circunferencia;
        this.cor = cor;
        this.marca = marca;
        this.material = material;
        this.velocidade = velocidade;
    }
    public void trocaCor(String novaCor) {
        this.cor = novaCor;
    }
    public void mostraCor() {
        System.out.println("A cor da bola é: " + this.cor);
    }
}
