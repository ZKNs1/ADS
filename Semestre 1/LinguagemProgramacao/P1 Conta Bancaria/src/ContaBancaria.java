public class ContaBancaria {
    //Atributos
    private int numero;
    private double saldo;
    private String titular;

    //Construtor
    public ContaBancaria(int numero, String titular){
        this.numero=numero;
        this.saldo=0.0;
        this.titular=titular;

    }

    //Métodos
    public void depositar(double valor){
        if(valor>0)
            this.saldo+=valor;
    }

    public void sacar(double valor){
        if(valor>0 && saldo>=valor)
        this.saldo-=valor;
    }

   //getters and setters
    public double getSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //toString()
    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", titular='" + titular + '\'' +
                '}';
    }

    public boolean depositer(double valor){
        if(valor<=0)
            return false;
        this.saldo+=valor;
        return true;
    }

    public boolean draw(double valor){
        if(valor<=0 || this.saldo<valor)
            return false;
        this.saldo-=valor;
        return true;
    }
}
