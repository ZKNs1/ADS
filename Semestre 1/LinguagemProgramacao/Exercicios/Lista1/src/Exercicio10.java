import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a velocidade em milhas: ");
        double n1 = in.nextDouble();
        double n2;
        n2 = n1 / 0.6213;
        String resultado = String.format("%.2f", n2);
        System.out.println("Sua velocidade em quilômetros é: " + resultado);
    }
}