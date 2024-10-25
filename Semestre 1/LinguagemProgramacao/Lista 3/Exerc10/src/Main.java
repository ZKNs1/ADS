import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, n1, n2, aux;
        n1 = 0;
        n2 = 1;
        System.out.print("Digite o limite esperado para a sequência de Fibonacci: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println(0);

        while (n2 < n) {
            System.out.println(n2);
            aux = n1;
            n1 = n2;
            n2 = aux + n2;

        }
    }
}