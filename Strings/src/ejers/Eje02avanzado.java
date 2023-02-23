package ejers;

import java.util.Scanner;

public class Eje02avanzado {

	public static void main(String[] args) {
		// bloque de variables
		String contraseña;
		String intento;
		
		// creamos scanner 
		Scanner sc= new Scanner (System.in);
				
		//preguntamos al jugador 1 por la contraseña
		System.out.println("Cual será la contraseña: ");
		contraseña=sc.next();
				
		do {
		// ahora preguntamos al usuario que intente adivinar la contraseña
		System.out.println("Intenta adivinar la contraseña: ");
		intento=sc.next();
		if (!contraseña.equals(intento)) {
			if (contraseña.length()>intento.length()) {
				System.out.println("La contraseña es mas larga.");
			}else {
				System.out.println("La contraseña es mas corta.");
			}
		}
		}while(!contraseña.equals(intento));
				
		System.out.println("MUY BIEN , HAS ACERTADO.");
				
		//cerramos scanner
		sc.close();
	}

}
