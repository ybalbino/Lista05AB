package Bola;
public class Main {
    public static void main(String[] args) {
        Bola bola1 = new Bola(5.6,"Preta","Adidas", "Sintetico", 15.0);
        Bola bola2 = new Bola(7.6,"Azul","Nike", "Couro", 10.3);

        System.out.println("Bola 1:");
        bola1.mostraCor();
        bola1.trocaCor("Amarela");
        bola1.mostraCor();

        System.out.println("Bola 2:");
        bola2.mostraCor();
        bola2.trocaCor("Verde");
        bola2.mostraCor();
    }
}