package ejers;

import java.util.Scanner;

public class Eje11 {
	public static void laMax(String[] palabras) {
		String larga = ""; 											 // Guarda la palabra más larga

		for (int i = 0; i < palabras.length; i++) {					 // Recorremos el array 
			if (palabras[i].length() > larga.length()) { 			 // si i es mas grande que la variable larga, se reemplaza
															
				larga = palabras[i];
			}
		}

		System.out.println("La palabra más larga es " + larga );
		System.out.println("su longitud es de:"+ larga.length() + " letras.");
	}

	public static void main(String[] args) {
		//bloque de variables
		String cad; 							// Guarda la cadena introducida por teclado
		String[] palabras; 						//al crear el array se guardaran las palabras por separado

		//creamos scanner
		Scanner sc = new Scanner(System.in);
		//preguntamos
		System.out.println("Introduzca una oración: ");
		cad = sc.nextLine();

		palabras = cad.split(" "); 				//hacemos un split por los espacios

		laMax(palabras); 						// Llamamos a la funcion

		//cerramos scanner
		sc.close();

	}

}
