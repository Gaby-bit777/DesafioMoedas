package org.example;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double valor = 0.0;
        int opção = 0;

        while (opção != 8) {
            System.out.println("1. Consulte o valor que deseja converter");
            System.out.println("2. Converter de real para dólar");
            System.out.println("3. Converter de real para euro");
            System.out.println("4. Converter de dólar para real");
            System.out.println("5. Converter de dólar para euro");
            System.out.println("6. Converter de euro para real");
            System.out.println("7. Converter de euro para dólar");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            opção = leitura.nextInt();

            switch (opção) {
                case 1:
                    System.out.print("Digite o valor a ser convertido: ");
                    valor = leitura.nextDouble();
                    System.out.println("Valor digitado: " + valor);
                    break;
                case 2:
                    System.out.println("Valor em dólares: " + (valor / 5.00));
                    break;
                case 3:
                    System.out.println("Valor em euros: " + (valor / 6.20));
                    break;
                case 4:
                    System.out.println("Valor em reais: " + (valor * 5.00));
                    break;
                case 5:
                    System.out.println("Valor em euros: " + (valor * (5.00 / 6.20)));
                    break;
                case 6:
                    System.out.println("Valor em reais: " + (valor * 6.20));
                    break;
                case 7:
                    System.out.println("Valor em dólares: " + (valor * (6.20 / 5.00)));
                    break;
                case 8:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        leitura.close();
    }
}
