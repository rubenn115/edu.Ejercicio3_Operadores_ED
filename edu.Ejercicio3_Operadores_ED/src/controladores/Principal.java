/***
 * Ruben Bernal Ramos
 * CSI1
 */

package controladores;

import servicios.MenuInterfaz;
import servicios.MenuImplementacion;
import servicios.SolicitarInterfaz;
import servicios.SolicitarImplementacion;
import servicios.CalcularInterfaz;
import servicios.CalcularImplementacion;

import java.util.Scanner;

/***
 * Clase principal de la aplicación
 * rbr - 101123
 */
public class Principal {
	/***
	 * Método principal de la aplicación
	 * rbr - 101123
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaro las variables
		String cadena1, cadena2;
		int opcion;
		
		//Declaro la variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Instancio las interfaces con sus implementaciones
		MenuInterfaz mi = new MenuImplementacion();
		SolicitarInterfaz si = new SolicitarImplementacion();
		CalcularInterfaz ci = new CalcularImplementacion();
		
		do {
			//Muestro el menú por consola
			mi.mostrarMenu();
			//Elijo la opción
			opcion = sc.nextInt();
			switch(opcion) {
				case 1:
					break;
				case 2:
					System.out.println("Has seleccionado la opción igualdad");
					cadena1 = si.solicitarCadena1();
					cadena2 = si.solicitarCadena2();
					ci.igualdad(cadena1, cadena2);
					break;
				case 3:
					System.out.println("Has seleccinado la opción desigualdad");
					cadena1 = si.solicitarCadena1();
					cadena2 = si.solicitarCadena2();
					ci.desigualdad(cadena1, cadena2);
					break;
				default:
					System.err.println("***Esa opción no es válida***");
					break;
			}
		}while(opcion!=1);
	}

}
