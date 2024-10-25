using System;

public class Sobremesa(string nome, decimal preco, string sabor): Item(nome,preco){
    public string Sabor {get; private set;} = sabor;

    public override decimal CalcularPreco()
    {
        return base.CalcularPreco();
    }

    //toString()
    public override string ToString()
    {
        return $"Sobremesa: {nome} - Preco {preco} - Sabor{Sabor}";
    }
}