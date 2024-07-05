import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        double result1;
        double result2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor para a raiz 1: ");
        double raiz1 = scanner.nextInt();
        System.out.print("Digite um valor para a raiz 2: ");
        double raiz2 = scanner.nextInt();

        scanner.close();

        result1 = (raiz1+raiz2);
        result2 = raiz1 * raiz2;

        System.out.println("A equação é: x² - " + result1 + "x - " + result2 + " = 0");
    }
}