package model;

public class Pessoa {
	private String Nome;
	private int Idade;
	private int Cpf;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public int getCpf() {
		return Cpf;
	}
	public void setCpf(int cpf) {
		Cpf = cpf;
	}
}
