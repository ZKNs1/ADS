import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double valor1 = in.nextDouble();
        System.out.print("Digite um outro valor: ");
        double valor2 = in.nextDouble();

        if (valor1 > valor2){
            System.out.println("O maior valor é: "+ valor1);
        }

        else {
            System.out.println("O maior valor é: "+ valor2);
        }

        System.out.println("Fim do programa!");
    }
}