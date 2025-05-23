package DescontoProdutos.src;

import java.util.Scanner;

public class DescontoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o preço unitario: ");
        double preco = scanner.nextDouble();

        System.out.println("Digite a Quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double total = preco * quantidade;
        double desconto = 0.0;


        if (quantidade >= 11 && quantidade <= 20) {
            desconto = 0.10;
        } else if (quantidade >= 21 && quantidade <= 50) {
            desconto = 0.20;
        } else if (quantidade > 50) {
            desconto = 0.25;
        }


        double valorDesconto = total * desconto;
        double valorFinal = total - valorDesconto;
        System.out.println("\n=== RESUMO DA COMPRA ===");
        System.out.println("Produto: " + nome);
        System.out.printf("Total a pagar: R$ %.2f\n", valorFinal);
        System.out.println("Valor do desconto: " + valorDesconto);

        scanner.close();
    }
}




