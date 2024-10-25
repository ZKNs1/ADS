import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, f;
        f=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        n = scanner.nextInt();

        for(int i=n; i>1; i--){
            f=f*i;
        }
        System.out.println("Fatorial = "+f);
    }
}