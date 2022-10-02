import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicios2 {

	public static void apartado2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba un número: ");
		int num = sc.nextInt();

		if (num % 10 == 0) {
			System.out.println(num + " es múltiplo de 10");
		} else {
			System.out.println(num + " NO es múltiplo de 10");
		}
	}

	public static void apartado3() throws IOException {
		System.out.print("Escribe una letra y pulsa enter: ");
		char letra = (char) System.in.read();

		if (letra >= 'A' && letra <= 'Z') {
			System.out.println("La letra '" + letra + "' es mayúscula");
		} else {
			System.out.println("No es una letra mayúscula");
		}
	}

	public static void apartado4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe una palabra: ");
		String p1 = sc.nextLine();
		System.out.print("Escribe otra palabra: ");
		String p2 = sc.nextLine();

		if (p1.equals(p2)) {
			System.out.println("Las palabras son iguales");
		} else {
			System.out.println("Las palabras son distintas");
		}
	}

	public static void apartado9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba el número de mes: ");
		int mes = sc.nextInt();

		switch (mes) {
		case 1:
			System.out.println("Enero tiene 31 días.");
			break;
		case 2:
			System.out.println("Febrero tiene 28 días.");
			break;
		case 3:
			System.out.println("Marzo tiene 31 días.");
			break;
		case 4:
			System.out.println("Abril tiene 30 días.");
			break;
		case 5:
			System.out.println("Mayo tiene 31 días.");
			break;
		case 6:
			System.out.println("Junio tiene 30 días.");
			break;
		case 7:
			System.out.println("Julio tiene 31 días.");
			break;
		case 8:
			System.out.println("Agosto tiene 31 días.");
			break;
		case 9:
			System.out.println("Septiembre tiene 30 días.");
			break;
		case 10:
			System.out.println("Octubre tiene 31 días.");
			break;
		case 11:
			System.out.println("Nomviembre tiene 30 días.");
			break;
		case 12:
			System.out.println("Diciembre tiene 31 días.");
			break;
		default:
			System.err.println("El mes introducido no existe");
		}
	}
	
	public static void apartado12() {
		double entrada = 50;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime tu edad: ");
		int edad = sc.nextInt();
		sc.nextLine();
		
		if(edad < 18) {
			entrada *= 0.75;
		} else if(edad < 65) {
			System.out.print("¿Eres socio? ");
			String resp = sc.nextLine();
			
			// Solución con expresión regular
//			Pattern regex = Pattern.compile("^s[iíÍ]?$", Pattern.CASE_INSENSITIVE);
//			Matcher m = regex.matcher(resp);
//			if(m.matches()) {
//				entrada *= 0.6;
//			}
			
			switch(resp) {
				case "s": case "si": case "sí": case "S": case "SI": case "SÍ":
					entrada *= 0.6;
			}
		} else {
			entrada *= 0.25;
		}
		
		System.out.printf("El precio final de la entrada es: %.2f\n", entrada);
	}
	
	public static void apartado16() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un número: ");
		int ancho = sc.nextInt();
		
		for(int i = 0; i < ancho; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void apartado17() {
		for(int i = 1; i <= 30; i++) {
			if(i % 3 > 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void apartado18() {
		for(int i = 0; i <= 100; i+=5) {
			System.out.println(i);
		}
	}
	
	public static void apartado21() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un número: ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num / 2; i++) {
			if(num % i == 0) {
				System.out.println("Divisor: " + i);
			}
		}
	}
	
	public static void apartado22() {
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(j);
			}
		}
	}
	
	public static void apartado23() {
		for(int i = 9; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void apartado24() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un número: ");
		int num = sc.nextInt();
		
		for(int fila = 0; fila < num; fila++) {
			for(int col = 0; col < num; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void apartado25() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un número: ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void apartado26() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un número: ");
		int num = sc.nextInt();
		
		for(int fila = 1; fila <= num; fila++) {
			for(int col = 1; col <= num; col++) {
				if(col <= num - fila) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public static void apartado27() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un ancho: ");
		int ancho = sc.nextInt();
		System.out.print("Dime un alto: ");
		int alto = sc.nextInt();
		
		for(int fila = 1; fila <= alto; fila++) {
			for(int col = 1; col <= ancho; col++) {
				if(fila == 1 || fila == alto || col == 1 || col == ancho) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void apartado28() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime altura pirámide: ");
		int alto = sc.nextInt();
		int astStart = alto;
		int astEnd = alto;
		
		for(int fila = 1; fila <= alto; fila++) {
			for(int col = 1; col <= alto * 2 - 1; col++) {
				if(col >= astStart && col <= astEnd) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			astStart--;
			astEnd++;
		}
		
//		int numAst = 1;
//		int numEsp = alto - 1;
		
//		for(int fila = 1; fila <= alto; fila++) {
//			for(int col = 1; col <= numEsp; col++) {
//				System.out.print(" ");
//			}
//			for(int col = 1; col <= numAst; col++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//			numEsp--;
//			numAst += 2;
//		}
	}

	public static void main(String[] args) throws IOException {
//		apartado2();
//		apartado3();
//		apartado4();
//		apartado9();
//		apartado12();
//		apartado16();
//		apartado17();
//		apartado18();
//		apartado21();
//		apartado22();
//		apartado23();
//		apartado24();
//		apartado25();
//		apartado26();
//		apartado27();
		apartado28();
	}

}
