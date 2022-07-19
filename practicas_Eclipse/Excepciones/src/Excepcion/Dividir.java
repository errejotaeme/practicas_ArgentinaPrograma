package Excepcion;

public class Dividir {
	
	public static void division(float numerador, float denominador, float resultado) throws Error{
		
		if(denominador == 0) {
			throw new Error("La división entre 0 no está definida.");
		} else {
		System.out.println("\n"+ numerador + " dividido " + denominador + " es igual a: " + resultado);
		}
	}

}
