package app;

public class Navio implements Transporte {
	@Override
	public void entregar() { // imprime a mensagem "Entregando por navio..." quando � chamado.
		System.out.println("Entregando por navio...");
	}

}
