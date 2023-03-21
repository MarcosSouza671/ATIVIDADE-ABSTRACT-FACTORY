package checkbox;

public class WindowsCheckbox implements Checkbox{//Esta classe implementa a interface Checkbox e define a implementação específica para um Checkbox Windows.
	@Override//@Override indica que este método deve substituir um método herdado de uma superclasse ou de uma interface.
	public void paint() {//A classe possui um método paint que imprime "Você criou WindowsCheckbox." Quando chamado.
		System.out.println("You have created WindowsCheckbox.");
	}
}
