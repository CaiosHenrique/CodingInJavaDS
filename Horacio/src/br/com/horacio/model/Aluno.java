package br.com.horacio.model;

public class Aluno extends PessoaModel {
	
 private String CursoAlocado;

private int idade;

public String getCursoAlocado() {
	return CursoAlocado;
}

public void setCursoAlocado(String cursoAlocado) {
	CursoAlocado = cursoAlocado;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}


}
