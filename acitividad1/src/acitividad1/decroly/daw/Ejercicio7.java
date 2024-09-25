package acitividad1.decroly.daw;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Escribe un programa que lea un valor correspondiente a una distancia en millas marinas y escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros
	
		// declarar las variables para millas y metros
		
		Double dmillasmarinas, dmetros;
		
		//pedir el balor en millas al usuario
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Millas Marinas");
		
		dmillasmarinas = scanner.nextDouble();
		
		//hacer la operacion y mostrar resultado
		
		dmetros = dmillasmarinas*1852;
		
		System.out.println("La distancia en metros "+ dmetros);
	}
}
