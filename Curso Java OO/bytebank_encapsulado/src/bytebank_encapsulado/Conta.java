package bytebank_encapsulado;
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino){
	    if(this.saldo >= valor){
	        this.saldo -= valor;
	        destino.deposita(valor);    
	        return true;
	    }
	    return false;
	}
	
	//Retorna o saldo de maneira mais segura, já que não permite modificações diretas e também funciona como um local em que a manutenção é mais fácil
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia (int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
}

