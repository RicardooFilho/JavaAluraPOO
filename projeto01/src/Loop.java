import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        Double ratingMedia = 0.00;
        Double grade =  0.00;


        for (int i = 0; i < 3; i++) {
            do {
                System.out.println("Diga sua " + (i + 1) + "ª avaliação para o filme: ");
                grade = reading.nextDouble();
            } while (grade < 0.00 || grade > 10.00);
            ratingMedia += grade;
        }

        System.out.println("Média das avaliações: " + String.format("%.2f", ratingMedia / 3));
    }
}
