package bytebank_compost;

public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		conta.saca(200);
		//Devolve o boolean false e não retira nada
		System.out.println(conta.getSaldo());
	}
}
