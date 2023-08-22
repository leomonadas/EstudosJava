package bytebank_encapsulado;

public class TesteGetESet {
	public static void main(String[] args) {
		Conta conta3 = new Conta(234,4567);
		
		conta3.setNumero(4242);
		System.out.println(conta3.getNumero());
		
		Cliente leo = new Cliente();
		leo.setNome("Leo");
		System.out.println(leo.getNome());
		conta3.setTitular(leo);
		
		System.out.println(conta3.getTitular().getNome());

		// conta.getTitular().setProfissao("Dev");
		
		Cliente titularDaConta = conta3.getTitular();
		titularDaConta.setProfissao("Desenvolvedor");
	}
}
