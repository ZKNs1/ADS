import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double media;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double valor1 = in.nextDouble();
        System.out.print("Digite um outro valor: ");
        double valor2 = in.nextDouble();

        media = (valor1+valor2)/2;

        if (media >= 8.5){
            System.out.println("A");
        }

        if (media >= 7 && media < 8.5){
            System.out.println("B");
        }

        if (media >= 5 && media < 7){
            System.out.println("C");
        }

        if (media < 5){
            System.out.println("D");
        }

        System.out.println("Fim do programa!");
    }
}