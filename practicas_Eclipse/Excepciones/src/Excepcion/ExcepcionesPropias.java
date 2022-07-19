package Excepcion;
import java.util.Scanner;

public class ExcepcionesPropias {


	public static void main(String[] args) {		


	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Ingrese numerador:");
	float numerador = teclado.nextFloat();
	
	System.out.println("\nIngrese denominador:");
	float denominador = teclado.nextFloat();
	
	float resultado = (float) numerador/denominador;
	
	
	try {		
		Dividir.division(numerador, denominador, resultado);
	}
	
	catch(Error e) {
		System.out.println(e);
	}
	
		
		
	

	}
}

