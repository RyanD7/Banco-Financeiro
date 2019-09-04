package banco.financeiro;

public class PessoaJuridica extends Pessoa {
    private String NomeFantasia;
    private String RazaoSocial;
    private String CNPJ;
    
    public void setNomefantasia (String NomeFantasia){
        this.NomeFantasia = NomeFantasia;
    }
    public String getnomefantasia(){
        return this.NomeFantasia;
    }
    
    public void setRazaoSocial (String RazaoSocial){
        this.RazaoSocial = RazaoSocial;
    }
    public String getrazaosocial(){
        return this.RazaoSocial;
    }
    
    public void setCNPJ (String CNPJ){
        this.CNPJ = CNPJ;
    }
    public String getCNPJ(){
        return this.CNPJ;
    }
    }
    

