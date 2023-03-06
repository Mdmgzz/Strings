package ejers;

import java.util.Scanner;

public class Eje05 {

	public static void main(String[] args) {
		final String FIN = "fin";		//creamos la variable global que es la palabra que identificara el final de la frase
		
		String cad1="";		// sera la cadena que guardara las palabras introducidas y las junta
		String palabra="";		// guardara la palabra introducida
		
		// creamos scanne
		Scanner sc= new Scanner(System.in);
		
		// creamos el bucle para que mientras no se escriba la palabra fin, se pregunte por otra palabra
		do {
			System.out.println("Introduce una palabra: ");
			palabra=sc.next();
			
			cad1 +=palabra+" ";
		}
		while (!palabra.equalsIgnoreCase(FIN)); {
			// en el caso que se haya escrito FIN se pasa la frase a un array y se elimina la ultima posicion
			cad1 = String.copyValueOf(cad1.toCharArray(), 0, (cad1.length()-1 - FIN.length()));
		}
		
		// mostramos la frase introducida
		System.out.println(cad1);
		
		// cerramos scanner ( estoy cansao de cerrarlo)
		sc.close();
	}
}


