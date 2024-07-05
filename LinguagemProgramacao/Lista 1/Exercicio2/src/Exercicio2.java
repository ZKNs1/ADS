import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int num1 = in.nextInt();
        int num2;
        num2 = num1 * num1;
        System.out.println("O quadrado é: " + num2);
    }
}