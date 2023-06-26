package ContaCorrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("123456", "João");
        ContaCorrente conta2 = new ContaCorrente("987654", "Maria", 1000.0);

        conta1.depositoConta(500.0);
        conta1.saqueConta(200.0);

        conta2.depositoConta(100.0);
        conta2.saqueConta(1500.0);
    }
}
