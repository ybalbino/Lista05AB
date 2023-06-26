package Jardinagem;

public class Main {
    public static void main(String[] args) {
        Jardinagem jardinagem = new Jardinagem("Meu Jardim", 100, 50, 10, 100, 5.0, 3.0, 2.5);
        double aduboUsado = jardinagem.usarAdubo();
        double precoAdubo = jardinagem.precoAdubo();
        double precoCorteGrama = jardinagem.precoCorteGrama();
        System.out.println("Quantidade de adubo usado: " + aduboUsado);
        System.out.println("Preço do adubo: R$" + precoAdubo);
        System.out.println("Preço do corte de grama: R$" + precoCorteGrama);
    }
}
