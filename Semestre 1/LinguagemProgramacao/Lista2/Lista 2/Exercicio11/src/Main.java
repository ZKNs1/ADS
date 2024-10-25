import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int valorA = scanner.nextInt();

        switch(valorA){
            case 1: if(valorA == 1){
                System.out.println("1- Domingo");
                break;
            }
            case 2: if(valorA == 2){
                System.out.println("2- Segunda-feira");
                break;
            }
            case 3: if(valorA == 3){
                System.out.println("3- Terça-feira");
                break;
            }
            case 4: if(valorA == 4){
            System.out.println("4- Quarta-feira");
                break;
            }
            case 5: if(valorA == 5){
                System.out.println("5- Quinta-feira");
                break;
            }
            case 6: if(valorA == 6){
                System.out.println("6- Sexta-feira");
                break;
            }
            case 7: if(valorA == 7){
                System.out.println("7- Sábado");
                break;
            }
        }
    }
}