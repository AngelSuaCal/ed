package org.institutoserpis.ed;
import java.util.*;
public class Adivina {

	public static void main(String[] args) {
		Scanner tecla = new Scanner(System.in);
		int i = 0;
		
		System.out.println("Voy a pensar un número entre 1 y 1000. ¡Intenta adivinar cuál!");
		Random random = new Random();
		int numeroAleatorio = random.nextInt(1000) + 1;
		System.out.println(numeroAleatorio);
		int intento;
		do{
			i++;
			System.out.println("Intento número " + i);
			intento = tecla.nextInt();
			if(intento > numeroAleatorio){
				System.out.println("El número objetivo es menor");
			}else if(intento == numeroAleatorio){
				System.out.println("¡Es correcto!");
			}else{
				System.out.println("El número objetivo es mayor");
			}
		}while(intento != numeroAleatorio);
		System.out.println("¡Lo has completado en solo " + i + " intentos!");
	}
}
