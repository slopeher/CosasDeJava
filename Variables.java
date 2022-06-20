
public class Variables {
	/*
	La definición técnica de variable es "Un nombre que se le asigna a un espacio de la memoria ram del ordenador"
	En la Programación orientada a objetos se define como "Una propiedad o atributo del objeto que quieres representar" en el caso de una persona por ejemplo su
	color de ojos, altura, peso etc...
	
	
	La estructura para declarar una variable es la siguiente:
	
		IdentificadorDeAcceso[public, private, protected] TipoDeDato[int, float, double, char, String, boolean] nombreVariable [El que mejor defina lo que se quiere representar] = valorDeLaVariable;
	
	*/
	
	
	//Las variables de tipo int solo pueden almacenar números sin decimales [0, 1, 2, 3, 4, 5, 6, 7, 8, 827619, 1928]
	int numeroDinDecimales = 1;
	//Las variables de tipo float solo pueden almacenar números de hasta 7 decimales, hay que poner la letra f detrás del valor de la variable
	//[1.6f, 2.1f, 22.4f, 99.2f, 128319.241321f]
	float numeroCon7Decimales = 1.2f;
	//Las variables de tipo double pueden almacenar números de hasta 15 decimales, el doble que un float (de ahí el nombre) [1.4, 43.44, 112.35]
	double numeroCon15Decimales = 1.2;
	
	//Las variables de tipo char solo pueden almacenar un carácter alfanumérico, es decir, una letra o un numero o un caracter especial, el valor siempre se introduce entre comilla simple ['a','2','ñ','ç','l','2','@']
	char caracter = 'A';
	
	//Un string puede contener textos compuestos por letras y números, se denomina string porque es una "cadena" o array de caracteres, es decir de varios char puede contener cualquier frase, su valor se asigna entre comillas ["Hola", "Cadena de caracteres", "A Juan le mola el surf tralala"]
	String cadenaDeCaracteres = "Cadena";

	//Un valor de tipo booleano solo puede valer true o false, sirve para almacenar el valor de una comparación.
	boolean verdaderoOFalso = true;	
}
