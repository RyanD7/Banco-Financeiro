package banco.financeiro;

public class ContaCorrenteSimplificada {
    private String agencia;
    private String nroConta;
    private double saldo;
    private String Dados;
    private Pessoa pessoa;
    private Pessoa[] pessoas = new Pessoa[100];
    private int qtd = 0;
    
    public boolean adicionar (Pessoa p){
        if(qtd < 100){
            pessoas[qtd] = p;
            qtd++;
            return true;
        }
        return false;
    }
            
    
    public double depositar(double valor){
        this.saldo = this.saldo + valor;
        return this.saldo;
    }
    
    public void Status(){
        
        System.out.println("AGENCIA: " + this.agencia);
        System.out.println("CONTA-CORRENTE: " + this.nroConta);
        
        for (int i = 0; i < qtd; i++) {
            if(this.pessoas[1] instanceof PessoaFisica){
                System.out.println("NOME: " + ((PessoaFisica) this.pessoas[1]).getnomecompleto());
                System.out.println("RG: " + ((PessoaFisica) this.pessoas[1]).getrg());
                System.out.println("CPF: " + ((PessoaFisica) this.pessoas[1]).getcpf());
            }
            if(this.pessoas[1] instanceof PessoaJuridica){
                System.out.println("NOME: " + ((PessoaJuridica) this.pessoas[1]).getnomefantasia());
                System.out.println("RG: " + ((PessoaJuridica) this.pessoas[1]).getrazaosocial());
                System.out.println("CPF: " + ((PessoaJuridica) this.pessoas[1]).getCNPJ());
            }
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

