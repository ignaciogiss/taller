/* TP1 Ejercicio 11
 * Grupo Nro.: 
 * Integrantes:Giss, Ignacio
 * Enunciado:
 * Realizá un programa que resuelva el siguiente problema:
 * Deberás solicitar el ingreso de una fecha de compra (String en el siguiente formato:
 * YYYYMMDD), un nombre de comprador, un nombre de producto y una cantidad y precio del
 * producto comprado. Mostrá a modo de ticket, la información ingresada y el monto a pagar.
 * Modelo de Ticket:
 * Fecha de Compra: YYYYMMDD
 * Nombre del Comprador: xxxxx xxxxx
 * Producto solicitado: xxxxx
 * Cantidad solicitada: xx
 * Precio Unitario: $xxx
 * Total a Pagar: $xxxxx
 */
package ejercicios;
import java.util.Scanner;

public class Test1Ejercicio11 {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Ingrese fecha de compra (YYYYMMDD):");
		String fecha = input.nextLine();
		
		System.out.println("Ingrese comprador:");
		String comprador = input.nextLine();
		
		System.out.println("Ingrese producto:");
		String producto = input.nextLine();
		
		System.out.println("Ingrese cantidad:");
		int cantidad = input.nextInt();
		input.nextLine();
		
		System.out.println("Ingrese precio:");
		int precio = input.nextInt();
		input.nextLine();
		
		imprimirTicket(fecha, comprador, producto, cantidad, precio);
		
		input.close();
	}
	
	private static void imprimirTicket(String fecha, String comprador, String producto, int cantidad, int precio) {
		System.out.println("Fecha de compra: " + fecha);
		System.out.println("Nombre del comprador: " + comprador);
		System.out.println("Producto solicitado: " + producto);
		System.out.println("Cantidad solicitada: " + cantidad);
		System.out.println("Precio Unitario: $" + precio);
		System.out.println("Total a pagar: $" + (cantidad * precio));
	}
}
