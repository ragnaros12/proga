import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] array = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = ".";
            }
        }

        int middle = n / 2;
        for (int i = 0; i < n; i++) {
            array[middle][i] = "*";
            array[i][middle] = "*";
            array[i][i] = "*";
            array[i][n - i - 1] = "*";
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
