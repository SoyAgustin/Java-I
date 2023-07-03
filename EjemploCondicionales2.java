
public class EjemploCondicionales2 {
	public static void main(String[] args) {

		int edad = 28;
		int cantidadPersonas = 2;
		
		boolean esPareja = cantidadPersonas>1; 
		boolean esMayor = edad>=18;
		
		if (esMayor || esPareja) {
			System.out.println("Puede entrar");
		} else {
				System.out.println("No puede entrar");
		}
	}
}
//operador or = ||
//operador and = &&