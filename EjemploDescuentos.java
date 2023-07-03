
public class EjemploDescuentos {
	public static void main(String[] args) {
		double valorCompra = 350.0;
		
		boolean descuento10 = valorCompra >=100 && valorCompra <=199.99;
		
		boolean descuento15 = valorCompra >=200.00 && valorCompra <= 299.99;
		
		boolean descuento20 = valorCompra >300.0;
		
		double precioFinal;
		
		if(descuento10){
			precioFinal = valorCompra - 0.1*valorCompra;
			System.out.println("El precio final de su compra es con 10% de descuento: "+precioFinal);
		}
		if(descuento15){
			precioFinal = valorCompra - 0.15*valorCompra;
			System.out.println("El precio final de su compra es con 15% de descuento: "+precioFinal);
		}
		if(descuento20){
			precioFinal = valorCompra - 0.2*valorCompra;
			System.out.println("El precio final de su compra es con 20% de descuento: "+precioFinal);
		}
		
		
	}
}
