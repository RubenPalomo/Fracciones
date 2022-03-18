import java.util.Scanner;
import Fracciones.*;

class Start {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaDatos = new Scanner(System.in);
		int option = 0;
		int numerador = 0, denominador = 0;
		
		System.out.print(Operaciones.menu());
		try {
			option = entradaDatos.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Debe poner un número entero");
			entradaDatos.next();
			System.exit(0);
		}
		
		switch (option) {
		case 1: 
			System.out.print("Introduzca el numerador de la fracción: ");
			try {
				numerador = entradaDatos.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("Debe poner un número entero");
				entradaDatos.next();
			}
			
			System.out.print("Introduzca el denominador de la fracción: ");
			try {
				denominador = entradaDatos.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("Debe poner un número entero");
				entradaDatos.next();
			}
			
			Fraccion fr = new Fraccion(numerador, denominador);
			BBDD.crearFraccion(fr.getNumerador(), fr.getDenominador());
			break;
			
		case 2:
			BBDD.listarFracciones();
			break;
			
		case 3:
			System.out.print(Operaciones.menuOperaciones());
			
			try {
				option = entradaDatos.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("Debe poner un número entero");
				entradaDatos.next();
				break;
			}
			
			System.out.print("Elige un numerador para la fracción 1: ");
			try {
				numerador = entradaDatos.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("Debe poner un número entero");
				entradaDatos.next();
				break;
			}
			
			System.out.print("Elige un denominador para la fracción 1: ");
			try {
				denominador = entradaDatos.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("Debe poner un número entero");
				entradaDatos.next();
				break;
			}
			
			Fraccion fr1 = new Fraccion(numerador, denominador);
			System.out.println("Fracción 1: " + fr1.print() + "\n");
			
			System.out.print("Elige un numerador para la fracción 2: ");
			try {
				numerador = entradaDatos.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("Debe poner un número entero");
				entradaDatos.next();
				break;
			}
			
			System.out.print("Elige un denominador para la fracción 2: ");
			try {
				denominador = entradaDatos.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("Debe poner un número entero");
				entradaDatos.next();
				break;
			}
			
			Fraccion fr2 = new Fraccion(numerador, denominador);
			System.out.println("Fracción 2: " + fr2.print() + "\n");
			
			Fraccion frResultado = Operaciones.operaciones(option, fr1, fr2);
			
			System.out.println("Resultado: " + frResultado.print());
			break;
			
		default:
			System.out.println("Opción no válida.");
			break;
		}
	}				
}