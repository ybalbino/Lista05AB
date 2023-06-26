package Retangulo;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo(4.0, 6.0);
        Retangulo retangulo2 = new Retangulo(5.0, 5.0);

        retangulo1.mudarValorLados(7.0, 8.0);
        System.out.println("Lados do retângulo 1: " + retangulo1.retornarValorLados());
        System.out.println("Área do retângulo 1: " + retangulo1.calcularArea());
        System.out.println("Perímetro do retângulo 1: " + retangulo1.calcularPerimetro());

        System.out.println("Lados do retângulo 2: " + retangulo2.retornarValorLados());
        System.out.println("Área do retângulo 2: " + retangulo2.calcularArea());
        System.out.println("Perímetro do retângulo 2: " + retangulo2.calcularPerimetro());
    }
}
