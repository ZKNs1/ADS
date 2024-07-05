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

        if (media >= 50){
            System.out.println("Aprovado!");
        }

        else {
            System.out.println("Reprovado!");
        }

        System.out.println("Fim do programa!");
    }
}