import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double valorA = scanner.nextDouble();
        System.out.print("Digite um outro número: ");
        double valorB = scanner.nextDouble();
        System.out.print("Operações:\n1- Adição\n2- Subtração\n3- Multiplicação\n4- Divisão\nDigite o número da operação: ");
        int oper = scanner.nextInt();

        switch(oper){
            case 1: if(oper == 1){
                double adicao = valorA + valorB;
                System.out.println("O valor da adição é: "+adicao);
                break;
            }
            case 2: if(oper == 2){
                double subt = valorA - valorB;
                System.out.println("O valor da subtração é: "+subt);
                break;
            }
            case 3: if(oper== 3){
                double mult = valorA * valorB;
                System.out.println("O valor da multiplicação é: "+mult);
                break;
            }
            case 4: if(oper == 4){
                double div = valorA / valorB;
                System.out.println("O valor da divisão é: "+div);
                break;
            }
        }
    }
}