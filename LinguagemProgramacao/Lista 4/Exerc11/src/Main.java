import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size_lines,size_columns;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o tamanho da matriz 1 (separado por espaço):");
        size_lines = in.nextInt();
        size_columns = in.nextInt();

        int [][]a = new int[size_lines][size_columns];

        System.out.println("Digite o tamanho da matriz 2 (separado por espaço):");
        size_lines = in.nextInt();
        size_columns = in.nextInt();

        int [][]b = new int[size_lines][size_columns];

        if(a[0].length!=b.length){
            System.out.println("Impossível multiplicar as matrizes");
        }else{
            int [][]c = new int[a.length][b[0].length];

            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++){
                    System.out.println("Digite a"+i+j+":");
                    a[i][j]=in.nextInt();
                }
            }

            for(int i=0;i<b.length;i++){
                for(int j=0;j<b[0].length;j++){
                    System.out.println("Digite b"+i+j+":");
                    b[i][j]=in.nextInt();
                }
            }

            for(int i=0;i<a.length;i++){
                for(int j=0;j<b[0].length;j++){
                    for(int k=0;k<a[0].length;k++){
                        c[i][j]+=a[i][k]*b[k][j];
                        System.out.println("c"+i+j+" a"+i+k+" b"+k+j);
                    }
                }
            }

            for(int [] line : c) {
                for(int value:line)
                    System.out.print(value + " ");
                System.out.println();
            }
        }

    }
}
