import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean situ1;
        boolean situ2;
        boolean situ3;
        boolean situ4;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double valorA = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double valorB = scanner.nextDouble();
        System.out.print("Digite o terceiro valor: ");
        double valorC = scanner.nextDouble();

        situ1 =  valorA > valorB && valorB> valorC;
        situ2 =  valorB > valorA && valorA > valorC;
        situ3 =  valorC > valorA && valorA > valorB;
        situ4 = valorC > valorB && valorB > valorA;

        if(situ1){
            System.out.println(valorC+" -> "+valorB+" -> "+valorA);
        }
        if(situ2){
            System.out.println(valorC+" -> "+valorA+" -> "+valorB);
        }
        if(situ3){
            System.out.println(valorB+" -> "+valorA+" -> "+valorC);
        }
        if(situ4){
            System.out.println(valorA+" -> "+valorB+" -> "+valorC);
        }
    }
}