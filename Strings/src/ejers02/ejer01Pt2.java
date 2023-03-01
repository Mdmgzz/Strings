package ejers02;

import java.util.Scanner;

public class ejer01Pt2 {

	public static void main(String[] args) {
		//bloque de variables
		String sentencia;				// se guardara la sentencia
		String cad1;					// se creara la subcadena aqui
		
			
		//creamos scanner
		Scanner sc= new Scanner (System.in);
		//preguntamos al usuario por la sentencia
		System.out.println("Introduce una sentencia:");
		//leemos la sentencia
		sentencia= sc.nextLine();
		// la mostramos
		System.out.println(sentencia);
				
		cad1=sentencia.substring(sentencia.length());
		
		int buscar=sentencia.indexOf("/*");
		//int Final=sentencia.indexOf("/*");
		
		for (int i=0; i<sentencia.length();i++) {
			cad1
		}
				
		// cerramos scanner
		sc.close();
	}
}