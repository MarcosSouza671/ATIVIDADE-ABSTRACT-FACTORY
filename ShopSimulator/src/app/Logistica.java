package app;

public class Logistica {
	public static void main(String[] aegs) {
		FabricaTransporte fabricaCaminhao = new FabricaCaminhao(); // cria uma nova instância da classe FabricaCaminhap, que implementa a interface FabricaTransporte.
		FabricaTransporte fabricaNavio = new FabricaNavio(); // cria uma nova instância da classe FabricaNavio, que também implementa a interface FabricaTransporte.
		
		Transporte caminhao = fabricaCaminhao.criarTransporte(); //chama o método criarTransporte() da fábrica FabricaCaminhao, que retorna uma instância de Caminhao
		caminhao.entregar(); // chama o método entregar() da classe Caminhao, que imprime uma mensagem
		
		Transporte navio = fabricaNavio.criarTransporte(); //chama o método criarTransporte() da fábrica FabricaNavio, que retorna uma instância de Navio
		navio.entregar(); // chama o método entregar() da classe Navio, que imprime uma mensagem
	}
}
