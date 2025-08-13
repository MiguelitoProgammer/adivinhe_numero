import java.util.Random;
import java.util.Scanner;

public class AdivinheNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // numero entre 1 a 100 será gerado
        int tentativas = 0;
        int palpite;

        System.out.println("Bem vindo ao jogo de adivinhar o número!");
        System.out.println("Tente adivinhar o número de 1 a 100.");

        do {
            System.out.println("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente outro numéro.");
            } else if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente outro número.");
            } else {
                System.out.println("Paraéns! Você acertou o número secreto em " + tentativas + " tentativas.");
            }
        } while (palpite != numeroSecreto);

        scanner.close();


    }
}
