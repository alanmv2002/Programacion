package acitividad1.decroly.daw;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escribe un programa que dado el precio de un artículo y el precio de venta real nos muestre el porcentaje de descuento realizado
	
		// Declaro las variables para los precios y el descuento
	Double precioreal, preciodesc, descuento;
	
		// Pido al usuario los precios
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("precio con descuento");
	
	preciodesc = scanner.nextDouble();
	
	Scanner scanner2 = new Scanner(System.in);
	
	System.out.println("precio real");
	
	//Operacion para saber el descuento y el resultado
	
	precioreal = scanner2.nextDouble();
	
	descuento = preciodesc/precioreal*100;
	System.out.println(descuento + "%");
	
	}
	

}
