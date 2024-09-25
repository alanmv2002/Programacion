package acitividad1.decroly.daw;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//. Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta, producto y división

		// Nombrar las variables
		
		
		Double num1, num2, suma, resta, multiplicacion, division; 
		
		//Pedir al usuacio los numeros
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Numero 1");
		
		num1 = scanner.nextDouble();
		
	
		Scanner scanner2 = new Scanner(System.in);
		
		System.out.println("Numero 2");
		
		num2 = scanner2.nextDouble();
		
		// Realizar las distintas operacion con los numeros
		suma = num1+num2;
		resta = num1-num2;
		multiplicacion = num1*num2;
		division = num1/num2;
		
		//mostrar resultados
		
		System.out.println("Resultado suma"+suma);
		System.out.println("Resultado resta"+resta);
		System.out.println("Resultado multiplicacion"+multiplicacion);
		System.out.println("Resultado division"+division);
	}

}
