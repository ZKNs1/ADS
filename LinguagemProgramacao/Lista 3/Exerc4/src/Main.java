public class Main {
    public static void main(String[] args) {
        System.out.println("Tabela de Conversão de Celsius para Fahrenheit:");
        System.out.println("Celsius\tFahrenheit");

        for (int celsius = -80; celsius <= 80; celsius += 10) {
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println(celsius + "\t" + fahrenheit);
        }
    }

    public static double celsiusToFahrenheit(int celsius) {
        return (9.0 / 5.0) * celsius + 32;
    }
}