package Quadrado;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado1 = new Quadrado(5.0);
        Quadrado quadrado2 = new Quadrado(7.0);

        quadrado1.mudarValorLado(6.0);
        System.out.println("Lado do quadrado 1: " + quadrado1.retornarValorLado());
        System.out.println("Área do quadrado 1: " + quadrado1.calcularArea());

        System.out.println("Lado do quadrado 2: " + quadrado2.retornarValorLado());
        System.out.println("Área do quadrado 2: " + quadrado2.calcularArea());
    }
}
