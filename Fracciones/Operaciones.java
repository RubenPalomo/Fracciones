package Fracciones;

public class Operaciones {	
	public static String menu() {
		return "* * * MEN� * * *\n1. Crear objeto fracci�n\n2. Ver objetos fracci�n creados\n3. Operaciones con objetos fracci�n\nOpci�n: ";
	}
	
	public static String menuOperaciones() {
		return "\n* * * MENU OPERACIONES * * *\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\nOpci�n: ";
	}
	
	public static Fraccion operaciones(int option, Fraccion fr1, Fraccion fr2) {
		int denominadorComun = fr1.getDenominador() * fr2.getDenominador();
		Fraccion frResultado = new Fraccion(0, 0);
		
		switch (option) {
		case 1:
			frResultado.setNumerador((fr1.getNumerador() * fr2.getDenominador()) + (fr2.getNumerador() * fr1.getDenominador()));
			frResultado.setDenominador(denominadorComun);
			return frResultado;
		
		case 2:
			frResultado.setNumerador((fr1.getNumerador() * fr2.getDenominador()) - (fr2.getNumerador() * fr1.getDenominador()));
			frResultado.setDenominador(denominadorComun);
			return frResultado;
			
		case 3:
			frResultado.setNumerador(fr1.getNumerador() * fr2.getNumerador());
			frResultado.setDenominador(fr1.getDenominador() * fr2.getDenominador());
			return frResultado;
			
		case 4:
			frResultado.setNumerador(fr1.getNumerador() * fr2.getDenominador());
			frResultado.setDenominador(fr1.getDenominador() * fr2.getNumerador());
			return frResultado;
			
		default:
			System.out.println("Opci�n no v�lida.");
			System.exit(0);
		}
	
		return frResultado;
	}
}
