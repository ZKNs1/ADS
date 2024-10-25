public class Main {
    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria(5395, "melina");
        if(c1.depositer(100))
            System.out.println("Depósito realizado com sucesso!");
        else
            System.out.println("Valor inválido");

        if(c1.draw(13.40))
            System.out.println("Saque realizado!");
        else
            System.out.println("Valor inválido");


        ContaBancaria c2 = new ContaBancaria(4255,"millena");
    }
}