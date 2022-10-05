package ejercicios2clase;

import java.util.Random;
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

	public static void ejercicio7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la hora: ");
		int hora = sc.nextInt();
		System.out.println("Introduzca el minuto: ");
		int minuto = sc.nextInt();
		System.out.println("Introduzca el segundo: ");
		int segundos = sc.nextInt();
		if (hora > 0 && hora < 24) {
			if (minuto > 0 && minuto < 60) {
				if (segundos > 0 && segundos < 60) {
					System.out.printf("Tiempo: %02d/%02d/%02d\n", hora, minuto, segundos);
				} else {
					System.out.println(segundos + " no es un valor válido para segundos");
				}
			} else {
				System.out.println(minuto + " no es un valor válido para minuto");
			}
		} else {
			System.out.println(hora + " no es un valor válido para hora");
		}
		sc.close();
	}

	public static void ejercicio8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor de A: ");
		int A = sc.nextInt();
		System.out.println((A % 2 == 0) ? "El número es par" : "El número es impar");
		sc.close();
	}

	public static void ejercicio9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la hora: ");
		int mes = sc.nextInt();
		switch (mes) {
		case 1:
			System.out.println("Enero tiene 31 días");
			break;
		case 2:
			System.out.println("Febrero tiene 28 días");
			break;
		case 3:
			System.out.println("Marzo tiene 31 días");
			break;
		case 4:
			System.out.println("Abril tiene 30 días");
			break;
		case 5:
			System.out.println("Mayo tiene 31 días");
			break;
		case 6:
			System.out.println("Junio tiene 30 días");
			break;
		case 7:
			System.out.println("Julio tiene 31 días");
			break;
		case 8:
			System.out.println("Agosto tiene 31 días");
			break;
		case 9:
			System.out.println("Septiembre tiene 30 días");
			break;
		case 10:
			System.out.println("Octubre tiene 31 días");
			break;
		case 11:
			System.out.println("Nomviembre tiene 30 días");
			break;
		case 12:
			System.out.println("Diciembre tiene 31 días.");
			break;
		default:
			System.err.println("El mes introducido no existe");
		}
		sc.close();
	}

	public static void ejercicio10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un caracter: ");
		char letra = sc.next().charAt(0);
		switch (letra) {
		case '.':
			System.out.println("El caracter es un signo de puntuación");
			break;
		case ',':
			System.out.println("El caracter es un signo de puntuación");
			break;
		case ';':
			System.out.println("El caracter es un signo de puntuación");
			break;
		case ':':
			System.out.println("El caracter es un signo de puntuación");
			break;
		case '0':
			System.out.println("El caracter es un número");
			break;
		case '1':
			System.out.println("El caracter es un número");
			break;
		case '2':
			System.out.println("El caracter es un número");
			break;
		case '3':
			System.out.println("El caracter es un número");
			break;
		case '4':
			System.out.println("El caracter es un número");
			break;
		case '5':
			System.out.println("El caracter es un número");
			break;
		case '6':
			System.out.println("El caracter es un número");
			break;
		case '7':
			System.out.println("El caracter es un número");
			break;
		case '8':
			System.out.println("El caracter es un número");
			break;
		case '9':
			System.out.println("El caracter es un número");
			break;

		default:
			System.out.println("Es otro tipo de caracter");
			break;
		}
		sc.close();
	}

	public static void ejercicio11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número ");
		int n1 = sc.nextInt();
		System.out.println("Introduzca otro número ");
		int n2 = sc.nextInt();

		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");

		System.out.println("Escribe una de las opciones");
		int opcion = sc.nextInt();

		switch (opcion) {
		case 1:
			System.out.println(n1 + n2);
			break;
		case 2:
			System.out.println(n1 - n2);
			break;
		case 3:
			System.out.println(n1 * n2);
			break;
		case 4:
			System.out.println(n2 == 0 ? "El divisor no puede ser 0" : (n1 / n2));
			break;
		default:
			System.out.println("Solo números entre 1 y 4");
		}

		sc.close();
	}

	public static void ejercicio12() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su edad:");
		int edad = sc.nextInt();
		sc.nextLine();// para quitar los espacios de edad
		double precio = 50;
		if (edad > 17 && edad < 66) {
			System.out.println("Es usted socio?");
			String socio = sc.nextLine();
			if (socio.equals("sí")) {
				System.out.println("Se le ha aplicado un descuento de 40% por ser socio");
				System.out.println("El nuevo precio es: " + (precio - (precio * 0.40)));
			} else if (socio.equals("no")) {
				System.out.println("Se le ha aplicado un descuento de 25% por ser menor de edad");
				System.out.println("El nuevo precio es: " + (precio - (precio * 0.25)));
			}

		} else if (edad > 65) {
			System.out.println("Se le ha aplicado un descuento de 75% por estar jubilado");
			System.out.println("El nuevo precio es: " + (precio - (precio * 0.75)));
		}
		sc.close();
	}

	public static void ejercicio13() {
		int n = 20;
		while (n > 0) {
			System.out.println(n);
			n--;
		}
	}

	public static void ejercicio13b() {
		for (int i = 20; i > 0; i--) {
			System.out.println(i);
		}
	}

	public static void ejercicio14() {
		Scanner sc = new Scanner(System.in);
		int inicio = 0;
		int num;
		do {
			System.out.println("Introduce un número entero:");
			num = (sc.nextInt() + inicio);
		} while (num != 0);
		if (num == 0) {
			System.out.println("Has acertado");
		} else if (num !=0) {
			System.out.println("Te has equibocado");
		} 

	}

	public static void ejerciciobucle() {
		Scanner sc = new Scanner(System.in);
		// Generamos número aleatorio entre 1 y 10
		int adivina = new Random().nextInt(10) + 1;
		int intentos = 0;
		int num;
		do {
			System.out.print("Adivina el número del 1 al 10: ");
			num = sc.nextInt();
			intentos++;
		} while (adivina != num && intentos < 3);
		if (adivina == num) {
			System.out.println("Has acertado!");
		} else {
			System.out.println("Has fallado!");
		}
	}
	public static void whileigualdowhile() {
		Scanner sc = new Scanner(System.in);
		// Generamos número aleatorio entre 1 y 10
		int adivina = new Random().nextInt(10) + 1;
		int intentos = 0;
		int num=-1;
		while (adivina != num && intentos < 3){
			System.out.print("Adivina el número del 1 al 10: ");
			num = sc.nextInt();
			intentos++;
		} 
		if (adivina == num) {
			System.out.println("Has acertado!");
		} else {
			System.out.println("Has fallado!");
		}
	}
	public static void main(String[] args) {
		// ejercicio1();
		// ejercicio2();
		// ejercicio4();
		// ejercicio5();
		// ejercicio6();
		// ejercicio7();
		// ejercicio8();
		// ejercicio9();
		// ejercicio10();
		// ejercicio11();
		// ejercicio12();
		// ejercicio13();
		// ejercicio13b();
		 ejercicio14();
		// ejerciciobucle();
		// whileigualdowhile();
	}

}
