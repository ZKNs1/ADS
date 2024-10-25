import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double n1 = in.nextDouble();
        double n2;
        n2 = (n1 * 9/5)+32;
        String resultado = String.format("%.2f", n2);
        System.out.println("Sua velocidade em Fahrenheit é: " + resultado);
    }
}