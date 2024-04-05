package br.com.fabricaroupa.teste;

import java.sql.Connection;
import java.util.ArrayList;


import br.com.fabricaroupa.conexao.Conexao;
import br.com.fabricaroupa.dao.CalcaDao;
import br.com.fabricaroupa.model.Calca;

public class Teste {

	public static void main(String[] args) {
	
		Connection con = Conexao.abrirConexao();
		//Calca calca = new Calca();
		CalcaDao calcadao = new CalcaDao(con);
	
		
	/*	calca.setPeso(1.99);
		calca.setTecido("pano e tecido");
		calca.setTipo(" Tenis da PUKA");
		*/
			
		ArrayList<Calca> lista = calcadao.retornarDadosCalca();
		
			if (lista != null)
			{
				for (Calca calca : lista)
				{
					System.out.println("========================================");
					System.out.println("Peso da calça: " + calca.getPeso());
					System.out.println("Tecido da calça: " + calca.getTecido());
					System.out.println("Tipo de calça: " + calca.getTipo());
					System.out.println("========================================");
				}
			
			}
		
		
	//	System.out.println(calcadao.inserircalca(calca));
		
	//		System.out.println(calcadao.deletar(calca));

	// System.out.println(calcadao.AlterarPeso(calca));
		
		Conexao.fecharConexao(con);
	}

}
