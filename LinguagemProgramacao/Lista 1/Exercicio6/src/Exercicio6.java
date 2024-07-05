import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma velocidade em m/s: ");
        double n1 = in.nextDouble();
        double n2;
        n2 = n1 * 3.6;
        String resultado = String.format("%.2f", n2);
        System.out.println("A velocidade em Km/h é: " + resultado + " Km/h");
    }
}