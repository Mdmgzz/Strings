package ejers;

import java.util.Scanner;

public class Eje04 {
	
	public static void dateUnaVuelta(String cad1) {
		String cad2="";		// es la que va a ir guardando la cadena 1 al reves 
		
		for (int i=cad1.length()-1; i>=0; i--) {
			cad2 += cad1.charAt(i);						//vuela  a vuelta creamos la cad2 con las letras de la cad1 empezando por el final
		}	
		System.out.println(cad2);
	}

	public static void main(String[] args) {
		// bloque de variables
		String cad1;
		
		// creamos scanner 
		Scanner sc= new Scanner(System.in);
		
		// preguntamos por una frase
		System.out.println("Introduzca una frase: ");
		cad1=sc.nextLine();
		
		//llamamos a la funcion
		dateUnaVuelta(cad1);
		//cerramos scanner
		sc.close();
	}

}
