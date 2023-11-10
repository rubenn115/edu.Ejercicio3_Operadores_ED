/***
 * Ruben Bernal Ramos
 * CSI1
 */

package servicios;

/***
 * Implementación de la interfaz calcular
 * rbr - 101123
 */
public class CalcularImplementacion implements CalcularInterfaz {

	/***
	 * Método que controlará la igualdad entre las dos cadenas de texto
	 * rbr - 101123
	 */
	public void igualdad(String cadena1, String cadena2) {
		Boolean resultado;
		if(cadena1.equals(cadena2)==true) {
			resultado = true;
			System.out.println("Resultado de la igualdad: " + resultado);
		}
		else {
			resultado = false;
			System.out.println("Resultado de la igualdad: " + resultado);
		}
	}

	/***
	 * Método que controlará la desigualdad entre las dos cadenas de texto
	 * rbr - 101123
	 */
	public void desigualdad(String cadena1, String cadena2) {
		Boolean resultado;
		if(cadena1.equals(cadena2)==false) {
			resultado = true;
			System.out.println("Resultado de la desigualdad: " + resultado);
		}
		else {
			resultado = false;
			System.out.println("Resultado de la desigualdad: " + resultado);
		}
	}

}
