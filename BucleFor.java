
public class BucleFor {

	
	public void bucleFor() {
	
		//El bucle for sirve para recorrer arrays o colecciones o para ejecutar una pieza de código mas de una vez
		//, la estructura es la siguiente:
		/*
			for(variable de tipo entero; condición de salida; incremento o decremento){}
		*/
		int arrayOMatriz [] = new int[]{1, 2, 2, 3, 2 ,1, 1, 2};
	
		for(int i = 0; i < arrayOMatriz.length; i++) {
			System.out.println(arrayOMatriz[i]);
		}
	
		for (int elemento : arrayOMatriz){ //Este es lo mismo que el de arriba
			System.out.println(elemento);
		}
	}
}
