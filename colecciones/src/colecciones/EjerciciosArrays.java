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
		
		//El mayor del array
		int mayor = arrayNumeros[0];
		for (int i = 0; i < arrayNumeros.length; i++) {
			if (arrayNumeros[i] > mayor) {
				mayor = arrayNumeros[i];
			}
		}
		System.out.println("El mayor es: " + mayor);
		
		int menor = arrayNumeros[0];
		for (int i = 0; i < arrayNumeros.length; i++) {
			if (arrayNumeros[i] < menor) {
				menor = arrayNumeros[i];
			}
		}
		System.out.println("El menor es: " + menor);
	}
	
	public static void ejercicio3() {
		Scanner sc = new Scanner(System.in);

		Double arrayNumerosDouble[] = new Double[10];
		
		for (int i = 0; i < arrayNumerosDouble.length; i++) {
			System.out.print("Dime el número " + (i + 1) + ": ");
			arrayNumerosDouble[i] = sc.nextDouble();
		}
		//suma de los valores
		int suma = 0;
		for (int i = 0; i < arrayNumerosDouble.length; i++) {
			suma += arrayNumerosDouble[i];
		}
		//media
		double media = 0;
		media = (double) suma / arrayNumerosDouble.length;
		System.out.println("La media es: " + media);
		
		//mayor de la media
		for (int i = 0; i < arrayNumerosDouble.length; i++) {
			if (arrayNumerosDouble[i] > media) {
				System.out.println(arrayNumerosDouble[i] + " es mayor que la media");
			}
		}
	}

	public static void main(String[] args) {
		/*
		 * String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
		 * "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
		 */
		// ejercicio2();
		ejercicio3();
	}
}
