import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] matrix = new String[4][4];
        for (int i = 0; i < 4; i++) {
            matrix[i] = scanner.nextLine().split("");
        }

        boolean flag = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j].equals(matrix[i + 1][j]) && matrix[i][j].equals(matrix[i][j + 1]) && matrix[i][j].equals(matrix[i + 1][j + 1])) {
                    flag = false;
                }
            }
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}