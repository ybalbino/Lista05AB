package Pessoa;
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Marcos", 18, 170.0);
        Pessoa pessoa2 = new Pessoa("Marta", 25, 60.0, 160.0);

        pessoa1.envelhecer();
        pessoa1.engordar(5.0);
        pessoa1.emagrecer(2.0);
        pessoa1.crescer(1.0);

        pessoa2.envelhecer();
        pessoa2.engordar(3.0);
        pessoa2.emagrecer(1.5);
        pessoa2.crescer(0.5);

        System.out.println("========== Relatorio =============");
        pessoa1.mostrarInfo();
        pessoa2.mostrarInfo();

    }
}
