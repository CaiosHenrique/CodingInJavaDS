package br.com.fabricaroupa.teste;


import java.sql.Connection;
import java.util.ArrayList;

import br.com.fabricaroupa.conexao.Conexao;
import br.com.fabricaroupa.dao.BlusaDao;
import br.com.fabricaroupa.model.Blusa;
import br.com.fabricaroupa.model.Blusa;


public class TesteBlusa {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();
	//	Blusa blusa = new Blusa();
		BlusaDao blusadao = new BlusaDao(con);
	
		
	/*	blusa.setPeso(0.350);
		blusa.setTecido("Algodãozin");
		blusa.setTouca(true);
		*/
		
		//	System.out.println(blusadao.inserirblusa(blusa));
		
		//		System.out.println(blusadao.deletar(blusa));

		// System.out.println(blusadao.AlterarPeso(blusa))
		
		ArrayList<Blusa> lista = blusadao.retornarDadosBlusa();
		
		if (lista != null)
		{
			for (Blusa blusa : lista)
			{
				System.out.println("========================================");
				System.out.println("Peso da calça: " + blusa.getPeso());
				System.out.println("Tecido da calça: " + blusa.getTecido());
				System.out.println("Blusa tipo Touca : " + blusa.getTouca());
				System.out.println("========================================");
			}
		
		}
	
		
		
		
		
		Conexao.fecharConexao(con);
	}

}
