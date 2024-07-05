import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("MENU:\n5: Sacar valor\n6: Pagamentos\n7: Verificar dados\n8: Extrato da conta\n9: Cancelar conta ");
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double digito = in.nextDouble();

        if (digito == 5){
            System.out.println("Operação: Sacar valor");
        }

        if (digito == 6){
            System.out.println("Operação: Pagamentos");
        }

        if (digito == 7){
            System.out.println("Operação: Verificar Dados");
        }

        if (digito == 8){
            System.out.println("Operação: Extrato da conta");
        }

        if (digito == 9){
            System.out.println("Operação: Cancelar conta");
        }

        else{
            System.out.println("Operação inválida!");
        }

        System.out.println("Fim da operação!");
    }
}