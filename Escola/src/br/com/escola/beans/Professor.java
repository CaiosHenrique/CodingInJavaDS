package br.com.escola.beans;

public class Professor extends Pessoa{

	private double Salario ;
	
	public void setSalario(int salario) {
		Salario = salario;
	}

	public void setCursoAlocado(String cursoAlocado) {
		CursoAlocado = cursoAlocado;
	}

	private String CursoAlocado ;
	
	public String getCursoAlocado() {
		return CursoAlocado;
	}
	
	public double getSalario() {
		return Salario;
	}
	
	
	
}
