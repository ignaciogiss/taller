/* TP1 Ejercicio 4
 * Grupo Nro.: 
 * Integrantes:Giss, Ignacio
 * Enunciado:
 *  Realizá un programa que pida al usuario ingresar dos números enteros num1 y num2.
 * Luego, mostrar el resultado de la suma entre ambos, utilizando el siguiente formato: “La
 * suma entre “ + num1 + “ y “ + num2 + “ da como resultado “ + num1 + num2
 */
package ejercicios;
import java.util.Scanner;

public class Test1Ejercicio4 {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		System.out.println("Ingrese un numero:");
		int num1 = input.nextInt();
		input.nextLine();
		
		System.out.println("Ingrese otro numero:");
		int num2 = input.nextInt();
		input.nextLine();
		
		int suma = num1 + num2;
		
		System.out.println("La suma entre " + num1 + " y " + num2 + " da como resultado " + suma);
		input.close();
	}

}
