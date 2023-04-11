package app;

public class FabricaCaminhao implements FabricaTransporte { //  implementa a interface FabricaTransporte.
	@Override
	public Trasporte criarTransporte() { //define o método criarTransporte() que retorna um objeto do tipo Transporte.
		return new Caminhao; //retorna um objeto criado do tipo caminhao.
	}

}
