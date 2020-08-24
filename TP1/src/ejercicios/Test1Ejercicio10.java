/* TP1 Ejercicio 10
 * Grupo Nro.: 
 * Integrantes:Giss, Ignacio
 * Enunciado:
 * Realizá un programa que resuelva el siguiente problema: Nos piden desarrollar un
 * programa que informe si un estacionamiento se encuentra o no abierto según la hora
 * ingresada por el usuario.
 * Nosotros sabemos que el estacionamiento se encuentra abierto entre las 10 y las 18hs.
 * (Crear constante HORA_APERTURA = 10, y HORA_CIERRE = 18).
 * Al iniciar el programa, se le pedirá al usuario que ingrese la hora, y deberemos setear una
 * variable booleana llamada estaAbierto en true o false, según corresponda, e informar por
 * pantalla mediante la misma si el estacionamiento se encuentra abierto o no.
 * Obs: En el caso de que el usuario ingrese una hora menor a 0 o mayor a 24, mostrar el
 * mensaje: “Ha ingresado una hora incorrecta”
 */
package ejercicios;
import java.util.Scanner;

public class Test1Ejercicio10 {
	
	private static Scanner input;
	private static final int HORA_APERTURA = 10;
	private static final int HORA_CIERRE = 18;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Ingresar hora:");
		int hora = input.nextInt();
		input.nextLine();
		if (hora < 0 || hora > 24) {
			System.out.println("Ha ingresado una hora incorrecta");
			input.close();
			return;
		}
		
		boolean estaAbierto = hora > HORA_APERTURA && hora < HORA_CIERRE;
		
		if (estaAbierto) {
			System.out.println("Está abierto");
		} else {
			System.out.println("Está cerrado");
		}
		input.close();
	}
}
