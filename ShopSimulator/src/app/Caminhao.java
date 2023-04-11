package app;

public class Caminhao implements Transporte {
	@Override
	public void entregar() { // imprime a mensagem "Entregando por caminhão..." quando é chamado.
		System.out.println("Entregando por caminhão...");
	}
}
