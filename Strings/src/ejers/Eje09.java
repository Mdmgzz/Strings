package ejers;

import java.util.Scanner;

public class Eje09 {
	
	public static char codifica(char[] conjunto1, char[] conjunto2, char c) {
		String conj1 = String.valueOf(conjunto1);				//Pasamos el array una cadena para poder buscar la posición de c
		int indice; 											//Para guardar el valor de la posición de c
		
		indice = conj1.indexOf(c); 							 	//buscamos la poscion del valor c y la guardamos en indice
		
		if(indice >= 0) { 										//si no devuelve -1 es que se puede codificar 
			c = conjunto2[indice]; 								//sustituimos el valor de c por el valor que le corresponde en el conjunto2
		}
		
		//devolvemos c
		return c;
	}

	public static void main(String[] args) {
		//bloque de variables
		char[] conjunto1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};			//el conjunto de valores a codificar
		char[] conjunto2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};			// los valores por los que se sustituyen
		String cad1;																		// lo que introduzca el usuario																		
		String codificacion="";													// el array con el resultado
		char c;																				// la letra a codificar
		
		//creamos scnnaer
		Scanner sc = new Scanner(System.in);
		
		// preguntamos
		System.out.println("Esta es la tabla de caracteres: " + String.valueOf(conjunto1) + "\nIntroduzca una palabra a codificar: ");
		cad1 = sc.next().toLowerCase();
		
		for(int i=0; i<cad1.length(); i++) {										 //pasamos por toda la palabra introducida
			c = cad1.charAt(i); 												 	 //Cogemos el caracter 'i' de la palabra
			codificacion+= codifica(conjunto1, conjunto2, c); 					 	//guardamos en la posicion la letra codificada
		}
		
		//mostramos el resultado
		System.out.println(String.valueOf(codificacion));
		
		//cierro scanner
		sc.close();

	}

}
