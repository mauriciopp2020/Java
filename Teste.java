
public class Teste {


	public static void main(String[] args) {
		Fornecedor f = new Fornecedor(0,0);
		f.setEndereco("Rua A");
		f.setNome("Maria");
		f.setTelefone(9855889);
	    f.setValorCredito(100);
	    f.setValorDivida(50);
	  
		f.Dados();
		System.out.println("Valor Crédito :"+f.getValorCredito());
		System.out.println("Valor Divida :"+f.getValorDivida());
	    f.obterSaldo();
	    f.situação();
	    f.dobraCredito();
		

	}

}
