package app;

public class FabricaNavio implements FabricaTransporte { //  implementa a interface FabricaTransporte.
	@Override
	public Transporte criarTransporte() { //define o método criarTransporte() que retorna um objeto do tipo Transporte.
		return new Navio(); //retorna um objeto criado do tipo navio.
	}
}
