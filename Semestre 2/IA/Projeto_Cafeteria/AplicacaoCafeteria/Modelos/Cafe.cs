using System;

public class Cafe : Bebida{

    //Atributos
    public string Tipo {get; private set;}

    //Construtor
    public Cafe (string nome, decimal preco, string tamanho, string tipo): base(nome, preco, tamanho){
        Tipo = tipo;
    }

    //Métodos 
    public override decimal CalcularPreco()
    {
        return Preco;
    }

    public override string ToString()
    {
        return $"Nome: {Nome}, Preco: {CalcularPreco()}, Tamanho: {Tamanho}, Tipo: {Tipo}";
    }

}