package br.com.escola.teste;
import br.com.escola.beans.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Caio");
		aluno.setIdade(18);
		aluno.setRM(123456);
		aluno.setCursoAlocado("DS");
		
		System.out.println("O Nome do aluno é " + aluno.getNome() + "\nA idade do aluno é " + 
		aluno.getIdade() + "\nSeu RM é" + aluno.getRm() +"\nE seu curso é " + aluno.getCursoAlocado());
		
	}

}
