package br.com.fabricacalcado.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.fabricacalcado.conexao.Conexao;
import br.com.fabricacalcado.dao.SapatoDAO;
import br.com.fabricacalcado.model.Sapato;
import br.com.fabricacalcado.model.Sapato;

public class Teste {

	public static void main(String[] args) {
		
Connection con = Conexao.abrirConexao();
		
		SapatoDAO sapatodao = new SapatoDAO(con);
		
		/* sapato.setNome("Airblade Courtesyas");
		sapato.setPeso(1);
		sapato.setTamanho(40);
		sapato.setTipoTecido("Pano"); */
		
		//System.out.println(sapatodao.inserirSapato(sapato));
	
		//	System.out.println(sapatodao.deletar(sapato));
			
		// System.out.println(sapatodao.AlterarTamanho(sapato));
			
		ArrayList<Sapato> lista = sapatodao.retornarDadosSapato();
		
		if (lista != null)
		{
			for (Sapato sapato : lista)
			{
				System.out.println("Tamanho do sapato: " + sapato.getTamanho());
				System.out.println("Peso do sapato: " + sapato.getPeso());
				System.out.println("Nome do sapato: " + sapato.getNome());
				System.out.println("Tipo do tecido: " + sapato.getTipoTecido());
			}
			
		}
		
			
			
		Conexao.fecharConexao(con);
	}

}
