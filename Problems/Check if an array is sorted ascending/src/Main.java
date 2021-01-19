import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] array = new int[len];

        boolean broken = true;
        array[0] = scanner.nextInt();

        for (int i = 1; i < len; i++) {
            array[i] = scanner.nextInt();
            if (array[i] < array[i - 1]) {
                broken = false;
            }
        }

        System.out.println(broken);
    }
}