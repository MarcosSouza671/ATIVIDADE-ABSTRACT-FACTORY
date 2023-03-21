package button;

public class MacOSButton implements Button{// Esta classe é usada para criar um botão específico de Mac OS.
	@Override//@Override indica que este método sobrescreve um método da superclasse ou que implementa um método de uma interface.
	public void paint() {// Este é o método implementado da interface que pode ser usado para criar o botão na tela. Quando chamado, este método imprime uma mensagem na tela indicando que um botão de Mac OS foi criado.
		System.out.println("You have created MacOSButton.");
	}
}
