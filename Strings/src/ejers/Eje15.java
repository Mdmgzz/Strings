package ejers;

import java.util.Arrays;
import java.util.Scanner;

public class Eje15 {
	
	public static String desordena(String cad) {
		
		char[] cadena = cad.toCharArray(); 									//pasamos a un array
		char[] cadDes = new char[cadena.length]; 							//se guardara la palabra desordernada
		int[] descartar = new int[0]; 										//guardaremos la posicion de las letras que ya se hayan usado
		int poscion = 0; 													//Para guardar una posición aleatoria de la palabra
		
		for(int i=0; i<cadena.length; i++) { 								//Recorremos la palabra
			
			do { 
				poscion = (int)(Math.random()*cadena.length); 				//elegimos una poscion aleatoria
				cadDes[i] = cadena[poscion]; 								//ponemos la poscion elegida en i
			}while(repetido(descartar, poscion)); 							//se repetira hasta que no haya niguna letra por usar
			
			descartar = Arrays.copyOf(descartar, descartar.length+1); 				//aumentamos el tamaño en1
			descartar[descartar.length-1] = poscion; 								//ponemos la poscion de la letra en el hueco creado
		}
		
			return String.valueOf(cadDes); 									//Pasamos el array a una cadena
	}

	public static Boolean repetido(int[] usados, int indice) {
		Boolean repetido = false; 											
		int cont = 0; 													      // contara las letras utilizadas
	
		while(cont<usados.length && !repetido) {							 // mientras no este repetido y contador no se sobrepase
			repetido = usados[cont] == indice ? true : false; 				 //marcamos esa letra como repetida o no y aumentamos el contador
			cont++;
		}
	
		return repetido;
	}
	public static char[] oculto(char[] oculto, String intento, String cadena) {
		oculto = Arrays.copyOf(oculto, cadena.length()); 								//Le damos un tamaño al array
	
		for (int i = 0; i < intento.length(); i++) {
			oculto[i] = intento.charAt(i) == cadena.charAt(i) ? cadena.charAt(i) : '-'; 	//Le damos un valor a la poscion i de oculto
		}

		return oculto;
	}
	public static void main(String[] args) {
		String cad1; 															//guarda la palabra introducida por teclado
		String anagrama; 														// anagrama creado aleatoriamente
		String intento; 														//intento del jugador
		int cont = 0; 															//Lleva cuenta de los intentos del jugador
		char[] oculto = new char[0]; 											//pistas

		//creamos scanner
		Scanner sc = new Scanner(System.in);
		//preguntamos
		System.out.println("J1: Introduzca una palabra: ");
		cad1 = sc.next();
 
		//llamamos a la funcion para crear el anagrama
		anagrama = desordena(cad1); 												
		System.out.println("Turno para J2, intenta adivinar");
		do { 
			do {
				System.out.println("El anagrama es " + anagrama +  " buena suerte: ");
				intento = sc.next();
				cont++; 																				//aumentamos el contador 
			} while (intento.length() != cad1.length()); 												//mientras la longitud del intento sea menor que cad1

			//Mostramos la cadena con pistas
			System.out.println(String.valueOf(oculto(oculto, intento, cad1)));				 			//mostramos la cadena con las pistas

			//mostramos los intentos que lleva
			System.out.println("Usted lleva " + cont + " intentos."); 

		} while (!cad1.equalsIgnoreCase(intento)); 														//mientras el j2 no acierte
		
		// le mostramos la enhorabyena 
		System.out.println("HAS ACERTADO!!");

		//cerramos scanner
		sc.close();

	}

}
