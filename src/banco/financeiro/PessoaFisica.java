package banco.financeiro;

public class PessoaFisica extends Pessoa{
    private String NomeCompleto;
    private String CPF;
    private String RG;
    
    public void setNomeCompleto (String NomeCompleto){
        this.NomeCompleto = NomeCompleto;
    }public String getnomecompleto(){
        return this.NomeCompleto;}    
    
    public void setcpf (String cpf){
        this.CPF = cpf;
    }public String getcpf(){
        return this.CPF;
    }
    
    public void setrg(String rg){
        this.RG = rg;
    }public String getrg(){
        return this.RG;
    }
}
