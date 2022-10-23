package ficheros;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;


public class EjemplosFicheros {
	
	public static void leer1(String directorio, String nombreFichero) {
		try {
			Files.readAllLines(Paths.get(directorio + File.separator + nombreFichero))
			.forEach(l->System.out.println(l));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void leer2(String directorio, String nombreFichero) {		
		String rutaAbsoluta = directorio + File.separator + nombreFichero; // construir la cadena
		Path rutaOrdenador =  Paths.get(rutaAbsoluta); // transformar la cadena en una ruta entendible por la clase Files (Path)
		try {
			List<String> lineasFichero = Files.readAllLines(rutaOrdenador); // Leer el fichero y pasarlo a una lista de líneas
			lineasFichero.forEach(l->System.out.println(l)); // recorrer las líneas
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void leerRutaEntera(String ruta) {
		try {
			Files.readAllLines(Paths.get(ruta)).forEach(l->System.out.println(l));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void escribir1(String directorio, String nombreFichero, List<String> lineas) throws IOException {
		Files.write(Paths.get(directorio + File.separator + nombreFichero), lineas, StandardOpenOption.CREATE_NEW);
	}

	public static void ejemploTry() {
		int numero1 = 10;
		int numero2 = 0;
		try {
			int division = numero1 / numero2;
			Files.write(Paths.get("c:\\Ficheros\\eoi.txt"),
					Arrays.asList(""+division), StandardOpenOption.CREATE_NEW);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Error en la división");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error al abrir el fichero");
		}
	}
	public static void main(String[] args) {		
		//leer1("c:\\ficheros","eoi.txt");
		//leer1("c:\\ficheros\\datosbancos","caixa.txt");
		//leer2("c:\\ficheros","eoi.txt");
		//List<String> lineas = Arrays.asList("Linea 1" , "Línea 2");
		//escribir1("c:\\ficheros","ejemploeoi.txt",lineas);
		//leerRutaEntera("c:\\Ficheros\\eoi.txt");
		ejemploTry();
		System.out.println("hola");
	}

}