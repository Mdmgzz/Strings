package ejers;

import java.util.Scanner;

public class Eje12 {

	public static String anagrama(String palabra1, String palabra2) {
		char[] p1 = palabra1.toCharArray(); 								//Pasamos las palabras a arrays
		char[] p2 = palabra2.toCharArray();
		String resultado; 													//guarda el resultado
		Boolean coincide = false; 											// te va a decir si coincide o n

		for (int i = 0; i < palabra1.length(); i++) {
			for (int j = 0; j < palabra2.length(); j++) {					 //Recorremos las palabras comparando
				if (p1[i] == p2[j]) { 
					coincide = true; 										//Mientras las letras tengan algún "match"
					p1[i] = ' '; 											//sustituimos la lectra que coincida por un espacio en blanco para que no vuelva a coincidir
					p2[j] = ' ';
					break;
				}
			}
			if (!coincide) { 												//si alguna letra no coincide con el resto de letras de la otra palabra salimos
				break;
			}
		}

		resultado = coincide ? "Las palabras SON anagramas" : "Las palabras NO SON anagramas.";
		// devolvemos resultado
		return resultado;
	}
	public static void main(String[] args) {
		String palabra1; //Guarda la primera palabra 
		String palabra2; //Guarda la segunda palabra 

		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//preguntamos
		System.out.println("Introduzca la primera palabra: ");
		palabra1 = sc.next();
		System.out.println("Introduzca la segunda palabra: ");
		palabra2 = sc.next();

		// si las palabras tienen el mismo tamaño comprueba si son anagramas o no y si no tienen el mismo tamaño muestra el error
		System.out.println(palabra1.length() == palabra2.length() ? anagrama(palabra1, palabra2) : "No tienen el mismo tamño"); 

		//cerrmos scanner
		sc.close();

	}

}
