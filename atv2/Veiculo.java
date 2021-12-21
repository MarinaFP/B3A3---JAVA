package atv2;
public class Veiculo {
    private String marca;
    private int velocidade;
    private int qtdRotas;
    private String modelo;
  

    public Veiculo(String marcaVeiculo, int qtdRotasVeiculo, String modeloVeiculo,  int velocidadeVeiculo){
        this.marca= marcaVeiculo;
        this.qtdRotas= qtdRotasVeiculo;
        this.modelo = modeloVeiculo;
        this.velocidade=velocidadeVeiculo; 
    };    
    public void setMarca(String marcaVeiculo){
        this.marca = marcaVeiculo;
    };
    public String getMarca(){
        return this.marca;
    }
    public void setQtdRotas(int qtdRotasVeiculo){
        this.qtdRotas = qtdRotasVeiculo;
    };
    public int getQtdRotas(){
        return this.qtdRotas;
    };
    public void setModelo(String modeloVeiculo){
        this.modelo = modeloVeiculo;
    };
    public String getModelo(){
        return this.modelo;
    };
    public void setVelocidade(int velocidadeVeiculo){
        this.velocidade = velocidadeVeiculo;
    };
    public int getVelocidade(){
        return this.velocidade;
    };
    public void imprimirInformacoes(){
        System.out.println("Marca: " + getMarca()+ ", Quantidade de Rotas: " + getQtdRotas() +", Modelo " + getModelo()+", Velocidade: " + getVelocidade());
    };

    public void acelerar(int valor){
        this.velocidade = this.velocidade+valor;

    };
    public void frear (int valor){
        this.velocidade = this.velocidade-valor;
    };
}
