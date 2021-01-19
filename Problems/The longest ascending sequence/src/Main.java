import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] nums = new int[len];

        int count = 1;
        int countMax = 1;
        nums[0] = scanner.nextInt();
        for (int i = 1; i < len; i++) {
            nums[i] = scanner.nextInt();
            if (nums[i] > nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > countMax) {
                countMax = count;
            }
        }

        System.out.println(countMax);
    }
}