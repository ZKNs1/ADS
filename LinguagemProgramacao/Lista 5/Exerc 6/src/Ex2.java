import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Digite um número inteiro positivo: ");
            n = scanner.nextInt();
        } while (n < 0);

        int fatorial = calcularFatorial(n);
        System.out.println("O fatorial de " + n + " é: " + fatorial);

        scanner.close();
    }

    public static int calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFatorial(n-1);
    }
}