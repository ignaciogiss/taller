/* TP1 Ejercicio 12
 * Grupo Nro.: 
 * Integrantes:Giss, Ignacio
 * Enunciado:
 * En un casino de juegos se desea mostrar los mensajes respectivos por el puntaje
 * obtenido en el lanzamiento de tres dados de un cliente, de acuerdo a los siguientes
 * resultados:
 * • Si los tres dados son seis, mostrar el mensaje “Excelente”
 * • Si dos dados son seis, mostrar el mensaje “Muy bien”
 * • Si un dado es seis, mostrar el mensaje “Regular”
 * • Si ningún dado se obtiene seis, mostrar el mensaje “Insuficiente”
 */
package ejercicios;
import java.util.Random;
import java.util.Scanner;

public class Test1Ejercicio12 {
	
	private static Scanner input;
	private static final int MAX_DADO = 6;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		Random random = new Random();
		
		int contadorDe6 = 0;
		System.out.println("Lanzar primer dado (Presione Enter):");
		input.nextLine();
		int dado1 = random.nextInt(MAX_DADO) + 1;
		System.out.println("El primer dado salió: " + dado1 + "\n");
		if (dado1 == MAX_DADO) {
			contadorDe6 +=1;
		}
		
		System.out.println("Lanzar segundo dado (Presione Enter):");
		input.nextLine();
		int dado2 = random.nextInt(MAX_DADO) + 1;
		System.out.println("El segundo dado salió: " + dado2 + "\n");
		if (dado2 == MAX_DADO) {
			contadorDe6 +=1;
		}
		
		System.out.println("Lanzar tercer dado (Presione Enter):");
		input.nextLine();
		int dado3 = random.nextInt(MAX_DADO) + 1;
		System.out.println("El tercer dado salió: " + dado3 + "\n");
		if (dado3 == MAX_DADO) {
			contadorDe6 +=1;
		}
	
		switch (contadorDe6) {
			case 3: 
				System.out.println("Excelente");
				break;
			case 2: 
				System.out.println("Muy bien");
				break;
			case 1: 
				System.out.println("Regular");
				break;
			case 0: 
				System.out.println("Insuficiente");
				break;
				
		}
		
		
		input.close();
	}
}
