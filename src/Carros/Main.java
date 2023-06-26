package Carros;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro(4, "Civic", "Honda");
        Carro carro2 = new Carro(2, "Mustang", "Ford", 5.0);

        carro1.ligarCarro();
        carro2.ligarCarro();
    }
}


