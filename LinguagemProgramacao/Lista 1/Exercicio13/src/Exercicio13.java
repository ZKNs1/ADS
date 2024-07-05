import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um raio: ");
        double n1 = in.nextDouble();
        double n2;
        n2 = 3.14 * (n1 * n1);
        System.out.println("A área do círculo é: " + n2);
    }
}