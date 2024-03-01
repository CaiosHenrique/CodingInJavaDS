package br.com.samsung.model;

public class Celular extends Aparelho {
	
	private double LarguraTela;
	public double getLarguraTela() {
		return LarguraTela;
	}
	public void setLarguraTela(double larguraTela) {
		LarguraTela = larguraTela;
	}
	public double getAltura() {
		return Altura;
	}
	public void setAltura(double altura) {
		Altura = altura;
	}
	private double Altura;
}
