package Caixa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Caixa caixa = new Caixa();

        System.out.print("Quantos lançamentos deseja fazer? ");
        int numLancamentos = scanner.nextInt();

        for (int i = 1; i <= numLancamentos; i++) {
            System.out.print("Lançamento " + i + ": Crédito (C) ou Débito (D)? ");
            String tipo = scanner.next();

            if (tipo.equalsIgnoreCase("C")) {
                System.out.print("Digite o valor a ser creditado: ");
                double valor = scanner.nextDouble();
                caixa.credito(valor);
            } else if (tipo.equalsIgnoreCase("D")) {
                System.out.print("Digite o valor a ser debitado: ");
                double valor = scanner.nextDouble();
                caixa.debito(valor);
            }
        }

        System.out.println("Saldo final: R$" + caixa.getSaldo());

        scanner.close();
    }
}
