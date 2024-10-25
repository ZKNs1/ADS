using System;

public abstract class Bebida : Item{
    public String Tamanho {get; private set; }

    public Bebida(string nome, decimal preco, string tamanho):base(nome,preco){
        Tamanho = tamanho;
    }

    public override abstract decimal CalcularPreco();
    public abstract override string ToString();
}