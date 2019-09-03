package banco.financeiro;

public class ContaCorrenteSimplificada {
    private String agencia;
    private String nroConta;
    private double saldo;
    private String Dados;
    private Pessoa pessoa;
    public double depositar(double valor){
        this.saldo = this.saldo + valor;
        return this.saldo;
    }
    
    public void Status(){
        System.out.println("AGENCIA: " + this.agencia);
        System.out.println("CONTA-CORRENTE: " + this.nroConta);
        
            if(this.pessoa instanceof PessoaFisica){
                System.out.println("NOME: " + ((PessoaFisica) this.pessoa).getnomecompleto());
                System.out.println("RG: " + ((PessoaFisica) this.pessoa).getrg());
                System.out.println("CPF: " + ((PessoaFisica) this.pessoa).getcpf());
    }
            if(this.pessoa instanceof PessoaJuridica){
                System.out.println("NOME: " + ((PessoaJuridica) this.pessoa).getnomefantasia());
                System.out.println("RG: " + ((PessoaJuridica) this.pessoa).getrazaosocial());
                System.out.println("CPF: " + ((PessoaJuridica) this.pessoa).getCNPJ());
            }
            
        System.out.println("SALDO: " + this.saldo);
    }
    
    public double sacar(double valor){
        if(saldo < valor){
        System.out.println("saldo insuficiente");
    }
        else{
            this.saldo = this.saldo - valor;
            }
    return this. saldo;
    }
    
    public void setAgencia(String agencia){
        this.agencia = agencia;
        
    }
    public String getAgencia(){
        return this.agencia;
    }
    
    public void setnroConta(String nroConta){
        this.nroConta = nroConta;
    }
    public String getnroConta(){
        return this.nroConta;
    }
    
    public void setPessoa(Pessoa pessoa){
        this.pessoa = pessoa;                
    }
    public Pessoa getpessoa(){
        return this.pessoa;
    }
}

