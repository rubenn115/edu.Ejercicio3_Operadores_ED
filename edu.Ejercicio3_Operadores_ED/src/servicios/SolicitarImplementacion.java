/***
 * Ruben Bernal Ramos
 * CSI1
 */

package servicios;

import java.util.Scanner;

/***
 * Implementación de la interfaz solicitud
 * rbr - 101123
 */
public class SolicitarImplementacion implements SolicitarInterfaz {
	/***
	 * Método que solicitará por consola la primera cadena de texto
	 * rbr - 101123
	 */
	public String solicitarCadena1() {

		String cadena1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una palabra o frase: ");
		cadena1 = sc.next();
		return cadena1;
	}
	/***
	 * Método que solicitará por consola la segunda cadena de texto
	 * rbr - 101123
	 */
	public String solicitarCadena2() {

		String cadena2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe otra palabra o frase: ");
		cadena2 = sc.next();
		return cadena2;
	}
}
