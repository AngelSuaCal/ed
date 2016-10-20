package org.institutoserpis.ed;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String nombre = scanner.nextLine();
		System.out.print("Dime tu edad: ");
		String edad = scanner.nextLine();
		int edadNumero = Integer.parseInt(edad);
		System.out.println("Hola " + nombre + ", tienes " + edadNumero + " años.");
	}
}