import java.util.Scanner;

public class Exercicio17
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o valor da velocidade incial: ");
        double n1 = in.nextDouble();
        System.out.print("Digite o valor da aceleração: ");
        double n2 = in.nextDouble();
        System.out.print("Digite o valor do tempo de percurso: ");
        double n3 = in.nextDouble();
        double n4;
        n4 = n1 + n2 * n3;
        String resultado = String.format("%.2f", n4);
        System.out.println("A velocidade é:" + resultado);
    }
}