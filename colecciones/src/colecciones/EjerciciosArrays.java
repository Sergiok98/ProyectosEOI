package colecciones;

import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosArrays {
	public static void ejercicio2() {
		Scanner sc = new Scanner(System.in);

		int arrayNumeros[] = new int[10];

		for (int i = 0; i < arrayNumeros.length; i++) {
			System.out.print("Dime el número " + (i + 1) + ": ");
			arrayNumeros[i] = sc.nextInt();
		}
		// suma array
		System.out.println(Arrays.toString(arrayNumeros));
		int suma = 0;
		for (int i = 0; i < arrayNumeros.length; i++) {
			suma += arrayNumeros[i];
		}
		// media
		double media = 0;
		System.out.println(suma);
		media = (double) suma / arrayNumeros.length;
		System.out.println("La media es: " + media);
	}

	public static void main(String[] args) {
		/*
		 * String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
		 * "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
		 */
		ejercicio2();
	}
}
