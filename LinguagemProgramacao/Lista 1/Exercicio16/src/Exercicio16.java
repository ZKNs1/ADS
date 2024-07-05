import java.util.Scanner;

public class Exercicio16
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o valor do raio ");
        double n1 = in.nextDouble();
        System.out.print("Digite o valor da altura: ");
        double n2 = in.nextDouble();
        double n3;
        n3 = (3.14 * (n1 * n1) * n2)/3;
        System.out.println("O volume do cone é:" + n3);
    }
}