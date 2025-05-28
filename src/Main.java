
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1, num2, resultado;
        int opcao;

        System.out.println("=== CALCULADORA === ");
        System.out.println("Escolha a operação: ");
        System.out.println("1 Adição (+) ");
        System.out.println("2 Subtração (-) ");
        System.out.println("3 multiplicação (*) ");
        System.out.println("4 divisão (/)");
        System.out.println("Digite a opção (1 a 4): ");
        opcao = scanner.nextInt();

        System.out.println("Digite o primeiro número");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo número");
        num2 = scanner.nextInt();

       switch (opcao) {
        case 1:
        resultado = num1 + num2;
        System.out.println("Resultado: " + resultado);
        break;

        case 2:
        resultado = num1 - num2;
        System.out.println("Resultado: " + resultado);
        break;

        case 3:
        resultado = num1 * num2;
        System.out.println("Resultado " + resultado);
        break;

           case 4:
               if(num2 != 0) {
                   resultado = num1 / num2;
                   System.out.println("Resultado: " + resultado);
               } else {
                   System.out.println("Erro: Divisão por zero!");
                   break;
               }
           default:
               System.out.println("Opção inválida !");
    }
    scanner.close();

    }
}