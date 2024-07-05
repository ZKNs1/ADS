import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor para X: ");
        int x = scanner.nextInt();

        int y;
        do {
            System.out.print("Digite um valor para Y (Y>=zero): ");
            y = scanner.nextInt();
        } while (y < 0);

        System.out.println("O resultado de " + x + "^" + y + " é: " + calcPot(x, y));
    }

    public static long calcPot(int x, int y) {
        if (y == 0) {
            return 1;
        }
        long result = x;
        for (int i = 1; i < y; i++) {
            result *= x;
        }
        return result;
    }
}