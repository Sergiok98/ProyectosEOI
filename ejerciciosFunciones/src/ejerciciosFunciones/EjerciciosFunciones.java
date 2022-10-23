package ejerciciosFunciones;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class EjerciciosFunciones {
	
	public static void ejercicio1() {
		for(int i=0; i<20;i++) {
			System.out.print("*");
		}
	}
	
	public static void ejercicio1Mejorado(int numero,String cadena) {
		for(int i=0; i<numero;i++) {
			System.out.print(cadena);
		}
	}

	public static void ejercicio2(String cadena, int a, int b) {
		int letras = cadena.length();
		int min,max;
		if(a<b) {
			min = a;
			max = b;
		}
		else {
			min = b;
			max = a;
		}
		if(letras>=min && letras<=max)
			System.out.println("Está en el rango");
		else
			System.out.println("No está en el rango");
	}
	
	public static void ejercicio2b(String cadena, int a, int b) {
		if(cadena.length()>=a && cadena.length()<=b)
			System.out.println("Está en el rango");
		else
			System.out.println("No está en el rango");
	}
	
	public static void ejercicio2c(String cadena, int a, int b) {
		System.out.println(cadena.length()>=a && cadena.length()<=b?"Está en el rango":"No está en el rango");
	}
	
	public static void ejercicio2cMejorado(String cadena, int a, int b) {
		System.out.println(cadena.length()>=Math.min(a, b) && cadena.length()<=Math.max(a, b)?"Está en el rango":"No está en el rango");
	}
	
	// Crea una función que reciba un carácter y un número, dibuja un cuadrado usando ese
	// carácter cuyo ancho y alto sea igual al número recibido. Prueba la función.
	public static void ejercicio3(char caracter, int numero) {
		// Fila arriba
		for(int i=0; i<numero;i++) {
			System.out.print(caracter);
		}
		System.out.println();		
		// Filas de mitad
		for(int i=0; i<numero-2;i++) {
			System.out.print(caracter);  // el lado izquierdo del cuadrado
			for(int j=0; j<numero-2;j++) {
				System.out.print(" ");
			}
			System.out.print(caracter); // el lado derecho del cuadrado
			System.out.println();
		}				
		// Fila abajo
		for(int i=0; i<numero;i++) {
			System.out.print(caracter);
		}		
	}
	
	public static void ejercicio3a(char caracter, int numero) {
		for(int i=0; i<numero;i++) {
			if(i==0 || i==numero-1) {
				for(int j=0; j<numero;j++) {
					System.out.print(caracter);
				}
				System.out.println();
			}
			else {
				System.out.print(caracter);  // el lado izquierdo del cuadrado
				for(int j=0; j<numero-2;j++) {
					System.out.print(" ");
				}
				System.out.print(caracter); // el lado derecho del cuadrado
				System.out.println();
			}
		}					
	}
	
	public static void ejercicio3b(char caracter, int numero) {
		for(int i=0; i<numero;i++) {
			if(i==0 || i==numero-1) {
				String repetido = "" + caracter;
				System.out.println(repetido.repeat(numero));
			}
			else {
				String repetido = " ";
				System.out.println(caracter + repetido.repeat(numero-2) + caracter);
			}
		}	
	}
	
	public static void ejercicio3bConMiFuncion(char caracter, int numero) {
		for(int i=0; i<numero;i++) {
			if(i==0 || i==numero-1) {
				ejercicio1Mejorado(numero,""+caracter);
				System.out.println();
			}
			else {
				System.out.print(caracter);
				ejercicio1Mejorado(numero-2," ");
				System.out.println(caracter);
			}
		}	
	}
	
	
	public static void ejercicio3c(char caracter, int numero) {
		for(int i=0; i<numero;i++) 
			System.out.println((i==0 || i==numero-1)?
					("" + caracter).repeat(numero):
					caracter + " ".repeat(numero-2) + caracter);	
	}
	
	// Crea una función con 2 parámetros. El primero será una cadena y representa al
	// nombre de una persona, mientras que el segundo contendrá al resto de parámetros
	// recibidos (…), que serán cadenas con los trabajos que la persona ha realizado.
	// Imprime por consola el nombre de la persona seguido de la lista de trabajos realizados
	// por la misma. Si no hay ningún trabajo, indica que no ha trabajado nunca. Prueba la función
	// varias veces, al menos una de ellas no le pases ningún trabajo.

	public static void ejercicio4(String nombre,String... trabajos) {
		System.out.println("La persona: " + nombre);
		if(trabajos.length==0)
			System.out.println("La persona no ha trabajado nunca.");
		else {
			for(int i=0;i<trabajos.length;i++) {
				System.out.println(trabajos[i]);
			}
		}
	}
	
	
	// 5 trabajos son las posiciones 0,1,2,3,4
	public static void ejercicio4Camila(String nombre,String... trabajos) {
		System.out.println("La persona: " + nombre);
		if(trabajos.length==0)
			System.out.println("La persona no ha trabajado nunca.");
		else {
			for(int i=0;i<trabajos.length;i++) {
				if (i < trabajos.length-1) {
					System.out.print(trabajos[i] + ", ");
				} else {
					System.out.print(trabajos[i] + ".");
				}
			}
		}
	}
	
	// 5 trabajos son las posiciones 0,1,2,3,4
		public static void ejercicio4CamilaB(String nombre,String... trabajos) {
			System.out.println("La persona: " + nombre);
			if(trabajos.length==0)
				System.out.println("La persona no ha trabajado nunca.");
			else {
				for(int i=0;i<trabajos.length;i++) {
					if (i==trabajos.length-1) {
						System.out.print(trabajos[i] + ". ");
					} else {
						System.out.print(trabajos[i] + ",");
					}
				}
			}
		}
	
	public static boolean ejercicio5(int numero) {
		
		if (numero%numero ==0) {
			System.out.println(numero + " Es un número primo");
			return true;
			}
		else {
			System.out.println(numero + " No es un número primo");
			return false;
		}
	}
	
	public static int ejercicio6(int[] anum) {
		int suma = 0;
		for (int i = 0; i < anum.length; i++) {
			suma += anum[i];
		}
		System.out.println(suma / anum.length);
		return suma + anum.length;
	}
		
	public static String ejercico7(String[] cadena) {
		Scanner sc = new Scanner(System.in);
		int val = new Random().nextInt(cadena.length);
		String correcta = cadena[val];
		System.out.println("Elige entre Hola, Adiós, Hello, Adeu");	
		String eleccion = sc.nextLine();
		int contador = 2;
		while (!eleccion.equals(correcta) && contador > 0) {
			System.out.println("Respuesta incorrecta, te quedan " + contador + " intentos");
			System.out.println("Elige otra opción");
			eleccion = sc.nextLine();
			contador--;
		}
		if (eleccion.equals(correcta)) {
			System.out.println("Respusta correcta");
		} else {
			System.out.println("Te quedaste sin intentos");
		}	
		
		
		return correcta;
	}
	
	public static int ejercicio8(int...nums) {
		int maximo = nums[0];
		for (int num : nums) {
			if (num> maximo) {
				maximo = num;
			}
		}
		System.out.println(maximo);
		return maximo;
	}
	public static void main(String[] args) {
		//ejercicio2("hola",2,4);  // Está en el rango
		//ejercicio2("adiós",2,4); // No está en el rango
		//ejercicio2b("hola",2,4);  // Está en el rango
		//ejercicio2b("adiós",2,4); // No está en el rango
		//ejercicio2c("hola",4,2);  // Está en el rango
		//ejercicio2c("adiós",4,2); // No está en el rango
		//ejercicio2cMejorado("hola",4,2);  // Está en el rango
		//ejercicio2cMejorado("adiós",4,2); // No está en el rango
		//ejercicio3('*',7);
		//ejercicio3b('*',7);
		//ejercicio3bConMiFuncion('*',7);
		//ejercicio3c('*',7);
		//ejercicio3a('*',7);
		//ejercicio1();
		//ejercicio1();
		//ejercicio1();
		//ejercicio1Mejorado(6,"*-4a");
		//ejercicio4("Fran");
		//ejercicio4("Francisco","Suma","Consultoría","Profesor IES","Programador","EOI");
		//ejercicio4Camila("Francisco","Suma","Consultoría","Profesor IES","Programador","EOI");
		//ejercicio4CamilaB("Francisco","Suma","Consultoría","Profesor IES","Programador","EOI");
		//ejercicio5(4);
		/*int[] anum = new int[4];
		anum[0]=20;
		anum[1]=25;
		anum[2]=0;
		anum[3]=245;
		ejercicio6(anum);*/
		/*String [] cadena = new String[4];
		cadena[0]="Hola";
		cadena[1]="Adiós";
		cadena[2]="Hello";
		cadena[3]="Adeu";
		ejercico7(cadena);*/
		ejercicio8();
	}

}