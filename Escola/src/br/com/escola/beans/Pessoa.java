package br.com.escola.beans;

public class Pessoa {
	
	private String Nome;
	
	private int Idade;
	
	
	public void setNome(String nome) {
		Nome = nome;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public int getIdade() {
		return Idade;
	}
	
	public String getNome() {
		return Nome;
	}
}
