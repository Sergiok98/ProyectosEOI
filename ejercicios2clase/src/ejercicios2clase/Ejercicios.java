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
	       boolean salir = false;
	        
	       while(!salir){
	            
	           System.out.println("1. Suma");
	           System.out.println("2. Resta");
	           System.out.println("3. Multiplicación");
	           System.out.println("4. División");
	            
	           System.out.println("Escribe una de las opciones");
	           int opcion = sc.nextInt();
	            
	           switch(opcion){
	               case 1:
	                   System.out.println(n1 + n2);
	                   salir=true;
	                   break;
	               case 2:
	                   System.out.println(n1 - n2);
	                   salir=true;
	                   break;
	                case 3:
	                   System.out.println(n1 * n2);
	                   salir=true;
	                   break;
	                case 4:
	                	System.out.println(n2 == 0? "El divisor no puede ser 0":(n1 / n2));
	                   salir=true;
	                   break;
	                default:
	                   System.out.println("Solo números entre 1 y 4");
	           }
	            
	       }
	       sc.close();
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
		ejercicio11();
	}

}
