package atv2;
public class Automovel extends Veiculo{
    private double potenciaDoMotor;
    public Automovel(String marca, int qtdRotas,  String modelo, int velocidade, double potenciaAutomovel){
        super(marca, qtdRotas, modelo, velocidade);
        this.potenciaDoMotor = potenciaAutomovel;
    }
    void imprimirInformacoes(){
        System.out.println("Marca: " + getMarca()+ ", Quantidade de Rotas: " + getQtdRotas() +", Modelo " + getModelo()+", Velocidade: " + getVelocidade() + ", Potencia do Aumotóvel: " + getPotenciaDoMotor());
    }
    public void setPotenciaDoMotor(Double potenciaDoMotorAutomovel){
        this.potenciaDoMotor = potenciaDoMotorAutomovel;
    };
    public Double getPotenciaDoMotor(){
        return this.potenciaDoMotor;
    }
}
