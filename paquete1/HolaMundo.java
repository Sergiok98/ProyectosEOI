package paquete1;

import java.util.Scanner;

public class HolaMundo {
	
	private static void ejemplosConversiones() {

		int prefijo = 34;

		int telefono = 666666666;

		System.out.println(prefijo + telefono); // 666666670

		//Conversiones

		System.out.println("" + prefijo + telefono); // 34666666666. Implícita

		System.out.println(String.valueOf(prefijo) + telefono); // 34666666666

		System.out.println(String.valueOf(prefijo) + String.valueOf(telefono)); // 34666666666

		System.out.println(Integer.toString(prefijo) + telefono); // 34666666666



		String valor1 = "10";

	}
	
	private static void ejercicio6() {
		
		/*int A=1, B=2, C=3, D=4;
		
		B = C;
		System.out.println("B vale:" + B );
		C = A;
		System.out.println("C vale:" + A );
		A = D;
		System.out.println("A vale:" + D );
		B = 2;
		D = B;
		System.out.println("D vale:" + B );*/
		
	}
	private static void ejercicio8() {
		
		int a = 5, b = 0, c = 0;
		b = ++a;
		c = a ++;
		b = b*5;
		a = a*5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
		
	}
	private static void ejercicio9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu nombre");
		String nombre=sc.nextLine();
		System.out.println("Hola " + nombre);
		sc.close();
		
	}
	
	private static void ejercicio10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número:");
		String valor1 = sc.nextLine();
		System.out.println("El doble es: " + (Integer.parseInt(valor1) * 2));
		System.out.println("El triple es: " + (Integer.parseInt(valor1) * 3));
		sc.close();	
		}
	private static void ejercicio11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Temperatura en grados centígrados: ");
		String t = sc.nextLine();
		System.out.println("Temperatura en fahrenhei: " + ( 32 + (9 * (Double.parseDouble(t)) / 5 )));
		sc.close();	
			
		}	
	
	
	public static void main(String[] args) {
		
		//ejemplosConversiones();
		//ejercicio6();
		//ejercicio8();
		//ejercicio9();
		//ejercicio10();
		ejercicio11();

		/*Scanner sc = new Scanner(System.in);
		
		int numero = 1;
		char letra = 'a';
		String cadenaletras ="Cadena de letras";
		System.out.println("Hola mundo");
		System.out.println(numero);
		System.out.println(numero + letra);
		System.out.println(numero + cadenaletras);
		final double IVA = 0.21;
		int precio = 100;
		System.out.println("La ropa cuesta: " + precio + "\nIVA:" 
		+ precio* IVA + "\nTOTAL: " + (precio + (precio*IVA)));
		
		int prefijo = 24;
		int telefono = 607065299;
		System.out.println("+" + "" + prefijo + " " + telefono);
		
		System.out.println("Introduce un valor:");
		String valor1 = sc.nextLine();
		System.out.println("El valor mas 5 es: " + (Integer.parseInt(valor1) + 5)); //integer
		
		sc.close();*/
		
		
	}
}