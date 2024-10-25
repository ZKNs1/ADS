using System.Dynamic;

public class Account : IComparable<Account> {
    public int Number{get; private set;}
    public string Name {get; private set;}

    public Account(int number, string name)
    {
        Number=number;
        Name=name;
    }

    public int CompareTo(Account? other)
    {
        if(this.Number<other!.Number)
            return -1;
        if(this.Number>other.Number)
            return 1;
        return 0;
    }

    public override string ToString()
    {
        return $"Number:{Number}, Name:{Name}";
    }
}