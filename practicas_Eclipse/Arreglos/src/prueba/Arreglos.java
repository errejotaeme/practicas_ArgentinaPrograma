package prueba;

import java.util.Scanner;

import java.util.Arrays;
import java.util.Collections;

public class Arreglos {

	public static void main(String[] args) {
		
		
		// E J E R C I C I O S  V E C T O R E S
		
		// Primer ejemplo
		/*
		int vector[]= new int[10];
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i=0; i<vector.length; i++) {
			
			System.out.println("Ingresar número para la posición " + i);
			int tecla = teclado.nextInt();
			if (tecla < 1 || tecla > 100 ) {
				System.out.println("El valor ingresado no pueder ser menor a 1 ni mayor a 100");
				break;
			} else {
			vector[i] = tecla;
			}
		}
		
		*/
		
		
		
		
		//Segundo ejemplo
		/*
		int edades[] = new int[] {18, 19, 23, 27, 65, 56, 25, 28, 29, 78, 34, 54, 56, 19, 47};

		
		int mayor = edades[0];
		
		for (int i=0; i<edades.length; i++) {
			if (edades[i] > mayor) {
				mayor = edades[i];
			}
		}
		System.out.println("El estudiante de mayor edad tiene " + mayor +" años.");
		*/
		
		
		
		
		// Tercer ejemplo
		/*
		String nombre[] = new String[] {"Nombre1", "Nombre2", "Nombre3"};
		String apellido[] = new String[] {"Apellido1", "Apellido2", "Apellido3"};
		int dni[] = new int[] {33555444, 34444666, 36666888};
		
		for (int i=0; i<=2; i++) {
			String n = nombre[i];
			String a = apellido[i];
			int d = dni[i];
			
			System.out.println(d + " " + n + " " + a);
		}
		*/
		
		
		
		
		// Cuarto Ejemplo
		/*
		int tempe[] = new int[] {15, 37, 34, 16, 14, 158, 16, 18, 27, 18, 39, 25, 25, 30, 31, 20, 35, 22, 23, 20, 25, 29, 27};
		int puesto[] = new int[5];
		
		int aux = 0; 							
		for (int i=0; i<tempe.length; i++) {
			for (int j=0; j<tempe.length-1; j++) {
				if (tempe[j] < tempe[j+1]) {
					aux = tempe[j+1];
					tempe[j+1] = tempe[j];
					tempe[j] = aux;
				}
			}
		} 
		
		for (int i=0; i<5; i++) {
			puesto[i] = tempe[i];
			System.out.println(puesto[i]);
		}
		*/
		
		
		//Quinto ejemplo
		/*
		String animales[]= new String[10];
		String alReves[]= new String[10];		
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i=0; i<animales.length; i++) {			
			System.out.println("Ingresar el nombre del animal para la posición " + i);
			String tecla = teclado.nextLine();
			animales[i] = tecla;
			}
		
		int aux = animales.length - 1;
		for (int i=0; i<animales.length; i++) {
			alReves[aux - i] = animales[i];			
		}	
		
		for (int i=0; i<alReves.length; i++) {
			System.out.println("Posición " + i + " animales: " + animales[i] + ". " +
					"Posición " + i + " al revés: " + alReves[i] + "\n");
		}	
		*/
		
		
		//E J E R C I C I O S  M A T R I C E S
		
		// Primer ejemplo
		/*
		int goles[][] = new int[5][3];
		float promedios[] = new float[5];
		
		Scanner teclado = new Scanner(System.in);
		
		for (int f=0; f<5; f++) {      // recorre filas
			for (int c=0; c<3; c++) {  // recorre columnas
				System.out.println("Gol para jugador " + (f+1) + " columna " + c);
				int tecla = teclado.nextInt();
				goles[f][c] = tecla;	// fila y columna		
			}
		}
			
		for (int f=0; f<goles.length; f++) { //// <--- retorna longitud filas
			int total = 0;
			for (int c=0; c<goles[f].length; c++) {
				total += goles[f][c];
			}
			float promedio = (float) total / goles[f].length; // <--- retorna longitud columnas
			promedios[f] = promedio;	
		}
		
		for (int i=0; i<promedios.length; i++) {
			System.out.println("Promedio goles jugador " + (i +1) + ": " + promedios[i] + "\n");
		}
		*/
		
		
		
		
		//Segundo ejemplo
		/*
		float notas[][] = new float[10][4];
		Scanner teclado = new Scanner(System.in);
		
		for (int f=0; f<10; f++) {      
			for (int c=0; c<3; c++) {  
				System.out.println("Nota para alumno " + (f+1) + " en el exámen nro. " + (c+1));
				int tecla = teclado.nextInt();
				notas[f][c] = tecla;		
			}
		}
		
		for (int f=0; f<notas.length; f++) { 
			int total = 0;
			for (int c=0; c<notas[f].length-1; c++) {
				total += notas[f][c];
			}
			float promedio = (float) total / (notas[f].length-1);
			notas[f][3] = promedio;	
		}
		
		for (int f=0; f<10; f++) {      
			for (int c=0; c<3; c++) {  
				System.out.println("Notas de alumno " + (f+1) + ": " + notas[f][c]);					
			}
			System.out.println("Promedio: " + notas[f][3] + "\n");
		}
		*/
		
		
		
		
		//Tercer ejemplo
		/*
		int matriz[][] = new int[4][4];
		
		for(int f=0; f<4; f++) {
			for(int c=0; c<4; c++) {
				matriz[f][c] = 1;
				matriz[f][f] = 0;
			}
		}
		
		for(int f=0; f<4; f++) {
			for(int c=0; c<4; c++) {
				System.out.print(matriz[f][c]);
			}
			System.out.println("");
		}
		*/
		
		
		
		//Cuarto ejemplo
		/*
		
		String menu[][] = new String[20][5];
		Scanner teclado = new Scanner(System.in);
		
		for (int f=0; f<20; f++) {
			System.out.println("Ingresar Nombre de plato nro. " + f +":");
			String tecla = teclado.nextLine();
			if(tecla.isEmpty()) {
				menu[f][0] = "Plato indefinido";
			} else {
				menu[f][0] = tecla;					
			}
	
			for (int c=1; c<menu[f].length; c++) {
				System.out.println("Para el plato " + f +", ingresar nombre del acompañamieto nro. " + c +":");
				String tecla2 = teclado.nextLine();
				if(tecla2.isEmpty()) {
					menu[f][c] = "Ninguno";
				} else {
					menu[f][c] = tecla2;					
				}		
			}
		}
				
		System.out.println("Ingresar nombre del plato para ver los acompañamientos:");
		String tecla = teclado.nextLine();
		
		for (int i=0; i<menu.length; i++) {	
			if(menu[i][0].contentEquals(tecla)) {
					System.out.println("\nPuede acompañarse con: \n" + menu[i][1]
							+ "\n" + menu[i][2] + "\n" +  menu[i][3] + "\n" +  menu[i][4]);
					break;
				} else {
					System.out.println("El plato no se encuentra en el menú. \n");
					break;
				}
			}
		
		*/
		
		
		
		//Quinto ejemplo
		/*		
		int horasTrabajadas[][] = new int[15][6];
		int horasExtras[] = new int[15];
		Scanner teclado = new Scanner(System.in);
		
		for (int f=0; f<horasTrabajadas.length; f++) {
			int sumaHoras = 0;
			for (int c=0; c<horasTrabajadas[f].length; c++) {
				System.out.println("Ingresar horas trabajadas para empleado nro. " + (f+1) + " durante el mes " + (c+1)+":");
				int tecla = teclado.nextInt();
				horasTrabajadas[f][c] = tecla;
				sumaHoras += tecla;
			}
			if(sumaHoras > 960) {
			horasExtras[f] = (sumaHoras - 960);
			} else {
				horasExtras[f] = 0;
			}	
		}
	
		for (int j=0; j<horasExtras.length; j++) {
			System.out.println("El empleado " + (j+1) + " trabajó " + horasExtras[j] + " horas extras. \n");
		}	
		*/
	}
}
	    

		


