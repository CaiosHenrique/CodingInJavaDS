package br.com.fabricacalcado.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.fabricacalcado.conexao.Conexao;
import br.com.fabricacalcado.dao.SapatoDAO;
import br.com.fabricacalcado.model.Sapato;

public class TesteSelecionarcomWhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = Conexao.abrirConexao();
		
		SapatoDAO sapatodao = new SapatoDAO(con);
		
		
		ArrayList<Sapato> lista = sapatodao.retornarDadosSapatocomWhere();
		
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
