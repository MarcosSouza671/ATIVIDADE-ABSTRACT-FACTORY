package factories;

import button.Button;

public interface GUIFactory {//é um tipo de contrato que especifica os métodos da aplicação que devem ser implementados.
	Button createButton();//é um método que cria um objeto do tipo Botão.
	Checkbox createCheckbox();//é um método que cria um objeto do tipo quadro de seleção.
}
