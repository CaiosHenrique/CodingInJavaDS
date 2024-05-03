package teste;

import java.sql.Connection;
import java.util.ArrayList;

import conexao.Conexao;
import dao.PessoaDAO;
import model.Pessoa;

public class SelecionarPessoateste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();
		PessoaDAO pessoadao = new PessoaDAO(con);

		ArrayList<Pessoa> lista = pessoadao.retornarDadosPessoa();

		if (lista != null) {
			for (Pessoa pessoa : lista) {
				System.out.println("CPF: " + pessoa.getCpf());
				System.out.println("Nome: " + pessoa.getNome());
				System.out.println("Idade: " + pessoa.getIdade() + "\n");
			}
		}
		Conexao.fecharConexao(con);
	}
}
