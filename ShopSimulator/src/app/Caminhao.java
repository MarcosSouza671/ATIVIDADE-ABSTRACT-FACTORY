package app;

public class Caminhao implements Transporte {
	@Override
	public void entregar() { // imprime a mensagem "Entregando por caminh�o..." quando � chamado.
		System.out.println("Entregando por caminh�o...");
	}
}
