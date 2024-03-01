package br.com.samsung.teste;

import javax.swing.JOptionPane;

import br.com.samsung.model.Celular;
import br.com.samsung.model.LinhaBranca;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Celular celular = new Celular();
		LinhaBranca Linhabranca = new LinhaBranca();
		
		celular.setAltura(10);
		celular.setLarguraTela(10);
		celular.setNome("S24");
		celular.setPeso(0.15);
		
		
		Linhabranca.setTipo("CHURRASQUEIIRA ELETRICA");
		Linhabranca.setPeso(100);
		Linhabranca.setNome("PODEROSISSIMA FRITADORA DE PORCOS");
		
		Celular CelularNovo = new Celular();
		
		CelularNovo.setNome("SUStenCell");
		CelularNovo.setPeso(150);
		CelularNovo.setAltura(12);
		CelularNovo.setLarguraTela(7);
		
		Celular CelularNovim = new Celular();
		
		CelularNovim.setNome(JOptionPane.showInputDialog("Nome"));
		CelularNovim.setPeso(Double.parseDouble(JOptionPane.showInputDialog("qual é o peso")));
		CelularNovim.setAltura(Double.parseDouble(JOptionPane.showInputDialog("qual é a altura pae")));
		CelularNovim.setLarguraTela(Double.parseDouble(JOptionPane.showInputDialog("qual é o largura pae")));
		
		
		System.out.println(CelularNovo.getNome());
		System.out.println(CelularNovo.getPeso());
		System.out.println(CelularNovo.getAltura());
		System.out.println(CelularNovo.getLarguraTela());
		
		System.out.println("\n");
		
		System.out.println(JOptionPane.showInputDialog("Nome"));
		System.out.println(Double.parseDouble(JOptionPane.showInputDialog("qual é o peso")));
		System.out.println(Double.parseDouble(JOptionPane.showInputDialog("qual é a altura")));
		System.out.println(Double.parseDouble(JOptionPane.showInputDialog("qual é a largura")));
		
		
	}

}
