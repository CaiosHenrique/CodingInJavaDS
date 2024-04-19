package teste;

import java.io.IOException;
import java.sql.Connection;
import javax.swing.JOptionPane;
import conexao.Conexao;
import dao.EnderecoDAO;
import model.Endereco;
import service.ViacepService;

public class Teste {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();
		EnderecoDAO enderecodao = new EnderecoDAO(con);
		ViacepService viacepservice = new ViacepService();

		try {
			//Endereco endereco = viacepservice.getEndereco("01538001");
			Endereco  endereco = viacepservice.getEndereco(JOptionPane.showInputDialog("Digite o CEP"));
			
			String recebeCep = endereco.getCep();
			String recebeLogradouro = endereco.getLocalidade();
			String recebeComplemento = endereco.getComplemento();
			String recebeBairro = endereco.getBairro();
			String recebeLocalidade = endereco.getLocalidade();
			String recebeUf = endereco.getUf();
			String recebeIbge = endereco.getIbge();
			String recebeGia = endereco.getGia();
			String recebeDdd = endereco.getDdd();
			String recebeSiafi = endereco.getSiafi();
			
			System.out.println("Os dados relacionados ao seu CEP são: \n" +
				recebeCep + "\n" +	
				recebeLogradouro + "\n" +
				recebeComplemento + "\n" +
				recebeBairro + "\n" +
				recebeLocalidade + "\n" +
				recebeUf + "\n" +
				recebeIbge + "\n" +
				recebeGia + "\n" +
				recebeDdd + "\n" +
				recebeSiafi + "\n"
					);
			
			System.out.println(enderecodao.inserir(endereco));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}



