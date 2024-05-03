package teste;

import java.sql.Connection;
import java.util.ArrayList;

import conexao.Conexao;
import dao.EnderecoDAO;
import model.Endereco;



public class SelecionarEnderecoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();
		EnderecoDAO enderecodao = new EnderecoDAO(con);

		ArrayList<Endereco> lista = enderecodao.retornarDadosEndereco();

		if (lista != null) {
			for (Endereco endereco : lista) {
				System.out.println("CPF: " + endereco.getCpf());
				System.out.println("CEP: " + endereco.getCep());
				System.out.println("Logradouro: " + endereco.getLogradouro() + "\n");
				System.out.println("Complemento: " + endereco.getComplemento() + "\n");
				System.out.println("Bairro: " + endereco.getBairro() + "\n");
				System.out.println("Localide: " + endereco.getLocalidade() + "\n");
				System.out.println("UF: " + endereco.getUf() + "\n");
				System.out.println("IBGE: " + endereco.getIbge() + "\n");
				System.out.println("GIA: " + endereco.getGia() + "\n");
				System.out.println("DDD: " + endereco.getDdd() + "\n");
				System.out.println("SIAFI: " + endereco.getSiafi() + "\n");
				;

			}
		}
		Conexao.fecharConexao(con);
	}
}
