package ejers;

import java.util.Arrays;
import java.util.Scanner;

public class Eje10 {

		public static char deCodifica(char[] conjunto1, char[] conjunto2, char c) {
			String conj2 = String.valueOf(conjunto2);				//Pasamos el array una cadena para poder buscar la posición de c
			int indice; 											//Para guardar el valor de la posición de c
			
			indice = conj2.indexOf(c); 							 	//buscamos la poscion del valor c y la guardamos en indice
			
			if(indice >= 0) { 										//si no devuelve -1 es que se puede codificar 
				c = conjunto1[indice]; 								//sustituimos el valor de c por el valor que le corresponde en el conjunto1
			}
			
			//devolvemos c
			return c;
		}

		public static void main(String[] args) {
			//bloque de variables
			char[] conjunto1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};			//el conjunto de valores a codificar
			char[] conjunto2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};			// los valores por los que se sustituyen
			String cad1;																		// lo que introduzca el usuario																		
			char[] codificacion = new char[0];													// el array con el resultado
			char c;																				// la letra a codificar
			
			//creamos scnnaer
			Scanner sc = new Scanner(System.in);
			
			// preguntamos
			System.out.println("Esta es la tabla de caracteres: " + String.valueOf(conjunto1) + "\nIntroduzca una palabra que este codificada: ");
			cad1 = sc.next().toLowerCase();
			
			for(int i=0; i<cad1.length(); i++) {										 //pasamos por toda la palabra introducida
				c = cad1.charAt(i); 												 	 //Cogemos el caracter 'i' de la palabra
				codificacion = Arrays.copyOf(codificacion, codificacion.length+1); 		 //aumentamos en 1
				codificacion[i] = deCodifica(conjunto1, conjunto2, c); 					 //guardamos en la posicion la letra codificada
			}
			
			//mostramos el resultado
			System.out.println(String.valueOf(codificacion));
			
			//cierro scanner
			sc.close();

		}

	}
