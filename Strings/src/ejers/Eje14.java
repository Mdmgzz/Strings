package ejers;

import java.util.Arrays;
import java.util.Scanner;

public class Eje14 {
public static String desordena(String cad) {
		
		char[] cadena = cad.toCharArray(); 									//pasamos a un array
		char[] cadDes = new char[cadena.length]; 							//se guardara la palabra desordernada
		int[] descartar = new int[0]; 											//guardaremos la posicion de las letras que ya se hayan usado
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

	public static void main(String[] args) {
		//bloque de variables
		String cad1;													 //la cadena introducida
		String anagrama; 												 //guarda la cadena generada
		String intento; 												 //guarda el intento del usuario
		int contador = 0; 												 //Contador de intentos
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		// preguntamos
		System.out.println("J1: Introduzca una palabra: ");
		cad1 = sc.next();
		
		anagrama = desordena(cad1); //llamamos a la funcion para desordenar la palabra
			
		System.out.println("Turno para J2, intenta adivinar");
		do { 
			System.out.println("El anagrama es " + anagrama +  " buena suerte: "); 
			intento = sc.next();
			
			contador++;												//contador +1
			System.out.println("lleva " + contador + " intentos");	// le mostramos los intentos que lleva
			
		}while(!cad1.equalsIgnoreCase(intento)); 					//Mientras el usuario no adivine la palabra
		
		//damos la enhorabuena por acertar
		System.out.println("HAS ACERTADO!!");
		// cerramos scanner
		sc.close();

	}

}
