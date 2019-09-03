package banco.financeiro;

public class Principal {
    
    public static void main(String[] args){
    ContaCorrenteSimplificada conta1;
    conta1 = new ContaCorrenteSimplificada();
    PessoaFisica p1 = new PessoaFisica();
    
    conta1.setAgencia("123");
    conta1.setnroConta("5558-8");
    
    p1.setcpf("123.456.789-22");
    p1.setrg("55789-6");
    p1.setNomeCompleto("JOÃO DA SILVA SAURO");
    
    conta1.setPessoa(p1);
    
    double valor = conta1.depositar(200.50);
    double saldoFinal = conta1.sacar(1000);
        System.out.println("saldoFinal");
        System.out.println("===========================");
        conta1.Status();
        
        System.out.println("===========================");
        ContaCorrenteSimplificada conta2;
        
        conta2 = conta1;
        PessoaFisica p2 = new PessoaFisica();

        p2.setNomeCompleto("MARIA PEREIRA DA SILVA SAURO");
        p2.setcpf("222.333.444-15");
        p2.setrg("789456-2");
        conta2.Status();
        
        System.out.println("===========================");
        conta1.Status();
    }
}
