package ejers;

import java.util.Scanner;

public class Eje08 {
	
	// con esta funcion detectamos en que idioma esta escrito la frase
	public static void javalandiano(String cad) { 
		String javalandia; 						// guarda el resultado
		
		// si esta escrito en javalandia se llama a traduccion
		// si no necesita de traduccion se llama a la funcion español
		javalandia = (cad.startsWith("Javalin, javalon, \t") || cad.endsWith("\t" + "javalen, len, len")) ? traductor(cad): español(); 					
		
		// muestra el resultado
		System.out.println(javalandia); 		
	}
	
	// esta funcion se utiliza para traducir la frase original quitandole las muletillas
	public static String traductor(String cad) {
		String texto;
		int indice;

		// buscamos si la funcion empieza con la muletilla
		if (cad.startsWith("Javalin, javalon," + "\t")) {
			indice = cad.indexOf("\t");				// guardara la posicion del tabulador	
			texto = cad.substring(indice);			// crea un substring a partir del indice
		} else {
			indice = cad.indexOf("\t");				
			texto = cad.substring(0, indice);		// si no empieza por la muletilla es porque acaba por una muletilla, se crea el substring desde 0 hasta antes de empezar la muletilla
		}

		return "La cadena escrita javalandia: " + texto;
	}
	
	// si se llama a esta funcion es porque la oracion esta en español 
	public static String español() {
		return "La cadena introducida está escrita en español.";
	}


	public static void main(String[] args) {
		String cad; //Guarda la cadena introducida por teclado

		//creamos scanner
		Scanner sc = new Scanner(System.in); 

		//preguntamos
		System.out.println("Introduzca una oración en algún idioma: ");
		cad = sc.nextLine();
		
		// se llama a la funcion javalandiano
		javalandiano(cad); 						
		
		//cerramos scanner
		sc.close();
	}
	
	
}
