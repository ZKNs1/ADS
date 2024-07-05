import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int result;

        Scanner in = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int num1 = in.nextInt(); //Variável onde vai ser guardado o valor

        result = num1 * 2; //Conta
        System.out.println("O dobro é: " + result);
    }
}