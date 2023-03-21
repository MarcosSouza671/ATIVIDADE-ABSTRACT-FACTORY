package app;

// import das factories
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

public class Demo {
	//Cria uma variável estática para configurar a aplicação
	private static Application configureApplication() { 
		//Cria as variáveis
		Application app;
		GUIFactory factory;
		
		String osName = System.getProperty("os.name").toLowerCase();//Cria variável que recebe o nome do sistema operacional do computador
		
		//Verifica se o sistema operacional contém o nome "Mac", em seguida, cria uma instância de factory MacOSFactory
		if (osName.contains("mac")) {
			factory = new MacOSFactory();
		
		//Caso contrário, cria uma instância da fábrica WindowsFactory
		} else {
			factory = new WindowsFactory();
		}
		
		app = new Application(factory);//Cria uma instância da aplicação, passando como parâmetro a factory
		return app;//Retorna a instância da aplicação
	}
	//Cria o método main
	public static void main(String[] args) {
		Application app = configureApplication();//Cria uma instância da aplicação chamando o método configureApplication()
		app.paint();//Executa o método paint()
	}
}
