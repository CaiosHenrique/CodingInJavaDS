package teste;

import java.io.IOException;
import java.sql.Connection;
import javax.swing.JOptionPane;
import conexao.ConexaoCaioDiniz;
import dao.EnderecoDAOCaioDiniz;
import dao.FornecedorDAOCaioDiniz;
import model.EnderecoCaioDiniz;
import model.FornecedorCaioDiniz;
import service.CaioDinizService;

public class PrincipalCaioDiniz {

	public static void main(String[] args) {

		Connection con = ConexaoCaioDiniz.abrirConexao();
		EnderecoDAOCaioDiniz enderecodao = new EnderecoDAOCaioDiniz(con);
		CaioDinizService viacepservice = new CaioDinizService();
		FornecedorDAOCaioDiniz fornecedordao = new FornecedorDAOCaioDiniz(con);

	
		try {
			//Endereco endereco = viacepservice.getEndereco("01538001");
			int CnpjFornecedor= Integer.parseInt(JOptionPane.showInputDialog("Digite o Cnpj do Fornecedor"));
			
			String NomeFornecedor= JOptionPane.showInputDialog("Digite o Nome do Fornecedor");

			FornecedorCaioDiniz fornecedor = new FornecedorCaioDiniz();
			fornecedor.setNomeFornecedor(NomeFornecedor);
			fornecedor.setCnpjFornecedor(CnpjFornecedor);
			
			EnderecoCaioDiniz  endereco = viacepservice.getEndereco(JOptionPane.showInputDialog("Digite o CEP"));
		
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
				CnpjFornecedor + "\n" +
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
			
			System.out.println(enderecodao.inserir(endereco, CnpjFornecedor));
			System.out.println(fornecedordao.inserir(fornecedor));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}



