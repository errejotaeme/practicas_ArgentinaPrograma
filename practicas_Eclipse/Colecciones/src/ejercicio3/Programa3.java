package ejercicio3;

import java.util.*;

public class Programa3 {

	public static void main(String[] args) {
		Stack <Auto> autos = new Stack <Auto>();
		
		autos.push(new Auto(123456, 2000,"Negro", 001));
		autos.push(new Auto(123654, 2001,"Blanco", 002));
		autos.push(new Auto(123789, 2002,"Rojo", 37));
		autos.push(new Auto(123686, 2021,"Negro", 004));
		autos.push(new Auto(178956, 2022,"Rojo", 5005));
		autos.push(new Auto(945256, 2005,"Gris", 006));
		autos.push(new Auto(054656, 2007,"Azul", 007));
		
		//Buscador
		for(Auto aut : autos) {
			if(aut.getColor() == "Rojo"){ //Especificar color
				System.out.println("Hay un auto del color especificado en la posición: " + autos.indexOf(aut));
				System.out.println(aut.getNum_patente()+", "+aut.getModelo()+", "+aut.getChasis());
			}		
		}
		
		System.out.println("\n" + autos.peek());
		
		autos.pop();
		autos.push(new Auto(120987, 2007,"Naranja", 1234));
		autos.push(new Auto(987655, 2022,"Celeste", 452));
		
		for(Auto aut : autos) {
		System.out.println(aut.getNum_patente()+", "+aut.getColor()+", "+aut.getModelo()+", "+aut.getChasis() +"\n");
		}

		

	}

}
