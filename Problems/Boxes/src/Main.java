import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] box1 = new int[3];
        int[] box2 = new int[3];

        for (int i = 0; i < 3; i++) {
            box1[i] = scanner.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            box2[i] = scanner.nextInt();
        }

        Arrays.sort(box1);
        Arrays.sort(box2);

        boolean box1Bigger = true;
        boolean box2Bigger = true;

        for (int i = 0; i < 3; i++) {
            if (box1[i] < box2[i]) {
                box1Bigger = false;
            } else if (box1[i] > box2[i]) {
                box2Bigger = false;
            }
        }

        if (box1Bigger && !box2Bigger) {
            System.out.println("Box 1 > Box 2");
        } else if (!box1Bigger && box2Bigger) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}