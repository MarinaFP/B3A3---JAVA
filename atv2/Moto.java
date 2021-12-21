package atv2;
public class Moto extends Automovel {
    private boolean partidaEletrica;
    public Moto(String marca, int qtdRotas,  String modelo, int velocidade, double potenciaAutomovel, boolean partidaMoto){
        super(marca, qtdRotas, modelo, velocidade, potenciaAutomovel);
        this.partidaEletrica = partidaMoto;
    }
    public boolean getPartidaEletrica(){
        if (this.partidaEletrica){
            return true;
        }else{
            return false;
        }
    }
    public void imprimirInformacoes(){
        System.out.println("Marca: " + getMarca()+ ", Rotas: " + getQtdRotas() +", Modelo " + getModelo()+", Velocidade: " + getVelocidade() + ", Partida Elétrica:  " + getPartidaEletrica());
    }

    public void setPartidaEletrica(Boolean partidaEletricaMoto){
        this.partidaEletrica = partidaEletricaMoto;
    };

}

