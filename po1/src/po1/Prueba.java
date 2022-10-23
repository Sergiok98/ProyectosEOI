package po1;

import java.time.LocalDate;

public class Prueba {

	public static void main(String[] args) {
		
		Persona vacia = new Persona();
		Persona fran = new Persona("Fran","Garcia","111X","666-666-666",LocalDate.parse("1998-07-14"));
		Persona sergio = new Persona("Fran","Garcia","111X","666-666-666",LocalDate.of(1997,7,17));
		
		System.out.println(fran);
		
		vacia.setNombre("Ana");
		
		System.out.println("Nombre de vacia: " + vacia.getNombre());
	}

}
