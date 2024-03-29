package br.com.fabricacalcado.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.fabricacalcado.conexao.Conexao;
import br.com.fabricacalcado.dao.ChineloDAO;
import br.com.fabricacalcado.model.Chinelo;

public class TesteInserirChinelo {

	public static void main(String[] args) {
Connection con = Conexao.abrirConexao();
		
		
		ChineloDAO chinelodao = new ChineloDAO(con);
		
	/*	chinelo.setNome("Airblade Courtesyas");
		chinelo.setPeso(1);
		chinelo.setTamanho(33);
		chinelo.setQuantidadedeTiras(5); */
		
		ArrayList<Chinelo> lista = chinelodao.retornarDadosChinelo();
		
		if (lista != null)
		{
			for (Chinelo chinelo : lista)
			{
				System.out.println("Tamanho do chinelo: " + chinelo.getTamanho());
				System.out.println("Peso do chinelo: " + chinelo.getPeso());
				System.out.println("Nome do chinelo: " + chinelo.getNome());
				System.out.println("Quantidades de tiras do chinelo: " + chinelo.getQuantidadedeTiras());
			}
			
		}
		
	//	System.out.println(chinelodao.inserirChinelo(chinelo));
		
	//	System.out.println(chinelodao.deletar(chinelo));
		
	// System.out.println(chinelodao.AlterarTamanho(chinelo));
		
		Conexao.fecharConexao(con);

	}

}
