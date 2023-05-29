import java.util.Scanner;

public class ChangerSign {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);


        int number = scanner.nextInt();
        boolean positive = number > 0;

        while (number != 0){
            boolean currentPositive = number > 0;
            if (currentPositive != positive) {
                count++;
                positive = currentPositive;
            }
            number = scanner.nextInt();
        }

        System.out.println(count); // выводим количество смен знака
    }

}
