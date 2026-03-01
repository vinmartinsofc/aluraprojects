package alura;

import java.util.Scanner;

public class DesafioAntesOOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "Mano Deyvin";
        double saldo = 2500.0;
        double valueTransaction;
        int options = 0;
        double dailyLimit = 5000;

        while (options != 4) {

            System.out.println(" ===== Bem vindo ao Alura Bank! ===== \n");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Efetuar Deposito");
            System.out.println("3 - Efetuar Saque");
            System.out.println("4 - Sair");

            options = scanner.nextInt();

            if (options == 1) {
                System.out.println("Titular: " + name);
                System.out.println("Saldo: " + saldo);
                System.out.println("\n");
            }

            if (options == 2) {
                System.out.println("Valor a ser depositado?");
                valueTransaction = scanner.nextDouble();

                if (valueTransaction > dailyLimit) {
                    System.out.println("Valor diário excedido");
                } else {
                    saldo += valueTransaction;
                    System.out.println("Transação efetuada com sucesso!");
                    System.out.println("Saldo: " + saldo);
                    System.out.println("\n");
                }

            }

            if (options == 3) {
                System.out.println("Valor a sacar?");

                valueTransaction = scanner.nextDouble();

                if (valueTransaction > dailyLimit) {
                    System.out.println("Limite de transações diárias excedido");
                } else if (valueTransaction > saldo) {
                    System.out.println("Valor excede o limite do usuário.");
                    System.out.println("Transação inválida");
                } else {
                    saldo -= valueTransaction;
                    System.out.println("Transação efetuada com sucesso!");
                    System.out.println("Saldo: " + saldo);
                    System.out.println("\n");
                }

            }

            if (options == 4) {
                System.out.println("Leaving....");
            }

        }
    }

}
