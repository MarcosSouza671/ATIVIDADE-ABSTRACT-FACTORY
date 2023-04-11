package app;

public class Logistica {
	public static void main(String[] aegs) {
		FabricaTransporte fabricaCaminhao = new FabricaCaminhao(); // cria uma nova inst�ncia da classe FabricaCaminhap, que implementa a interface FabricaTransporte.
		FabricaTransporte fabricaNavio = new FabricaNavio(); // cria uma nova inst�ncia da classe FabricaNavio, que tamb�m implementa a interface FabricaTransporte.
		
		Transporte caminhao = fabricaCaminhao.criarTransporte(); //chama o m�todo criarTransporte() da f�brica FabricaCaminhao, que retorna uma inst�ncia de Caminhao
		caminhao.entregar(); // chama o m�todo entregar() da classe Caminhao, que imprime uma mensagem
		
		Transporte navio = fabricaNavio.criarTransporte(); //chama o m�todo criarTransporte() da f�brica FabricaNavio, que retorna uma inst�ncia de Navio
		navio.entregar(); // chama o m�todo entregar() da classe Navio, que imprime uma mensagem
	}
}
