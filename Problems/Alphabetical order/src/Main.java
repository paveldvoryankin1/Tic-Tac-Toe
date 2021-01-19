import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String words = scanner.nextLine();

        String[] wordsArray = words.split(" ");

        boolean order = true;

        for (int i = 1; i < wordsArray.length; i++) {
            if (wordsArray[i - 1].compareTo(wordsArray[i]) > 0) {
                order = false;
            }
        }

        System.out.println(order);
    }
}