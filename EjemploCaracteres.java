
public class EjemploCaracteres {
	
	public static void main(String[] args) {
		
		
		char caracter = 'a'; // Un solo elemento y forzosamente con comillas simples
		//A diferencia de string solo es para un elemento. No soporta el caracter vacio ''
		
		System.out.println(caracter);
		
		caracter = 63+1; //valor ascii, no es el número
		
		System.out.println(caracter);
		
		//char segundoCaracter = caracter +1; //No se compila
		
		char segundoCaracter = (char) (caracter +1);
		System.out.println(segundoCaracter);
		
		//Para trabajar con palabras completas
		
		String palabra = "Hola mundo";
		System.out.println(palabra);
		
		palabra = palabra +" 2020";
		System.out.println(palabra);
	}
}
