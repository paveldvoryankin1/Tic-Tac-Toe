import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] nums = new int[len];

        nums[0] = scanner.nextInt();
        nums[1] = scanner.nextInt();
        long maxProd = nums[0] * nums[1];
        for (int i = 2; i < len; i++) {
            nums[i] = scanner.nextInt();
            if (nums[i] * nums[i - 1] > maxProd) {
                maxProd = nums[i] * nums[i - 1];
            }
        }

        System.out.println(maxProd);
    }
}