import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um valor para a altura: ");
        double n1 = in.nextDouble();
        System.out.print("Digite um valor para a base: ");
        double n2 = in.nextDouble();
        double n3;
        n3 = (n1 * n2) / 2;
        System.out.println("A área é:" + n3);
    }
}
