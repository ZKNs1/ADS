import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double vRaiz;

        Scanner in = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double valor = in.nextDouble();

        if (valor >= 0){
           vRaiz = Math.sqrt(valor);
           String resultado = String.format("%.2f", vRaiz);
           System.out.println("O resultado da operação é:" + resultado);
        }

        else {
            System.out.println("Valor inválido!");
        }

        System.out.println("Fim do programa!");
    }
}