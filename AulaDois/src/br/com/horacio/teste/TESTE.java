package br.com.horacio.teste;

import javax.swing.JOptionPane;

public class TESTE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		int idade;
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		if (idade >= 18)
		{
			System.out.println(nome +" Sua idade é " + idade + " Você é maior de idade!");
		} else  
		{
			System.out.println(nome +" Sua idade é " + idade + " Você é menor de idade");
		}
	}

}
