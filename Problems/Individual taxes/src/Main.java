import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] income = new double[n];
        double[] taxPercent = new double[n];

        for (int i = 0; i < n; i++) {
            income[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            taxPercent[i] = scanner.nextInt();
        }

        double maxTax = income[0] * taxPercent[0] / 100;
        int maxComp = 0;

        for (int i = 1; i < n; i++) {
            double taxCurr = income[i] * taxPercent[i] / 100;
            if (taxCurr > maxTax) {
                maxTax = taxCurr;
                maxComp = i;
            }
        }

        System.out.println(maxComp + 1);

    }
}