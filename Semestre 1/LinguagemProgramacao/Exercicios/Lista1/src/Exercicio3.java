import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double num1 = in.nextDouble();
        double num2;
        num2 = num1 / 5;
        System.out.println("A quinta parte é: " + num2);
    }
}