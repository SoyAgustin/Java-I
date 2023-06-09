
public class EjemploCondicionales {
	public static void main(String[] args) {
		// sysout + ctrl+space autocompleta System.out.println();

		int edad = 28;
		int cantidad = 2;

		if (edad >= 18) {
			System.out.println("Puede entrar");
			System.out.println("Bienvenido");
		} // Se pueden quitar las llaves pero solo se va a ejecutar la primera línea
			// despues del if
		if (edad >= 18) {
			System.out.println("Puede entrar");
		} else {
			if (cantidad >= 2) {
				System.out.println("Usted tiene menos edad pero puede entrar");
			} else {
				System.out.println("No puede entrar");
			}
			System.out.println("No puede entrar");
		}
	}
}
