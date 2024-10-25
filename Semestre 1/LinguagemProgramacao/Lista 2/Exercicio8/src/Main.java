import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num = scanner.nextDouble();

        if(num % 2 ==0){
            System.out.println("O número "+num +"é par");
        }
       else{
            System.out.println("O número "+num +"é ímpar");
        }
    }
}