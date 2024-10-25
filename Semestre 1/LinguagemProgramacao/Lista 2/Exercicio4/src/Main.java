import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double media;
        double medFinal;

        Scanner in = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double valor1 = in.nextDouble();
        System.out.print("Digite um outro valor: ");
        double valor2 = in.nextDouble();

        media = (valor1+valor2)/2;
        System.out.println("A média é: "+media);

        if (media >= 50){
            System.out.println("Aprovado!");
        }

        if (media < 50){
            System.out.print("Digite a nota da recuperação: ");
            double rec = in.nextDouble();
            medFinal = (media+rec)/2;
            if (medFinal >= 50){
                System.out.println("Aprovado!");
            }

            else{
                System.out.println("Reprovado!");
            }
        }

        System.out.println("Fim do programa!");
    }
}