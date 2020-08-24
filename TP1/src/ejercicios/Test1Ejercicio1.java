/* TP1 Ejercicio 1
 * Grupo Nro.: 
 * Integrantes:Giss, Ignacio
 * Enunciado:
 * Realizá un programa donde se cree una variable entera llamada num1, que inicialmente
 * valdrá 0. Luego incrementá su valor en 2 y mostralo por pantalla. Después mostrá el
 * resultado de multiplicarlo por sí mismo.
 */
package ejercicios;

public class Test1Ejercicio1 {

	public static void main(String[] args) {
		int num1 = 0;
		num1 += 2;
		
		System.out.println("num1 vale: " + num1);
		
		System.out.println("num1 multiplicado consigo mismo vale: " + num1*num1);

	}

}
