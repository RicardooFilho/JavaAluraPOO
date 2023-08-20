import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        Double ratingMedia = 0.00;
        Double grade = 0.00;
        Integer totalGrades = 0;
        Integer aux = 0;


        while (grade != -1) {
            do {
                System.out.println("Diga sua " + (aux + 1) + "ª avaliação para o filme ou digite -1 para encerrar: ");
                grade = reading.nextDouble();
                if (grade == -1) {
                    break;
                }
            } while (grade < 0.00 || grade > 10.00);

            if (grade != -1) {
                ratingMedia += grade;
                totalGrades++;
                aux++;
            }
        }

        if (ratingMedia != -1 && ratingMedia != 0) {
            System.out.println("Média das avaliações: " + String.format("%.2f", ratingMedia / totalGrades));
        }
    }
}
