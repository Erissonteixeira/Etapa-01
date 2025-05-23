import java.util.Random;
import java.util.Scanner;

public class Jokenpo {
    public static void main(String[] args) {
        int jogador, computador;
        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();

        System.out.println("_____JokenPô______");
        System.out.println("");
        System.out.println("1. PEDRA");
        System.out.println("2. PAPEL");
        System.out.println("3. TESOURA");
        System.out.println("Digite a opção desejada");

        jogador = teclado.nextInt();
        System.out.println("__________________");

        switch (jogador) {
            case 1:
                System.out.println("Jogador escolheu, PEDRA");
                break;
            case 2:
                System.out.println("Jogador escolheu, PAPEL");
                break;
            case 3:
                System.out.println("Jogador escolheu, TESOURA");
                break;
            default:
                System.out.println("A opção é inválida");
                teclado.close();
                return;
        }

        computador = gerador.nextInt(3) + 1;

        switch (computador) {
            case 1:
                System.out.println("Computador escolheu, PEDRA");
                break;
            case 2:
                System.out.println("Computador escolheu, PAPEL");
                break;
            case 3:
                System.out.println("Computador escolheu, TESOURA");
                break;
        }


        if (jogador == computador) {
            System.out.println("Empate");
        } else if ((jogador == 1 && computador == 3) ||
                (jogador == 2 && computador == 1) ||
                (jogador == 3 && computador == 2)) {
            System.out.println("Jogador venceu");
        } else {
            System.out.println("Computador venceu");
        }

        teclado.close();
    }
}