import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine();

        if (Palindromo(texto)) {
            System.out.println("A palavra/frase \"" + texto + "\" é um palíndromo.");
        } else {
            System.out.println("A palavra/frase \"" + texto + "\" não é um palíndromo.");
        }

        scanner.close();
    }

    public static boolean Palindromo(String texto) {
        texto = texto.replaceAll("\\s+", "").toLowerCase();
        return PalindromoRecursivo(texto, 0, texto.length() - 1);
    }

    public static boolean PalindromoRecursivo(String texto, int inicio, int fim) {
        if (inicio >= fim) {
            return true;
        }
        if (texto.charAt(inicio) != texto.charAt(fim)) {
            return false;
        }
        return PalindromoRecursivo(texto, inicio + 1, fim-1);
    }
}