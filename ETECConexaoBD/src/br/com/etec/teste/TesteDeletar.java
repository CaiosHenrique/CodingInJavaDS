package br.com.etec.teste;

import java.sql.Connection;

import br.com.etec.dao.PessoaDAO;
import br.com.etec.model.Pessoa;
import br.com.etecconexaobd.Conexao;

public class TesteDeletar {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();
		
		Pessoa pessoa = new Pessoa();
		PessoaDAO pessoadao = new PessoaDAO(con);
		
		pessoa.setNome("Caio Moedas");

		
		System.out.println(pessoadao.deletar(pessoa));
		
		Conexao.fecharConexao(con);
		

	}

}
