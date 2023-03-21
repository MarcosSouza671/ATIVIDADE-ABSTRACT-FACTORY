package factories;

import button.Button;
import button.MacOSButton;
import checkbox.Checkbox;
import checkbox.MacOSCheckbox;

//MacOSFactory é uma subclasse de GUIFactory, que é responsável por criar elementos de interface do usuário para sistemas MacOS.
public class MacOSFactory implements GUIFactory {
	@Overide
	public Button createButton() {//cria um botão Mac específico.
		return new MacOSButton();
	}
	
	@Override
	public Checkbox createCheckbox() {//cria um checkbox Mac específico.
		return new MacOSCheckbox();
	}
}
