package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio5 {

	/* 
	 * 2,5 puntos
	 * 
	 * Escribe en el método 'main' un programa que obtenga el desglose en billetes
	 * y monedas de una cantidad exacta de euros que el usuario introducirá por teclado.
	 * Hay billetes de 500, 200, 100, 50, 20, 10 y 5 euros y monedas de 1 y 2 euros.
	 * Por ejemplo, si deseamos conocer el desglose de 434 euros, el programa mostrará
	 * por pantalla el siguiente resultado:
	 * 
	 * 		2 billetes de 200 euros.
	 * 		1 billete de 20 euros.
	 * 		1 billete de 10 euros.
	 * 		2 monedas de 2 euros.
	 * 
	 * Una vez ejecutado el programa, el usuario podrá realizar tantos desgloses como
	 * desee hasta que decida finalizar su ejecución. 
	 * El programa comprobará que la cantidad introducida sea una cantidad positiva
	 * mayor que 0. En caso contrario mostrará un mensaje de error y volverá a pedirla.
	 */
	
	public static void main(String[] args) {
		 
	int moneda1 = 1;
	int moneda2 = 2;
	int billete = 5;
	int billete10 = 10;
	int billete20 = 20;
	int billete50 = 50;
	int billete100 =100;
	int billete200 =200;
	int billete500 =500;
	
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Introduce un valor a calcular");
	int pant = sc.nextInt();
	
	if (pant == 0) {
		do 
		 System.out.println("Vuelva a introducir el valor a calcular");
		 while (pant == 0)
		
		else {
			
			
		}
			
			
			
			
	
	}

	}

}
