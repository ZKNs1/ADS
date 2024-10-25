import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double result1;
        double result2;
        double expoente = 2;
        double delta;
        double raiz;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor para o coeficiente a: ");
        double valorA = scanner.nextDouble();
        System.out.print("Digite um valor para o coeficiente b: ");
        double valorB = scanner.nextDouble();
        System.out.print("Digite um valor para o coeficiente c: ");
        double valorC = scanner.nextDouble();

        delta = Math.sqrt(Math.pow(valorB, expoente) - 4 * valorA * valorC);

        if (delta == 0){
            raiz = -valorB / (2 * valorA);
            System.out.println("A equação possui apenas uma raiz real: " +raiz);
        }

        else if (delta > 0){
            result1 = (valorB + delta)/ 2*valorA;
            result2 = (valorB - delta)/ 2*valorA;
            System.out.println("As raízes da equação são: "+result1+" e "+result2);
        }

        else{
            System.out.println("A equação não possui raízes reais.");
        }

        scanner.close();
    }
}