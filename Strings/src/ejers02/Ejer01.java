package ejers02;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		//bloque de variables
		String sentencia;				// se guardara la sentencia
		
		//creamos scanner
		Scanner sc= new Scanner (System.in);
		//preguntamos al usuario por la sentencia
		System.out.println("Introduce una sentencia:");
		//leemos la sentencia
		sentencia= sc.nextLine();
		// la mostramos
		System.out.println(sentencia);
		
		// convertimos la linea en un array separado por "/"
		
		String[] array = sentencia.split("/");
		
		//mostramos el array 
		System.out.println(Arrays.toString(array));
		
		// elimminamos las posiciones que contengan un asterisco "*"
		for (int i=0;i<array.length;i++) {
			if (array[i].startsWith("*")){			// si la posicion del array empieza por * se elimina
				System.arraycopy(array, i+1, array, i, array.length-i-1);
				array=Arrays.copyOf(array,array.length-1);
			}
		}
		//mostramos el array 
			for (int i=0; i<array.length;i++) {
				System.out.print(array[i]);
			}
		
		
		// cerramos scanner
		sc.close();

	}

}
