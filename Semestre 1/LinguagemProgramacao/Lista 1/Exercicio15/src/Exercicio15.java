import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um valor para o raio: ");
        double n1 = in.nextDouble();
        System.out.print("Digite um valor para a altura: ");
        double n2 = in.nextDouble();
        double n3;
        n3 = (n1 * n1) * n2 * 3.14;
        System.out.println("A área do cilindro é:" + n3);
    }
}