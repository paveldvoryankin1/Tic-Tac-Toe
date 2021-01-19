import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean flag = true;
        for (int i = 1; i < len; i++) {
            if (nums[i - 1] == n && nums[i] == m || nums[i - 1] == m && nums[i] == n) {
                flag = false;
            }
        }

        System.out.println(flag);

    }
}