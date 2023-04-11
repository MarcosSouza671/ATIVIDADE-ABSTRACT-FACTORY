package app;

public class Logistica {
	public static void main(String[] aegs) {
		FabricaTransporte fabricaCaminhao = new FabricaCaminhap();
		FabricaTransporte fabricaNavio = new FabricaNavio();
		
		Transporte caminhao = fabricaCaminhao.criarTransporte();
		caminhao.entregar();
		
		Transporte navio = fabricaNavio.criarTransporte();
		navio.entregar();
	}
}
