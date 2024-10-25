using System;

public class Program{
    public static void Main(String[] args){
        Item item = new Item("Pao de queijo", 5.90m);
        Console.WriteLine(item);
    
        Item bebida = new Cafe("Capuccino", 4, "Grande", "Expresso");
        Console.WriteLine(bebida);

        Item sobremesa = new Sobremesa("Donut", 2.5m, "Cafe");
    }
}