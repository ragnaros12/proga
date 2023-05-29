import java.util.Scanner;

public class Arrayss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1) {
                    array[i][j] = 1;
                } else if (i + j > n - 1) {
                    array[i][j] = 2;
                }
            }
        }

        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }


}
