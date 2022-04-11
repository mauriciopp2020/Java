
public class Fornecedor extends Pessoa {
    
    private float valorCredito;
    private float valorDivida;
   
    
    public Fornecedor (float valorCredito , float valorDivida )
    {
    	this.valorCredito = valorCredito;
    	this.valorDivida = valorDivida;
     
    }
	
	public float getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}

	public float getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public void obterSaldo() {
		System.out.println("Saldo Atual :"+(valorCredito-valorDivida));
	}
	public void situação() {
	      if ((valorCredito-valorDivida)> 0) {
		     System.out.println("Parabéns saldo positivo");
	      }else {
		    	 System.out.println("Saldo Negativo");		
			
	             }  
    }
	public void dobraCredito() {
		if ((valorCredito-valorDivida)> 0) {
			System.out.println("Credito Aumentado :"+ (valorCredito*2));
		}else {
	    	 System.out.println("Infelizmente seu crédito não pode ser aumento pois seu saldo é negativo");	
	}

	}
}