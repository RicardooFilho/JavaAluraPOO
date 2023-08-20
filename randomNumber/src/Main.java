import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        Integer attemps = 0;
        Integer number = new Random().nextInt(100);
        Integer userAttempt = 0;

        System.out.println("TENTE ADIVINHAR O NÚMERO SORTEADO!!!");

        for (int i = 0; i < 5; i++) {
            System.out.println("Tentativa " + (i + 1));
            userAttempt = scanner.nextInt();
            if (userAttempt == number) {
                System.out.println("Parabéns, você acertou! O número sorteado era: " + number);
                break;
            }
        }

        if (userAttempt != number) {
            System.out.println("Suas tentativas acabaram :(");
        }
    }
}