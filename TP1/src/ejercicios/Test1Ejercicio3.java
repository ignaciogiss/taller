/* TP1 Ejercicio 3
 * Grupo Nro.: 
 * Integrantes:Giss, Ignacio
 * Enunciado:
 * Realizá un programa que muestre por pantalla un mensaje pidiéndole al usuario que
 * ingrese su nombre, y luego muestre un mensaje de bienvenida incluyendo el mismo.
 */
package ejercicios;
import java.util.Scanner;

public class Test1Ejercicio3 {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre:");
		String nombre = input.nextLine();
		
		System.out.println("Bienvenido " + nombre);
		input.close();
	}

}
