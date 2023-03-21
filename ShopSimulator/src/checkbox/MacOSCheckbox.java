package checkbox;

public class MacOSCheckbox implements Checkbox{//Essa classe é usada para criar uma caixa de seleção específica para o sistema operacional MacOS.
	@Override//A anotação "@Override" indica que o método "paint()" substitui o do mesmo nome da superclasse. Isso significa que esse método será usado ao invés do método da superclasse se for chamado.
	public void paint() {//O método "paint()" imprime uma mensagem de saída no console informando que uma "MacOSCheckbox" foi criada.
		System.out.println("You have created MacOSCheckbox.");
	}
}
