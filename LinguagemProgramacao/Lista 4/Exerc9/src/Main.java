//Exibir 1, 7, 13, 19, 25;
public class Main {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};

        for (int i = 0; i < matriz.length;i++) {
                System.out.print(matriz[i][matriz.length - i - 1] + " ");
        }
    }
}
