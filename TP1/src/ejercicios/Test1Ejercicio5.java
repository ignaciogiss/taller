/* TP1 Ejercicio 5
 * Grupo Nro.: 
 * Integrantes:Giss, Ignacio
 * Enunciado:
 * Realizá un programa que, dados dos números enteros num1 y num2 cargados desde
 * teclado por el usuario, muestre el resultado de la división del primero por el segundo
 * siguiendo el formato num1 + “ / “ + num2 + “ = “ + resultado.
 * En el caso de que el segundo valor num2 sea cero, mostrar el siguiente mensaje de error:
 * “No se puede dividir por cero”.
 */
package ejercicios;
import java.util.Scanner;

public class Test1Ejercicio5 {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		System.out.println("Ingrese un numero:");
		float num1 = input.nextInt();
		input.nextLine();
		
		System.out.println("Ingrese otro numero:");
		float num2 = input.nextInt();
		input.nextLine();
		
		if (num2 == 0) {
			System.out.println("No se puede dividir por cero");
		} else {
			float resultado = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + resultado);
		}
		input.close();
	}

}
