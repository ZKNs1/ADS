public class EditorTexto {

    //Atributos
    private String nome;
    private int tamanho; //multiplicar qtd de caracter por 8 (1 caracter = 8 bits)
    private String conteudo;

    //Construct


    //Metodos

    public boolean abrir(){
        
        return true;
    }

    public boolean editar(){

        return true;
    }

    public boolean renomear(){

        return true;
    }

    public boolean limpar(){

        return true;
    }

    //Getters and Setters
    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public double getTamanho() {

        return tamanho;
    }

    public void setTamanho(int tamanho) {

        this.tamanho = tamanho;
    }

    public String getConteudo() {

        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    //toString()
    @Override
    public String toString() {
        return "EditorTexto{" +
                "nome='" + nome + '\'' +
                ", tamanho=" + tamanho +
                ", conteudo='" + conteudo + '\'' +
                '}';
    }

    //Tamanho = arquivo.length * 8;
}
