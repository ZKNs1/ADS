import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite um outro número: ");
        int n2 = scanner.nextInt();

        if(n1>n2){
            int aux = n1;
            n1=n2;
            n2=aux;
        }
        for(int i =n1; i<=n2; i++){
            System.out.println(i);
        }
    }
}