import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Fatorial = " + fatorial(receber()));
    }

    static int receber() {
        Scanner in = new Scanner(System.in);
        int n;
        do {
            System.out.println("Digite um numero maior que 0:");
            n = in.nextInt();
        } while (n <= 0);
        return n;
    }

    static int fatorial(int n) {
        int resultado = 1;
        for (int i = n; i > 1; i--)
            resultado *= i;
        return resultado;
    }
}