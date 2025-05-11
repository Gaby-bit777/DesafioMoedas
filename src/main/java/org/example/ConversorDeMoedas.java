package org.example;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        // Taxas de câmbio
        double realParaDolar = 5.00;
        double dolarParaEuro = 0.85;
        double euroParaReal = 6.20;

        // Valor a ser convertido
        double valor = 100.00;

        // Conversão de real para dólar
        double valorEmDolares = valor / realParaDolar;
        System.out.println("Valor em dólares: " + valorEmDolares);

        // Conversão de real para euro
        double valorEmEuros = valor / euroParaReal;
        System.out.println("Valor em euros: " + valorEmEuros);

        // Conversão de dólar para real
        double valorEmReais = valor * realParaDolar;
        System.out.println("Valor em reais: " + valorEmReais);

        // Conversão de dólar para euro
        double valorEmEurosDeDolar = valor * (realParaDolar / euroParaReal);
        System.out.println("Valor em euros (de dólar): " + valorEmEurosDeDolar);

        // Conversão de euro para real
        double valorEmReaisDeEuro = valor * euroParaReal;
        System.out.println("Valor em reais (de euro): " + valorEmReaisDeEuro);

        // Conversão de euro para dólar
        double valorEmDolaresDeEuro = valor * (euroParaReal / realParaDolar);
        System.out.println("Valor em dólares (de euro): " + valorEmDolaresDeEuro);
    }
}


