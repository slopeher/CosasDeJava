
public class IfElse {

	public void ifElse() {
		
		boolean condicion = true;
		
		if(condicion == true) 
		{
			System.out.print("condicion se cumple (es true)");
		}
		else if(condicion == false) 
		{
			System.out.print("Condicion se cumple (es false)");
		}
		else 
		{
			System.out.println("Ninguna condicion se cumple");
		}
		
		//One line if / Operador terniario
		boolean condicionSeCumple = (condicion == true) ? true/*condicion es true*/ : false/*condicion es false*/;
		
		//Esto es lo mismo que lo de la línea 22 se puede usar el operador terniario o el if convencional
		if(condicion == true) {
			condicionSeCumple=true;
		} else {
			condicionSeCumple = false;
		}
		
		
		boolean condicion1 =true;
		boolean condicion2 = false;
		
		if(condicion1 && condicion2) {
			//La condicion 1 "Y" la Condicion 2 se cumple
		}
		if(condicion1 || condicion2) {
			//La condicion 1 "O" la Condicion 2 se cumple
		}
		
	}
	
	
	
}
