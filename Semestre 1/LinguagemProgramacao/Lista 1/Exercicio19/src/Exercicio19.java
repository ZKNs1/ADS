import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        double resultado1;
        double resultado2;
        double expoente = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor para o coeficiente a: ");
        double valorA = scanner.nextInt();
        System.out.print("Digite um valor para o coeficiente b: ");
        double valorB = scanner.nextInt();
        System.out.print("Digite um valor para o coeficiente c: ");
        double valorC = scanner.nextInt();
        scanner.close();

        resultado1 = (valorB + Math.sqrt(Math.pow(valorB, expoente) - 4 * valorA * valorC))/ 2*valorA;
        resultado2 = (valorB - Math.sqrt(Math.pow(valorB, expoente) - 4 * valorA * valorC))/ 2*valorA;
        String resultado = String.format("%.2f", resultado1);
        String resultados = String.format("%.2f", resultado2);

        System.out.println("O valor de uma raiz é (b-): " + resultado1);
        System.out.println("O valor da outra raiz (b+) é: " + resultado2);
    }
}