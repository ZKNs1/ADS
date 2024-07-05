import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double area;
        double perim;
        double expo = 2;
        double cat;
        double hip;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Operações:\n1- Círculo\n2- Triângulo retângulo\n3- Retângulo\n");
        System.out.print("Digite o valor da base: ");
        double base = scanner.nextDouble();
        System.out.print("Digite o valor da altura: ");
        double altura = scanner.nextDouble();
        System.out.print("Digite o dígito da forma geométrica: ");
        int oper = scanner.nextInt();

        switch(oper){
            case 1: if(oper == 1){
               area = 3.14 * (base * base);
                System.out.println("O valor da área é: "+area);
                perim = 3.14 * 2 * base;
                System.out.println("\nO valor da área é: "+perim);
                break;
            }
            case 2: if(oper == 2){
                area = (base * altura) / 2;
                cat = Math.pow(base, expo) + Math.pow(altura,expo);
                hip = Math.sqrt(cat);
                perim = base + altura + hip;
                System.out.println("O valor da subtração é: "+area);
                System.out.println("\nO valor do perímetro é: "+perim);
                break;
            }
            case 3: if(oper== 3){
                area = base * altura;
                perim = 2*base + 2*altura;
                System.out.println("O valor da área é: "+area);
                System.out.println("\nO valor do perímetro é: "+perim);
                break;
            }
        }
    }
}