package projetoBar.java;

import java.util.Scanner;

public class Bar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sexo (F ou M): ");
        char sexo = sc.next().toUpperCase().charAt(0);

        System.out.print("Quantidade de cervejas: ");
        int qtdCervejas = sc.nextInt();

        System.out.print("Quantidade de refrigerantes: ");
        int qtdRefrigerantes = sc.nextInt();

        System.out.print("Quantidade de espetinhos: ");
        int qtdEspetinhos = sc.nextInt();

        double precoIngresso = (sexo == 'M') ? 10.0 : 8.0;
        double precoCerveja = 5.0;
        double precoRefrigerante = 3.0;
        double precoEspetinho = 7.0;
        double couvertArtistico = 4.0;

        double consumo = (qtdCervejas * precoCerveja) + (qtdRefrigerantes * precoRefrigerante) + (qtdEspetinhos * precoEspetinho);

        if (consumo > 30.0) {
            couvertArtistico = 0.0;
        }

        double valorTotal = consumo + precoIngresso + couvertArtistico;

        System.out.println("\nRELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f%n", consumo);
        if (couvertArtistico == 0.0) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.printf("Couvert = R$ %.2f%n", couvertArtistico);
        }
        System.out.printf("Ingresso = R$ %.2f%n", precoIngresso);
        System.out.printf("Valor a pagar = R$ %.2f%n", valorTotal);

        sc.close();
    }
}
