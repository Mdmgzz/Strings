package ejers;

import java.util.Scanner;

public class Eje03 {

	public static void main(String[] args) {
		// bloque de variables
				String frase1;				// se guardara la primera frase
				int contador=0; 				// Contara los espacios en blanco
				int buscador=0;				// guarda la poscion del espacio en blanco que ha encontrado
				//Creamos scanner 
				Scanner sc= new Scanner (System.in);
				
				//preguntamos al usuario
				System.out.println("Introduce una frase:");
				frase1=sc.nextLine();					// lo guardamos en la variable frase1 
				
				for (int i=0;i<frase1.length();i++) {	//el bucle se ejecuta cuantas veces caracteres tenga el string
					if ( frase1.indexOf(" ",buscador)==i) {	// si el al buscar el caracter " " el resultado es igual a i se suma 1 al contador 
						contador++;
					}
					buscador=i;								// cada vuelta el bucle va empezando un espacio mas para alante
				}
				System.out.println(contador + " espacios hay en la frase");			// muestra la cantidad de espacios
				
				// cerramos scanner
				sc.close();
	}

}
