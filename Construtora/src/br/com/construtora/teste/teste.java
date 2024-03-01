package br.com.construtora.teste;

import javax.swing.JOptionPane;

import br.com.construtora.models.Apartamento;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apartamento apartamentinho = new Apartamento();
		
		apartamentinho.setNome("quadradinho");
		apartamentinho.setQuantidadedeQuartos(3);
		apartamentinho.setQuantidadedeVarandas(2);
		apartamentinho.setMetrosQuadrados(75);
		
		Apartamento triplex = new Apartamento();
		
		triplex.setNome(JOptionPane.showInputDialog("o nome do teu ap Mané"));
		triplex.setQuantidadedeQuartos(Integer.parseInt(JOptionPane.showInputDialog("qual é a quantidade de quartos viado?")));
		triplex.setQuantidadedeVarandas(Integer.parseInt(JOptionPane.showInputDialog("qual é a quantidade de Varandas man?")));
		triplex.setMetrosQuadrados(Double.parseDouble(JOptionPane.showInputDialog("qual é a quantidade de metros quadrados cz?")));
		
			
		System.out.println("o seu Apartamento se chama '" + triplex.getNome()
				+ "'\nno Apartamento tem " + triplex.getQuantidadedeQuartos()
				+ " Quartos \ne tem " + triplex.getQuantidadedeVarandas()
				+ " varandas\ne tem " + triplex.getMetrosQuadrados()
				+ " metros quadrados");
	}

}
