import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] nums = new int[len];

        for (int i = 0; i < len; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] numsNew = new int[len];
        numsNew[0] = nums[len - 1];
        System.out.print(numsNew[0] + " ");

        for (int i = 1; i < len; i++) {
            numsNew[i] = nums[i - 1];
            System.out.print(numsNew[i] + " ");
        }


    }
}