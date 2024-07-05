public class Ex5 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int element = 13;

        int posicao = buscaBinariaRecursiva(array, element, 0, array.length - 1);

        if (posicao != -1) {
            System.out.println("O elemento " + element + " está na posição " + posicao + " do array.");
        } else {
            System.out.println("O elemento " + element + " não foi encontrado no array.");
        }
    }

    public static int buscaBinariaRecursiva(int[] array, int elemento, int inicio, int fim) {
        if (inicio > fim) {
            return -1;
        }

        int meio = (inicio + fim) / 2;

        if (array[meio] == elemento) {
            return meio;
        } else if (array[meio] < elemento) {
            return buscaBinariaRecursiva(array, elemento, meio + 1, fim);
        } else {
            return buscaBinariaRecursiva(array, elemento, inicio, meio - 1);
        }
    }
}