import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] nums = new int[len];

        nums[0] = scanner.nextInt();
        int maxNum = nums[0];
        int maxInd = 0;

        for (int i = 1; i < len; i++) {
            nums[i] = scanner.nextInt();
            if (nums[i] > maxNum) {
                maxNum = nums[i];
                maxInd = i;
            }
        }

        System.out.println(maxInd);
    }
}