package br.com.fabricaroupa.model;

public class Roupa {

	public double getPeso() {
		return Peso;
	}
	public void setPeso(double peso) {
		Peso = peso;
	}
	public String getTecido() {
		return Tecido;
	}
	public void setTecido(String tecido) {
		Tecido = tecido;
	}
	
	
	private double Peso;
	private String Tecido;
}
