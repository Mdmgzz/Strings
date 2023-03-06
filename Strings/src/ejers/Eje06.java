package ejers;

import java.util.Scanner;

public class Eje06 {

	public static void main(String[] args) {
		//bloque de variable
		String frase="";	// guardara la frase
		String buscador="";	//guarda la palabra buscadora
		int contador=0;		// contara las veces que aparece la palabra
		int inicio=0; 		// desde el valor de esta variable empezará a buscar 
		// creamos scanner
		Scanner sc= new Scanner(System.in);
		
		// preguntamos al usuario por la frase
		System.out.println("Introduce una frase: ");
		frase = sc.nextLine();
		
		// ahora preguntamos por la palabra buscadora
		System.out.println("Introduce la palabra que quieres buscar: ");
		buscador=sc.next();
	
		// creamos un array con la frase introducida, separando por espacios
		
		while (inicio>=0 && inicio<frase.length()) {
			inicio=(frase.indexOf(buscador,inicio));
		
			if (inicio!=-1) {
				inicio +=buscador.length();
				contador++;
			}
		}
		//mostramos el resultado
		System.out.println("La palabra "+buscador+" ha aparecido "+contador+" veces");
		
		//cerramos scanne
		sc.close();
	}

}
