import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] array = new int[len];
        array[0] = scanner.nextInt();
        int min = array[0];
        for (int i = 1; i < len; i++) {
            array[i] = scanner.nextInt();
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println(min);
    }
}