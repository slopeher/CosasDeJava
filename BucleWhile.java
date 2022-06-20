
public class BucleWhile {

	
	public void bucleWhile() {
		
		//While
		boolean condicionParaSalirDelBucle = false;
		while (condicionParaSalirDelBucle == false) {
			
			System.out.println("Estoy repitiendo todo lo que hay entre el corchete de la 75 y el corchete de la 78 hasta que condicionParaSalirDelBucle sea true");
		}
		
		//Do While
		do {
			System.out.println("Estoy repitiendo todo lo que hay entre el corchete de la 77 y el corchete de la 79 hasta que condicionParaSalirDelBucle sea true"
					+ "pero ejecuto el bucle una vez antes de comprobarlo");
		}while (condicionParaSalirDelBucle == false);
		
		
		
	}
	
}
