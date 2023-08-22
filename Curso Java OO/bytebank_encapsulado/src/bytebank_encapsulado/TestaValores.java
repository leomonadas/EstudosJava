package bytebank_encapsulado;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(4242, 244224);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(123123);
		
		Conta conta2 = new Conta(4343, 565656);

		
	}
}
