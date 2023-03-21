package button;

public class WindowsButton implements Button{//Esta classe é usada para criar um botão para sistemas Windows especificamente. Ela implementa a interface Button para indicar que ela estenderá seus métodos.
	@Override//@Override é usado para indicar que o método paint da interface original está sendo reimplementado.
	public void paint() {//imprime a saída informando que um botão Windows foi criado.
		System.out.println("You have created WindowsButton.");
	}
}
