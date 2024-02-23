package br.com.escola.beans;

public class Aluno extends Pessoa {

	private int rm;
	
	public void setRM(int Rm) {
		rm = Rm;
	}

	public void setCursoAlocado(String cursoAlocado) {
		CursoAlocado = cursoAlocado;
	}

	private String CursoAlocado;
	
	public int getRm() {
		return rm;
	}
	
	public String getCursoAlocado() {
		return CursoAlocado;
	}
	
}
