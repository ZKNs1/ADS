public class Carro {

    //Atributos
    private String cor;
    private int posX;
    private int posY;
    private int largura;
    private int altura;

    //Construtor
    public void Carro(String cor, int posX, int posY, int largura, int altura){
        this.cor=cor;
        this.posX=posX;
        this.posY=posY;
        this.largura=largura;
        this.altura=altura;

    }
    public void andarFrente(){
        if(posY>0){
            posY--;
        }
    }
    public void andarRe(){
        if(posY<1080-altura) {
            posY++;
        }
    }
    public void andarEsquerda(){
        if(posX>0){
            posX--;
        }
    }
    public void andarDireita(){
        if(posX<1920-largura){
            posX++;
        }
    }

    @Override
    public String toString() {
        return "Carro{}";
    }
    
}