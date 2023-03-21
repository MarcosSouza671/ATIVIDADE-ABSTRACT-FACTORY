package app;

import button.Button;
import checkbox.Checkbox;
import factories.GUIFactory;

public class Application {
	//Cria uma variável do tipo Button para armazenar o botão criado
	private Button button;

	//Cria uma variável do tipo Checkbox para armazenar a caixa de seleção criada
	private Checkbox checkbox;

	//Cria um construtor que aceita um objeto GUIFactory como parâmetro
	public Application(GUIFactory factory) {

	//Utiliza o objeto GUIFactory para criar um botão 
	  button = factory.createButton();

	//Utiliza o objeto GUIFactory para criar uma caixa de seleção 
	  checkbox = factory.createCheckbox();

	//Cria um método que desenha o botão e a caixa de seleção 
	public void paint() {
	  button.paint();
	  checkbox.paint();
	}
}
