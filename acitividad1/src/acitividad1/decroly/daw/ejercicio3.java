package acitividad1.decroly.daw;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//3. Escribe un programa que calcule el área de un cuadrado cuyo lado se introduce por teclado

		
		
// Crear un objeto Scanner para leer la entrada del usuario
        
       
Scanner scanner = new Scanner(System.in);
        
        
       

  
// Pedir al usuario que introduzca el valor del lado del cuadrado
        System.out.print("Introduce el valor del lado del cuadrado: ");
        double lado = scanner.nextDouble();  // Leer el valor como un número decimal
        
        
 
// Calcular el área del cuadrado
        double area = lado * lado;
        
        
        
       
// Mostrar el resultado
        System.out.println("El área del cuadrado es: " + area);
		
	}

}
