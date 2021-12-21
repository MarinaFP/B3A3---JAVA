package atv2;
public class Bicicleta extends Veiculo {
    private int numMarchas;
    private boolean bagageiro; 
    public Bicicleta(String marca, int qtdRotas,  String modelo, int velocidade, int marchas, boolean existeBagageiro){
        super(marca, qtdRotas, modelo, velocidade);
        this.bagageiro = existeBagageiro;
        this.numMarchas = marchas;
    }
    
    public void setNumMarchas(int numMarchasBicicleta){
        this.numMarchas = numMarchasBicicleta;
    };
    public int getNumMarchas(){
        return this.numMarchas;
    }
    void imprimirInformacoes(){
        System.out.println("Marca: " + getMarca()+ ", Quantidade de Rotas: " + getQtdRotas() +", Modelo " + getModelo()+", Velocidade: " + getVelocidade() + ",  Bagageiro: " + getBagageiro());
    }
    public void setBagageiro(Boolean bagageiroBicicleta){
        this.bagageiro = bagageiroBicicleta;
    };
    public boolean getBagageiro(){
        if (this.bagageiro){
            return true;
        }else{
            return false;
        }
        
    }
}
