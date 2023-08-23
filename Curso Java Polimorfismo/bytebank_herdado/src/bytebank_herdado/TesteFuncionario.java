package bytebank_herdado;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario leo = new Funcionario();
		leo.setNome("Leonardo");
		leo.setCpf("111222333-44");
		leo.setSalario(1650.0);
		
		System.out.println(leo.getNome());
		System.out.println(leo.getSalario());
	}
}
