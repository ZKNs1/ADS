import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Digite um número inteiro positivo maior que 0: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int soma = calcularSoma(n);
        System.out.println("A soma de todos os números inteiros de 1 até " + n + " é: " + soma);

        scanner.close();
    }

    public static int calcularSoma(int n) {
        if (n == 1) {
            return 1;
        }
        return n + calcularSoma(n - 1);
    }
}