
public class Switch {
	
	public void switchMethod() {
		
		String saludo = "Pues eso";
		//String saludo = "Hola";
		//String saludo = "Adios";
		//String saludo = "Hasta Luego";
		
		switch(saludo)
		{
			case "Hola":
				System.out.println("saludo vale Hola");
			break;
			case "Adios":
				System.out.println("saludo vale Adios");
			break;
			
			case "Hasta Luego":
				System.out.println("saludo vale Hasta Luego");
			break;
			
			default:
				System.out.println("saludo vale algo pero no sabemos que");
			break;
		}
		
		
	}
	
}
