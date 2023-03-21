package factories;

import button.Button;
import button.WindowsButton;
import checkbox.Checkbox;
import checkbox.WindowsCheckbox;

//WindowsFactory é uma subclasse de GUIFactory, que é responsável por criar elementos de interface do usuário para sistemas Windows.
public class WindowsFactory implements GUIFactory{
	@Override
	public Button createButton() {//cria um botão Windows específico.
		return new WindowsButton();
	}
	
	@Override
	public Checkbox createCheckbox() {//cria um checkbox Windows específico.
		return new WindowsCheckbox();
	}
}
