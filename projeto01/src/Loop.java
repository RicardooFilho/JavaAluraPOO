import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        Double ratingMedia = (double) 0;
        Double grade = (double) 0;


        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme: ");
            grade = reading.nextDouble();
            ratingMedia += grade;
        }

        System.out.println("Média das avaliações: " + String.format("%.2f", ratingMedia / 3));
    }
}
