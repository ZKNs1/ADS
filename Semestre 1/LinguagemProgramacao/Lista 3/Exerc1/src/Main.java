import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double valor = scanner.nextDouble();

        for(int i = 0; i <= 10; i++){
            result = valor * i;
            System.out.println("A multiplicação de "+ valor +" por " +i+" é: "+ result);
        }

    }
}