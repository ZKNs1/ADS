import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double result;
        double i=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double valor = scanner.nextDouble();

        result = valor++;

        System.out.println("A tabuada é: " +result);

    }
}