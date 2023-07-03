
public class TipoVariable {
	public static void main(String[] args) {
		
		double variable1 = 230.89;
		int variable1Entero = (int) variable1; // Esta conversion se llama cast
		
		System.out.println(variable1Entero);
		
		//Numeros muy grandes al final se escribe L o l
		
		long prueba = 122222222222222222L;
		
		System.out.println(prueba);
		
		//numero pequeño (casi no se usa)
		
		short prueba2  = 13555;
		
		//numero más pequeño (se usa pocas veces)
		byte prueba3 = 15;
		
		//numero decimal pequeño (casi no se usa)
		
		float numeroDecimalPequeno = 2.5F; //los nombres de las variables tienen que ser específicas.
	}
}
