package br.com.samsung.teste;

import javax.swing.JOptionPane;

import br.com.samsung.model.Celular;
import br.com.samsung.model.LinhaBranca;

public class TesteDois {

	public static void main(String[] args) {
		
		Celular CelularNovim = new Celular();
		LinhaBranca Linha = new LinhaBranca();
		
		System.out.println("============================="
				+ "\n Digite 1 para celular "
				+ "\n Digite 2 para Linha Branca"
				+ "\n=============================");
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número")); 
		
		if(numero == 1)
		{
			CelularNovim.setNome(JOptionPane.showInputDialog("Nome"));
			CelularNovim.setPeso(Double.parseDouble(JOptionPane.showInputDialog("qual é o peso")));
			CelularNovim.setAltura(Double.parseDouble(JOptionPane.showInputDialog("qual é a altura pae")));
			CelularNovim.setLarguraTela(Double.parseDouble(JOptionPane.showInputDialog("qual é o largura pae")));
			
			System.out.println("Seu Celular é " + CelularNovim.getNome() + "\nSeu Peso é " + CelularNovim.getPeso() + 
					"\nSeu tamanho é\n" + CelularNovim.getAltura() + " de altura"
					+ CelularNovim.getLarguraTela() + "\n de largura");
		}
		else 
		{
			Linha.setNome("Britadeira");
			Linha.setTipo("2");
			Linha.setPeso(200);
			
			System.out.println(Linha.getNome() + "\nseu tipo é" + Linha.getTipo() + "\ne seu peso é " + Linha.getPeso());
		}
		
	}

}
