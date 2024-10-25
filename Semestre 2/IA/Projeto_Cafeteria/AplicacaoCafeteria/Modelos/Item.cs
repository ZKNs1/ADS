using System;
using System.Security.Cryptography.X509Certificates; //Equivalente ao import Java
                                                     //namespace é equivalente ao package do Java

public class Item{
    //Atributos da Classe
    public String Nome{get; private set; }
    public decimal Preco{get; protected set;}

    //Constructor
    public Item(string nome, decimal preco){
        Nome = nome;
        Preco = preco;
    }

    //Métodos
    public virtual decimal CalcularPreco(){
        return Preco;
    }

    //toString()
    public override string ToString()
    {
        return $"Item: {Nome}, Preço: {Preco}";
    }
}