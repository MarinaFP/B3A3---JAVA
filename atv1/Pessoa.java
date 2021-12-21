package atv1;
public class Pessoa {
    private String nome;
    private String nomePai;
    private String nomeMae;
    public Pessoa(String nomePessoa, String nomedoPai, String nomedaMae){
        this.nome= nomePessoa;
        this.nomeMae= nomedaMae;
        this.nomePai= nomedoPai;
    }
    public Pessoa (String nomePessoa2){
        this.nome= nomePessoa2;
    };
    public void setNome(String nomeDaPessoa){
        this.nome = nomeDaPessoa;
    };
    public String getNome(){
        return this.nome;
    };
    public void setNomeMae(String nomeDaMae){
        this.nomeMae = nomeDaMae;
    };
    public String getNomeMae(){
        return this.nomeMae;
    }
    public void setNomePai(String nomeDoPai){
        this.nomeMae = nomeDoPai;
    };
    public String getNomePai(){
        return this.nomePai;
    }
    

    public String verificarSeDuasPessoasSãoIrmas(String maeDaPessoa, String paiDaPessoa, String maeDaPessoa2, String paiDaPessoa1){
        if (maeDaPessoa==maeDaPessoa2 && paiDaPessoa==paiDaPessoa1){
            return "Sim";
        }else{
            return "Não";
        }
    };

    public String verificaSeÉantecessor(String nomePessoa, String nomeDoPai, String nomeDaMae){
        if (nomePessoa==nomeDaMae || nomePessoa==nomeDoPai){
            return "Sim";
        }else{
            return "Não";
        }
    };
    
    
}