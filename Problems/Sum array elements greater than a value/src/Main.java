import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = scanner.nextInt();
        }
        int max = scanner.nextInt();

        int sum = 0;
        for (int num : nums) {
            if (num > max) {
                sum += num;
            }
        }

        System.out.println(sum);

    }
}