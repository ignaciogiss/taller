/* TP1 Ejercicio 6
 * Grupo Nro.: 
 * Integrantes:Giss, Ignacio
 * Enunciado:
 *  Realizá un programa que solicite al usuario el ingreso por teclado un valor entero mayor
 * que 0 en una variable llamada num1 y muestre un mensaje por pantalla indicando "el
 * número es par" o "el número es impar". Deberá utilizar el operador “módulo” es el caracter %.
 */
package ejercicios;
import java.util.Scanner;

public class Test1Ejercicio6 {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		System.out.println("Ingrese un numero mayor a cero:");
		float num1 = input.nextInt();
		input.nextLine();
		if (num1 <0) {
			System.out.println("Mayor a cero te dije");
			input.close();
			return;
		}
		
		if (num1 % 2 == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}
		input.close();
	}

}
