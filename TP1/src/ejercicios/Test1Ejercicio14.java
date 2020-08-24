/* TP1 Ejercicio 14
 * Grupo Nro.: 
 * Integrantes:Giss, Ignacio
 * Enunciado:
 * Construir un programa que simule el funcionamiento de una calculadora que puede
 * realizar las cuatro operaciones aritméticas básicas (suma, resta, producto y división) con
 * valores numéricos enteros.
 * En un principio, el usuario debe especificar la operación que desea realizar (s para la suma,
 * r para la resta, p para el producto y d para la división) y luego, deberá ingresar dos números
 * enteros para así realizar la operación. Informar el resultado por pantalla.
 * Nota: Se recomienda el empleo de una sentencia switch.
 */
package ejercicios;
import java.util.Scanner;

public class Test1Ejercicio14 {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		System.out.println("Ingrese la operación: ");
		char operacion = input.next().charAt(0);
		
		System.out.println("Ingrese primer operando: ");
		int operando1 = input.nextInt();
		input.nextLine();
		
		System.out.println("Ingrese segundo operando: ");
		int operando2 = input.nextInt();
		input.nextLine();
		int resultado = 0;
		switch (operacion) {
			case 's':
				resultado = operando1 + operando2;
				break;
			case 'r':
				resultado = operando1 - operando2;
				break;
			case 'p':
				resultado = operando1 * operando2;
				break;
			case 'd':
				if (operando2 == 0) {
					System.out.println("no se puede dividir por cero");
					return;
				}
				resultado = operando1 / operando2;
				break;
			default:
				System.out.println("operación invalida");
				return;
		}
		System.out.println("resultado: " + resultado);
		
		input.close();
	}
}
