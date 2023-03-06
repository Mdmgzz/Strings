package ejers;

import java.util.Scanner;

public class Eje07 {
	public static String dateUnaVuelta(String cad1) {
		String cad2="";		// es la que va a ir guardando la cadena 1 al reves 
		
		for (int i=cad1.length()-1; i>=0; i--) {
			cad2 += cad1.charAt(i);						//vuela  a vuelta creamos la cad2 con las letras de la cad1 empezando por el final
		}	
		System.out.println(cad2);
		return cad2;
	}

	public static void main(String[] args) {
		String cad1; //Guarda la frase 
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//preguntasmos
		System.out.println("Introduzca una cadena: "); 
		cad1 = sc.nextLine();
		
		//Eliminamos los espacios de la oración por un caracter vacio
		cad1= cad1.replaceAll(" ", ""); 									

		System.out.println(dateUnaVuelta(cad1).equalsIgnoreCase(cad1) ? "La cadena introducida es un palíndromo."
				: "La cadena introducida no es un palíndromo.");			// valor ternario: si la cadena 1 del reves es igual a cadena 1, esta sera palindroma , sino, no 
		
		//cerramos scanner
		sc.close();
	}

}
