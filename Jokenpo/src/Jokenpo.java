import java.util.Random;
import java.util.Scanner;

public class Jokenpo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== JOKENPÔ ===");
        System.out.println("Escolha uma opção:");
        System.out.println("0 - Pedra");
        System.out.println("1 - Papel");
        System.out.println("2 - Tesoura");
        System.out.print("Sua escolha: ");
        int jogador = scanner.nextInt();

        if (jogador < 0 || jogador > 2) {
            System.out.println("Escolha inválida. Tente novamente.");
            return;
        }

        int maquina = random.nextInt(3);

        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        System.out.println("Você escolheu: " + opcoes[jogador]);
        System.out.println("A máquina escolheu: " + opcoes[maquina]);

        if (jogador == maquina) {
            System.out.println("Empate!");
        } else if (
                (jogador == 0 && maquina == 2) ||
                        (jogador == 1 && maquina == 0) ||
                        (jogador == 2 && maquina == 1)
        ) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Você perdeu!");
        }
    }
}