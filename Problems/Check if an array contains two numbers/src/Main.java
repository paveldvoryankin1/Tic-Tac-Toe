import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] nums = new int[len];

        for (int i = 0; i < len; i++) {
            nums[i] = scanner.nextInt();
        }

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        boolean cont = false;

        for (int i = 1; i < len; i++) {
            if (nums[i - 1] == num1 && nums[i] == num2 || nums[i - 1] == num2 && nums[i] == num1) {
                cont = true;
            }
        }

        System.out.println(cont);
    }
}