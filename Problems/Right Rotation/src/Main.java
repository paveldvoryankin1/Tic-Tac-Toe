import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numsStr = scanner.nextLine();
        String[] numsArray = numsStr.split(" ");
        int rot = scanner.nextInt() % numsArray.length;

        for (int i = numsArray.length - rot; i < numsArray.length; i++) {
            System.out.print(numsArray[i] + " ");
        }
        for (int i = 0; i < numsArray.length - rot; i++) {
            System.out.print(numsArray[i] + " ");
        }


    }
}