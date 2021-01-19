import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];

        int curr = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                matrix[i][j] = curr;
                curr++;
            }
            curr = 1;
            for (int j = i - 1; j >= 0; j--) {
                matrix[i][j] = curr;
                curr++;
            }
            curr = 0;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}