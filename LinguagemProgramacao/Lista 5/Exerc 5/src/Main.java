public class Main{

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int resultado = buscaBinaria(array, target);

        if (resultado != -1) {
            System.out.println("Elemento encontrado na posição: " + resultado);
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }

    public static int buscaBinaria(int[] array, int target) {
        int esquerda = 0;
        int direita = array.length - 1;

        while (esquerda <= direita) {
            int mid = esquerda + (direita - esquerda) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                esquerda = mid + 1;
            } else {
                direita = mid - 1;
            }
        }

        return -1;  // Elemento não encontrado
    }
}
