package teste;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import conexao.Conexao;
import dao.EnderecoDAO;
import model.Endereco;

public class TesteSelect {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();
		EnderecoDAO enderecodao = new EnderecoDAO(con);
	
		
		ArrayList<Endereco> lista = enderecodao.retornarDadosEndereco();
		
		if (lista != null)
		{
			for (Endereco endereco : lista)
			{
				System.out.println("========================================");
			
				System.out.println("CEP: " + endereco.getCep());
				System.out.println("Logradouro: " + endereco.getLogradouro());
				System.out.println("Complemento: " + endereco.getComplemento());
				System.out.println("Bairro: " + endereco.getBairro());
				System.out.println("Localidade: " + endereco.getLocalidade());
				System.out.println("UF: " + endereco.getUf());
				System.out.println("Ibge: " + endereco.getIbge());
				System.out.println("Gia: " + endereco.getGia());
				System.out.println("DDD: " + endereco.getDdd());
				System.out.println("Siafi: " + endereco.getSiafi());
				System.out.println("========================================");
			}
		
		}
		
		
		Conexao.fecharConexao(con);
	}
	
	

}
