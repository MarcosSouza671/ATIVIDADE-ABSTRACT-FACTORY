package app;

public class FabricaCaminhao implements FabricaTransporte {
	@Override
	public Trasporte criarTransporte() {
		return new Caminhao;
	}

}
