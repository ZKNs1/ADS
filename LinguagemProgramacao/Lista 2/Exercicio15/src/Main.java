import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double troco;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o dinheiro:");
        double valor = scanner.nextDouble();
        System.out.print("Bebidas:\n1- Café Expresso  R$ 1,00\n2- Capuccino  R$ 1,50\n3- Chocolate  R$ 2,50\n4-Café com leite  R$ 1,50");
        System.out.print("\nDigite o dígito da bebida: ");
        int beb = scanner.nextInt();

        switch(beb){
            case 1: if(beb == 1){
                System.out.println("Bebida selecionada: Café expresso");
                troco = valor - 1;
                System.out.println("O seu troco é: "+troco);
                break;
            }
            case 2: if(beb == 2){
                System.out.println("Bebida selecionada: Capuccino");
                troco = valor - 1.5;
                System.out.println("O seu troco é: "+troco);
                break;
            }
            case 3: if(beb == 3){
                System.out.println("Bebida selecionada: Chocolate");
                troco = valor - 2.5;
                System.out.println("O seu troco é: "+troco);
            }
            case 4: if(beb == 4){
                System.out.println("Bebida selecionada: Café com leite");
                troco = valor - 1.5;
                System.out.println("O seu troco é: "+troco);
            }
        }
    }
}