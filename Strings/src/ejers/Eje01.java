package ejers;

import java.util.Scanner;

public class Eje01 {

	public static void main(String[] args) {
		// bloque de variables
		String frase1;				// se guardara la primera frase
		String frase2;				// se guardara la segunda frase
		//Creamos scanner 
		Scanner sc= new Scanner (System.in);
		
		//preguntamos al usuario
		System.out.println("Introduce una frase:");
		frase1=sc.nextLine();						
		System.out.println("Introduce una frase:");
		frase2=sc.nextLine();
		
		
		// comparamos las 3 cadenas para ver cual es mas larga
		
		if (frase1.length()<frase2.length()) {		// si la frase 1 es mas corta que la frase 2
			System.out.println("La 1º frase es mas corta que la 2º");		
		}else {										// si la condicion no se cumple
			System.out.println("La 2º frase es mas corta que la 1º");
		}
		
		//cerramos scanner
		sc.close();
	}

}
