import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o raio: ");
        double n1 = in.nextDouble();
        System.out.print("Digite outra nota: ");
        double n2 = in.nextDouble();
        double n3;
        n3 = (n1 * 1 + n2 * 2) / 3;
        System.out.println("A média é: " + n3);
    }
}