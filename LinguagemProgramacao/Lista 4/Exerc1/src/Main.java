import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Vetor na ordem original:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor em ordem inversa:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}

