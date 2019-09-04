package banco.financeiro;

public class Principal {
    
    public static void main(String[] args){
    ContaCorrenteSimplificada conta1;
    conta1 = new ContaCorrenteSimplificada();
        PessoaFisica p1 = new PessoaFisica();
        PessoaFisica p2 = new PessoaFisica();
        PessoaFisica p3 = new PessoaFisica();
        PessoaJuridica p4 = new PessoaJuridica();
    
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
        p2.setNomeCompleto("MARIA PEREIRA DA SILVA SAURO");
        p2.setcpf("222.333.444-15");
        p2.setrg("789456-2");
        
        conta2.setPessoa(p2);
        conta2.Status();
            System.out.println("===========================");
        conta1.Status();
        
        p3.setNomeCompleto("VICTOR PEREIRA DA SILVA SAURO");
        p3.setcpf("999.888.777-15");
        p3.setrg("753159-2");
        
        p4.setRazaoSocial("ITEGO JOAO SONTOS");
        p4.setNomefantasia("ITEGOLAGISTA");
        p4.setCNPJ("456.789.741/0001-74");
            System.out.println("----------------- teste ----------------");
            
        conta1.adicionar(p3);
        conta1.adicionar(p4);
        conta1.Status();
        
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
            pessoaJuridica.setNomefantasia("ITEGO");
            pessoaJuridica.setRazaoSocial("ITEGO SEBASTIAO SIQUEIRA");
            pessoaJuridica.setCNPJ("123.852.789/0001-25");

        ContaCorrenteSimplificada conta3 = new ContaCorrenteSimplificada();
            conta3.depositar(100000);
            conta3.setPessoa(pessoaJuridica);
            conta3.setAgencia("789-5");
            conta3.setnroConta("446677-92");
            conta3.Status();
    }
}
