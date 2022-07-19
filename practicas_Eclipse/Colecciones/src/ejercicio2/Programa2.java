package ejercicio2;

import java.util.LinkedList;
import java.util.List;

public class Programa2 {

	public static void main(String[] args) {
		
		List <Persona> listaPersonas = new LinkedList <Persona>();
		
		listaPersonas.add(new Persona("Alan","Perez", 1500000001, 15));
		listaPersonas.add(new Persona("Ana","Parez", 1500000002, 16));
		listaPersonas.add(new Persona("Ayelen","Pirez", 1500000003, 17));
		listaPersonas.add(new Persona("Analia","Porez", 1500000004, 18));
		listaPersonas.add(new Persona("Azucena","Purez", 1500000005, 19));
		listaPersonas.add(new Persona("Ariel","Reraz", 1500000006, 12));
		listaPersonas.add(new Persona("Armando","Teraz", 1500000007, 13));
		listaPersonas.add(new Persona("Antonio","Yeraz", 1500000008, 14));
		listaPersonas.add(new Persona("Aylen","Geraz", 1500000009, 15));
		listaPersonas.add(new Persona("Marta","Beraz", 1500000010, 18));
		listaPersonas.add(new Persona("Mirta","Veruz", 1500000011, 19));
		listaPersonas.add(new Persona("Pablo","Frez", 1500000021, 19));
		listaPersonas.add(new Persona("Pedro","Trez", 1500000031, 19));
		listaPersonas.add(new Persona("Pepe","Crez", 1500000041, 16));
		listaPersonas.add(new Persona("Carlos","Peroz", 1500000051, 17));
		listaPersonas.add(new Persona("Carla","Peraz", 1500000061, 18));
		listaPersonas.add(new Persona("Maria","Periz", 1500000071, 19));
		listaPersonas.add(new Persona("Milagros","Woes", 1500000081, 17));
		listaPersonas.add(new Persona("Muriel","Perz", 1500000091, 19));
		listaPersonas.add(new Persona("Andres","Perri", 1500000201, 19));
		listaPersonas.add(new Persona("Andrea","Peral", 1500000301, 14));
		
		List <Persona> mayoresDeEdad = new LinkedList <Persona>();
		List <Persona> menoresDeEdad = new LinkedList <Persona>();
		
		for(int i=0; i<listaPersonas.size(); i++) {
			if(listaPersonas.get(i).getEdad() >= 18){
				mayoresDeEdad.add(listaPersonas.get(i));				
			} else {
				menoresDeEdad.add(listaPersonas.get(i));
			}	
		}
		
		System.out.println("Lista de mayores de edad: \n");
		for(Persona pers : mayoresDeEdad) {
			System.out.println("Nombre: " + pers.getNombre());
			System.out.println("Apellido: " + pers.getApellido());
			System.out.println("Edad: " + pers.getEdad() + "\n");
		}
		
		System.out.println("\n Lista de menores de edad: \n");
		for(Persona pers : menoresDeEdad) {
			System.out.println("Nombre: " + pers.getNombre());
			System.out.println("Apellido: " + pers.getApellido());
			System.out.println("Edad: " + pers.getEdad() +"\n");
		}		

	}

}
