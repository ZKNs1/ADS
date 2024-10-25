import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double total;
        double juros;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o valor da compra:");
        double valor = scanner.nextDouble();
        System.out.print("Método de pagamento:\n1- Débito\n2- Crédito\n3- Pix\n");
        System.out.print("Digite o dígito do método de pagamento: ");
        int pag = scanner.nextInt();
        System.out.print("Digite o número de parcelas: ");
        double parc = scanner.nextDouble();

        switch(pag){
            case 1: if(pag == 1){
                total = valor - (valor * 0.05) ;
                System.out.println("O valor a se pagar é: "+total);
                break;
            }
            case 2: if(pag == 2){
                if(parc > 4){
                    juros = valor * 0.05 * parc;
                    total = valor + juros;
                    System.out.println("O valor a se pagar é: "+total);
                }
                else{
                    juros = valor * 0.02 * parc;
                    total = valor + juros;
                    System.out.println("O valor a se pagar é: "+total);
                }

                break;
            }
            case 3: if(pag == 3){
                total = valor - (valor * 0.1);
                System.out.println("O valor a se pagar é: "+total);
                break;
            }
        }
    }
}