import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] seats = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                seats[i][j] = scanner.nextInt();
            }
        }

        int req = scanner.nextInt();
        int targetRow = 0;
        int count = 0;
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (seats[i][j] == 0) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == req && flag) {
                    targetRow = i + 1;
                    flag = false;
                }
            }
            count = 0;
        }

        System.out.println(targetRow);
    }
}