package acitividad1.decroly.daw;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Poner las variables para hacer los calculos de circulo, area y volumen

	Double radio, circulo, area, volumen;
	
		// Pedir al usuario el radio
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("radio de la circunferencia");
	
	radio = scanner.nextDouble();
	
	
		// Utilizar las variables para hacer los calculos
	circulo = 2*radio*Math.PI;
	area = Math.PI* radio*radio;
	volumen = 4/3*Math.PI*radio*radio*radio;
	
		//Marcar los resultados para que sean visibles
	System.out.println("El rango del circulo es "+circulo);
	System.out.println("El area de la circunferencia es "+area);
	System.out.println("El volumen de la circunferencia es "+volumen);
	}

}
