```mermaid
classDiagram
    class Item {
        - String Nome
        - decimal Preco
        + Item(string nome, decimal preco)
        + decimal CalcularPreco()
        + string ToString()
    }

    class Bebida {
        - String Tamanho
        + Bebida(string nome, decimal preco, string tamanho)
        + decimal CalcularPreco()
        + string ToString()
    }

    class Cafe {
        - String Tipo
        + Cafe(string nome, decimal preco, string tamanho, string tipo)
        + decimal CalcularPreco()
        + string ToString()
    }

    class Sobremesa {
        - String Sabor
        + Sobremesa(string nome, decimal preco, string sabor)
        + decimal CalcularPreco()
        + string ToString()
    }

    Item <|-- Bebida
    Item <|-- Sobremesa
    Bebida <|-- Cafe
