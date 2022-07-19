package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		
		List <Mascota> listaMascotas = new ArrayList <Mascota> ();
		
		//Agrego posiciones a la lista
		listaMascotas.add(new Mascota("Pipo", "Perro", "Macho","Negro", "Corto", "Boxer"));
		listaMascotas.add(new Mascota("Pipa", "Perro", "Hembra","Blanca", "Corto", "Boxer"));
		listaMascotas.add(new Mascota("Manchi", "Perro", "Macho","Marrón", "Largo", "Siberiano"));
		listaMascotas.add(new Mascota("Minchi", "Perro", "Hembra","Gris", "Largo", "Siberiano"));
		listaMascotas.add(new Mascota("Munchi", "Gato", "Macho","Negro", "Corto", "Ninguna"));
		
		//Recorro lista
		for (int i=0; i<listaMascotas.size(); i++) {
			System.out.println("Nombre mascota "+ (i+1) +": "+ listaMascotas.get(i).getNombre()+"\n" + 
					"Especie: " + listaMascotas.get(i).getEspecie()+"\n" + 
					"Pelaje: " + listaMascotas.get(i).getPelaje() +"\n") ;	
		}
		
		//Modifico valor mientras se ejecuta
		listaMascotas.get(1).setNombre("Lara");
		listaMascotas.get(4).setNombre("Garras");
		
		//Vuelvo a recorrer
		System.out.println("DATOS ACTUALIZADOS: \n");
		for (int i=0; i<listaMascotas.size(); i++) {
			System.out.println("Nombre mascota "+ (i+1) +": "+ listaMascotas.get(i).getNombre()+"\n" + 
					"Especie: " + listaMascotas.get(i).getEspecie()+"\n" + 
					"Pelaje: " + listaMascotas.get(i).getPelaje() +"\n") ;	
		}
		
		//Agrego nuevas posiciones a la lista
		listaMascotas.add(new Mascota("Babe", "Chancho", "Macho","Rosado", "Corto", "-"));
		listaMascotas.add(new Mascota("Morsi", "Ballena", "Hembra","Blanca", "-", "Franca"));
		
		//Recorro lista mostrando solo los perros
		System.out.println("Los perros se llaman:");
		for (int i=0; i<listaMascotas.size(); i++) {
			if(listaMascotas.get(i).getEspecie() == "Perro") {
				System.out.println(listaMascotas.get(i).getNombre());				
			}
		}
		listaMascotas.toString();
	}
}
