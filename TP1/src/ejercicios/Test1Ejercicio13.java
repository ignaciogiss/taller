/* TP1 Ejercicio 13
 * Grupo Nro.: 
 * Integrantes:Giss, Ignacio
 * Enunciado:
 * Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
 * • Si trabaja 40 horas o menos se le paga $16 por hora (crear una constante para almacenar el 16)
 * • Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20
 * por cada hora extra. (crear una constante para almacenar el 20)
 * Pedir al usuario que ingrese la cantidad de horas trabajadas en la semana, y mostrar por
 * pantalla el salario correspondiente.
 */
package ejercicios;
import java.util.Scanner;

public class Test1Ejercicio13 {
	
	private static Scanner input;
	private static final int VALOR_HORA_NORMAL = 16;
	private static final int VALOR_HORA_EXTRA = 20;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de horas trabajadas en la semana: ");	
		int horasTrabajadas = input.nextInt();
		input.nextLine();
		
		int salario = 0;
		if (horasTrabajadas <= 40) {
			salario = horasTrabajadas * VALOR_HORA_NORMAL;
		} else {
			salario = 40 * VALOR_HORA_NORMAL + (horasTrabajadas - 40) * VALOR_HORA_EXTRA;
		}
		
		System.out.println("Su salario es: " + salario);
		
		input.close();
	}
}
