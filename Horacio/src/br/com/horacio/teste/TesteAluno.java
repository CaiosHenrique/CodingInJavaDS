package br.com.horacio.teste;

import javax.swing.JOptionPane;

import br.com.horacio.model.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Aluno abc = new Aluno();
		Aluno alunim = new Aluno();
		
		
		
		abc.setNome("Artur");
		abc.setCursoAlocado("adm");
		
		//System.out.println("O Nome do aluno � " + abc.getNome() + 
		//		"\nE seu curso � " + abc.getCursoAlocado());
		
		aluno.setNome("Caio");
		aluno.setCursoAlocado("DS");
		
		//System.out.println("O Nome do aluno � " + aluno.getNome() + 
		//"\nE seu curso � " + aluno.getCursoAlocado());
		
		String recebeNome = JOptionPane.showInputDialog("Nome");
		int recebeIdade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		String recebeCurso = JOptionPane.showInputDialog("Curso");
		
		alunim.setNome(recebeNome);
		alunim.setIdade(recebeIdade);
		alunim.setCursoAlocado(recebeCurso);
		
		System.out.println("O nome do aluno � " + alunim.getNome() + 
				"\n tem " + alunim.getIdade() +  " de idade" +
				"\n E seu dom � ser " + alunim.getCursoAlocado() );
	}

}
