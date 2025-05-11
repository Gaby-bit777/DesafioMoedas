package org.example;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MoedaConverter {
    public static <Gson> void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (true) {
            System.out.println("Digite a moeda base (ex: USD, EUR, ou 'sair' para encerrar): ");
            String moedaBase = leitura.nextLine();

            if (moedaBase.equalsIgnoreCase("sair")) {
                break;
            }

            String endereco = "https://v6.exchangerate-api.com/v6/c6cad103df3826cdf057834b/latest/" + moedaBase;

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();

                System.out.println("Resposta JSON:\n" + json);

                Moeda moeda = gson.fromJson(json, Moeda.class);

                if (moeda.getConversionRates() != null) {
                    System.out.println("Valor em Reais (BRL): " + moeda.getConversionRates().getBRL());
                    System.out.println("Valor em Dólares (USD): " + moeda.getConversionRates().getUSD());
                    System.out.println("Valor em Euros (EUR): " + moeda.getConversionRates().getEUR());
                } else {
                    System.out.println("Erro: não foi possível obter as taxas de conversão.");
                }

            } catch (Exception e) {
                System.out.println("Erro ao realizar a conversão: " + e.getMessage());
            }
        }

        System.out.println("Programa encerrado.");
    }
}


