import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        boolean eprimo=true;

        for(int i =n-1; i>1; i--){
            if(n%i==0) {
                eprimo=false;
            }
        }
        if(eprimo) {
            System.out.println("É primo");
        }
        else{
            System.out.println("Não é primo");
        }
    }
}