/* TP1 Ejercicio 15
 * Grupo Nro.: 
 * Integrantes:Giss, Ignacio
 * Enunciado:
 * Existen dos reglas que identifican dos conjuntos de valores:
 * - El número es de un solo dígito.
 * - El número es impar.
 * A partir de estas reglas, creá un algoritmo que asigne a las variables booleanas estaEnA,
 * estaEnB, estaEnAmbos y noEstaEnNinguno el valor verdadero o falso, según corresponda,
 * para indicar si el valor ingresado pertenece al primer conjunto, al segundo, a ambos o a
 * ninguno, respectivamente. Definí un lote de prueba de varios números y probá el algoritmo,
 * escribiendo los resultados.
 */
package ejercicios;

public class Test1Ejercicio15 {

	public static void main(String[] args) {
		int[] testValores = {1, 2, 3, 10, 22, 23, 100, 123, 0, -1, -2, -22, -23};
		boolean[] testEstaEnA         = {true, true, true, false, false, false, false, false, true, true, true, false, false};
		boolean[] testEstaEnB         = {true, false, true, false, false, true, false, true, false, true, false, false, true};
		boolean[] testEstaEnAmbos     = {true, false, true, false, false, false, false, false, false, true, false, false, false};
		boolean[] testNoEstaEnNinguno = {false, false, false, true, true, false, true, false, false, false, false, true, false};
		
		for (int i = 0; i < testValores.length; i++) {
			boolean estaEnA = testValores[i] < 10 && testValores[i] > -10;
			boolean estaEnB = testValores[i] % 2 != 0;
			boolean estaEnAmbos = estaEnA && estaEnB;
			boolean noEstaEnNinguno = !estaEnA && !estaEnB;
			
			System.out.println("Caso de test " + i);
			if (estaEnA == testEstaEnA[i]
					&& estaEnB == testEstaEnB[i]
					&& estaEnAmbos == testEstaEnAmbos[i]
					&& noEstaEnNinguno == testNoEstaEnNinguno[i]) {
				System.out.println("Resultado OK\n");
			} else {
				System.out.println("Resultado ERROR\n");
			}
			
		}
	}
}
