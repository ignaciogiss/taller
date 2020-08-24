/* TP1 Ejercicio 8
 * Grupo Nro.: 
 * Integrantes:Giss, Ignacio
 * Enunciado:
 *  Suponiendo que el primer día de la semana es el Domingo, pedir un número entre 1 y 7
 * (inclusive) y mostrar el nombre del día correspondiente. Si el día no está en el rango
 * permitido debe emitir por pantalla el mensaje de error "El día ingresado no es válido".
 */
package ejercicios;
import java.util.Scanner;

public class Test1Ejercicio8 {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		System.out.println("Ingrese un número de día de la semana:");
		int num1 = input.nextInt();
		input.nextLine();
		
		if (num1 < 1 || num1 > 7) {
			System.out.println("El día ingresado no es válido");
			input.close();
			return;
		}
		
		switch (num1) {
			case 1:
				System.out.println("El día es Domingo");
				break;
			case 2:
				System.out.println("El día es Lunes");
				break;
			case 3:
				System.out.println("El día es Martes");
				break;
			case 4:
				System.out.println("El día es Miércoles");
				break;
			case 5:
				System.out.println("El día es Jueves");
				break;
			case 6:
				System.out.println("El día es Viernes");
				break;
			case 7:
				System.out.println("El día es Sábado!");
				break;
		}
		input.close();
	}
}
