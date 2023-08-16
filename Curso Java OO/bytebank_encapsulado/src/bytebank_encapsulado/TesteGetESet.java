package bytebank_encapsulado;

public class TesteGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.setNumero(4242);
		System.out.println(conta.getNumero());
	}
}
