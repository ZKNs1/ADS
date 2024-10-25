import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String text = scanner.nextLine();
        if (Palindromo(text)) {
            System.out.println("O texto \"" + text + "\" é um palíndromo.");
        } else {
            System.out.println("O texto \"" + text + "\" não é um palíndromo.");
        }
        scanner.close();
    }

    public static boolean Palindromo(String text) {
        text = text.replaceAll("\\s+", "").toLowerCase();

        int i = 0;
        int j = text.length() - 1;

        while (i < j) {
            if (text.charAt(i) != text.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}