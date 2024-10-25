import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        double valor;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor para o coeficiente a: ");
        double valorA = scanner.nextInt();
        System.out.print("Digite um valor para o coeficiente b: ");
        double valorB = scanner.nextInt();
        scanner.close();

        valor = (0-valorB)/valorA;
        String resultado = String.format("%.2f", valor);

        System.out.println("O valor de x é: " + resultado);
    }
}