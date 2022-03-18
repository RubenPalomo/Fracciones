package Fracciones;

public class Fraccion {
	private int numerador;
	private int denominador;
	
	public Fraccion(int num, int den){
		this.numerador = num;
		this.denominador = den;
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	public String print() {
		return this.numerador + "/" + this.denominador;
	}
}
