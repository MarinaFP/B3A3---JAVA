package atv2;
public class Carro extends Automovel{
    private int qtdPortas;
    public Carro(String marca, int qtdRotas,  String modelo, int velocidade, double potenciaAutomovel, int qtdPortasdoCarro){
        super(marca, qtdRotas, modelo, velocidade, potenciaAutomovel);
        this.qtdPortas = qtdPortasdoCarro;
    }
    void imprimirInformacoes(){
        System.out.println("Marca: " + getMarca()+ ", Quantidade de Rotas: " + getQtdRotas() +", Modelo " + getModelo()+", Velocidade: " + getVelocidade() + ", Portas no carro:  " + getQtdPortas());
    }

    public void setQtdPortas(int qtdPortasCarro){
        this.qtdPortas = qtdPortasCarro;
    };
    public int getQtdPortas(){
        return this.qtdPortas;
    }
}
