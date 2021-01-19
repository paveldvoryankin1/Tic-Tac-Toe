import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] sud = new int[n * n][n * n];
        for (int i = 0; i < n * n; i++) {
            for (int j = 0; j < n * n; j++) {
                sud[i][j] = scanner.nextInt();
            }
        }

        boolean solved = true;

        for (int i = 0; i < n * n; i++) {
            for (int j = 0; j < n * n; j++) {
                if (sud[i][j] < 1 || sud[i][j] > n * n) {
                    solved = false;
                }
            }
        }


        if (solved) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}