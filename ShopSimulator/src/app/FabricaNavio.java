package app;

public class FabricaNavio implements FabricaTransporte {
	@Override
	public Transporte criarTransporte() {
		return new Navio();
	}
}
