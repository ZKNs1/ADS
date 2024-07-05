import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um comprimento em polegada: ");
        double n1 = in.nextDouble();
        double n2;
        n2 = n1 * 25.4;
        String resultado = String.format("%.2f", n2);
        System.out.println("Seu comprimento em metro é: " + resultado);
    }
}