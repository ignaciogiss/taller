/* TP1 Ejercicio 9
 * Grupo Nro.: 
 * Integrantes:Giss, Ignacio
 * Enunciado:
 * Realizá un programa que resuelva el siguiente problema:
 * Tres personas aportan diferente capital a una sociedad. Se desea saber qué porcentaje del
 * total aportó cada una (indicando nombre y porcentaje) y cuál es el monto del total aportado
 * por las tres.
 * Pedir por pantalla el ingreso del capital aportado por cada una de las personas y luego
 * mostrar lo pedido en el siguiente formato:
 * Nombre: capital aportado: $ … , Porcentaje del capital: %.... , Monto total aportado: $ ….
 */
package ejercicios;
import java.util.Scanner;

public class Test1Ejercicio9 {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		String nombre1 = ingresarNombre();
		int capital1 = ingresarCapital();
		
		String nombre2 = ingresarNombre();
		int capital2 = ingresarCapital();
		
		String nombre3 = ingresarNombre();
		int capital3 = ingresarCapital();
		
		int total = capital1 + capital2 + capital3;
		
		imprimirDatos(nombre1, capital1, total);
		imprimirDatos(nombre2, capital2, total);
		imprimirDatos(nombre3, capital3, total);
		System.out.println("Monto total aportado: $" + total);
		input.close();
	}
	
	private static String ingresarNombre() {
		System.out.println("Nombre:");
		String nombre = input.nextLine();
		return nombre;
		
	}
	
	private static int ingresarCapital() {
		System.out.println("Capital aportado:");
		int num = input.nextInt();
		input.nextLine();
		return num;
	}
	
	private static void imprimirDatos(String nombre, int capital, int total) {
		float porcentaje = porcentajeDelTotal(capital, total);
		System.out.println("Nombre: " + nombre 
				+ " capital aportado: $" + capital
				+ ", Porcentaje del capital: %" + porcentaje);
	}
	
	private static float porcentajeDelTotal(int capital, int total) {
		return (capital * 100f ) / total;
	}
}
