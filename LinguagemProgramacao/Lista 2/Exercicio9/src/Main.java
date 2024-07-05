import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        double soma;
        boolean cond;
        double sub;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira medida de um lado: ");
        double valorA = scanner.nextDouble();
        System.out.print("Digite a segunda medida de um lado: ");
        double valorB = scanner.nextDouble();
        System.out.print("Digite a terceira medida de um lado: ");
        double valorC = scanner.nextDouble();

        soma = valorB + valorC;
        sub = valorB - valorC;
        cond = valorA < soma && valorA > sub;

        if(cond){
            if(valorA == valorB && valorB == valorC) {
                System.out.println("O triângulo é equilátero!");
            }
            if(valorA == valorB && valorB != valorC){
                System.out.println("O triângulo é isósceles");
            }
            if(valorA == valorC && valorC != valorB){
                System.out.println("O triângulo é isósceles");
            }
            if(valorB == valorC && valorC != valorA){
                System.out.println("O triângulo é isósceles");
            }
            if(valorA != valorB && valorA != valorC && valorB != valorC){
                System.out.println("O triângulo é escaleno");
            }
        }

        else{
            System.out.println("Estes valores não formam um triângulo!");
        }

    }

}