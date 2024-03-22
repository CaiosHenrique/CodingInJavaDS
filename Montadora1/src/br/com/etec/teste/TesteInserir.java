package br.com.etec.teste;

import java.sql.Connection;

import br.com.etec.carrodao.Inserir2;
import br.com.etec.model.Carro;

public class TesteInserir {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();
		
		Carro carro = new Carro();
		Inserir2 inserir2 = new Inserir2(con);
		
		pessoa.setNome("Caio Moedas");

		
		System.out.println(inserir2.inserir(inserir2));
		
		Conexao.fecharConexao(con);
		
	}

}
