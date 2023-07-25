package sintaxeVariaveisEFluxo;

public class TestaEscopo {
	public static void main(String[] args) {
		int idade = 12;
		int quantidadePessoas = 1;
		boolean acompanhado = true; //or false
		
		if(idade >= 18 || quantidadePessoas >= 2 || acompanhado) {
			System.out.println("Seja bem-vindo.");
		} else {
			System.out.println("Infelizmente você não pode entrar.");
		}
	}
}
