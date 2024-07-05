import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maior = Integer.MIN_VALUE; // Inicializa com o menor valor possível
        int menor = Integer.MAX_VALUE; // Inicializa com o maior valor possível

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("O maior número digitado é: " + maior);
        System.out.println("O menor número digitado é: " + menor);

        scanner.close();
    }
}
