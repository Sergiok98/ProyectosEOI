package ejercicios2clase;

import java.util.Scanner;

public class Ejercicios {

	public static void ejercicio2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero: ");
		int n = sc.nextInt();
		if (n % 10 == 0) {
			System.out.println(n + " es múltipo de 10");
		} else
			System.out.println(n + " no es múltipo de 10");
		sc.close();
	}

	public static void ejercicio3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un caracter ");
		String cadena = sc.nextLine();
		char primeraLetra = cadena.charAt(0);
		if (primeraLetra >= 'A' && primeraLetra <= 'Z') {
			System.out.println("Es mayuscula");
		} else
			System.out.println("Es minúscula");
		sc.close();

	}

	public static void ejercicio4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una palabra: ");
		String cadena1 = sc.nextLine();
		System.out.println("Dime otra palabra: ");
		String cadena2 = sc.nextLine();

		System.out.println(cadena1.equals(cadena2) ? "Son iguales" : "No son iguales"); // .equal es para comparar
																						// string
		sc.close();
	}

	public static void ejercicio5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Primer número: ");
		int n1 = sc.nextInt();
		System.out.println("Segundo número: ");
		int n2 = sc.nextInt();
		if (n2 == 0) {
			System.out.println("¡El duvisor no puede ser 0!");
		} else {
			System.out.println(n1 / n2);
		}
		sc.close();
	}

	public static void ejercicio6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Primer número: ");
		int n1 = sc.nextInt();
		System.out.println("Segundo número: ");
		int n2 = sc.nextInt();
		System.out.println("Tercer número: ");
		int n3 = sc.nextInt();
		 if (n1 > n2) {
	            if (n1 > n3) {
	                System.out.println("El mayor es: " + n1);                                             
	            } else {
	                System.out.println("el mayor es: " + n3);     
	            }
	        } else if (n2 > n3) {
	            System.out.println("el mayor es: " + n2);
	        } else {
	            System.out.println("el mayor es: " + n3);
	        }
		sc.close();
	}

	public static void main(String[] args) {
		// ejercicio1();
		// ejercicio2();
		// ejercicio4();
		// ejercicio5();
		ejercicio6();
	}

}
