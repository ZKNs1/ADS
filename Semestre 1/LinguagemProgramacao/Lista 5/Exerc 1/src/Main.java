import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Soma = "+somar(receber()));
    }

    static int receber(){
        Scanner in = new Scanner(System.in);
        int n;
        do{
            System.out.println("Digite um numero maior que 0:");
            n=in.nextInt();
        }while(n<=0);
        return n;
    }

    static int somar(int n){
        int soma=0;
        for (int i=1;i<=n;i++)
            soma+=i;
        return soma;
    }

}