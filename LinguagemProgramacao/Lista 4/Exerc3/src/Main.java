import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] vector = {0,1,2,3,4,5,6,7,8,9};
        boolean found =  false;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor para ser procurado: ");
        int value = scanner.nextInt();

        for (int i = 0; i < vector.length;i++) {

            if (vector[i] == value) {
                System.out.print("Valor encontrado na posição:" + i);
                found = true;
                break;
            }
        }
            if(!found){
                System.out.print("Valor não encontrado");
            }
    }
}