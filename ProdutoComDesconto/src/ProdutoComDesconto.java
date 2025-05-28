
    import java.util.Scanner;

    public class ProdutoComDesconto {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Digite o nome do produto: ");
            String nomeProduto = input.nextLine();

            System.out.print("Digite o preço unitário do produto (R$): ");
            double precoUnitario = input.nextDouble();

            System.out.print("Digite a quantidade comprada: ");
            int quantidade = input.nextInt();


            double valorTotal = precoUnitario * quantidade;


            double desconto = 0;

            if (quantidade > 50) {
                desconto = 0.25;
            } else if (quantidade >= 21) {
                desconto = 0.20;
            } else if (quantidade >= 11) {
                desconto = 0.10;
            }

            double valorFinal = valorTotal - (valorTotal * desconto);


            System.out.println("\n--- RESUMO DA COMPRA ---");
            System.out.println("Produto: " + nomeProduto);
            System.out.println("Quantidade: " + quantidade);
            System.out.printf("Preço unitário: R$ %.2f\n", precoUnitario);
            System.out.printf("Desconto aplicado: %.0f%%\n", desconto * 100);
            System.out.printf("Valor total a pagar: R$ %.2f\n", valorFinal);

            input.close();
        }
    }


