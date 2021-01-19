import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] nums = new int[len];

        for (int i = 0; i < len; i++) {
            nums[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        int counter = 0;

        for (int n : nums) {
            if (n == target) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}