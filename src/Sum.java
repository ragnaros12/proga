import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumNeg = 0;
        double countNeg = 0;
        double sumNotNeg = 0;
        double countNotNeg = 0;

        while (true) {
            double num = scanner.nextDouble();
            if (num == -1000) {
                break;
            }
            if (num < 0) {
                sumNeg += num;
                countNeg++;
            }
            if (num > 0) {
                sumNotNeg += num;
                countNotNeg++;
            }
        }

        double average_negative = 0;
        if (countNeg > 0) {
            average_negative = sumNeg / countNeg;
        }

        double average_non_negative = 0;
        if (countNotNeg > 0) {
            average_non_negative = sumNotNeg / countNotNeg;
        }

        System.out.println("Среднее арифметическое отрицательных: " + average_negative);
        System.out.println("Среднее арифметическое положительных: " + average_non_negative);
    }
}
