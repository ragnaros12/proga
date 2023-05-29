import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 99:");
        int number = scanner.nextInt();
        String word;
        if (number % 10 == 1 && number % 100 != 11) {
            word = "копейка";
        } else if ((number % 10 == 2 || number % 10 == 3 || number % 10 == 4) && (number % 100 < 10 || number % 100 >= 20)) {
            word = "копейки";
        } else {
            word = "копеек";
        }
        System.out.println(number + " " + word);
    }
}
