package br.com.etec.teste;//CaioHenrique

import java.io.IOException;
import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.etec.conexao.ConexaoCaioHenrique;
import br.com.etec.dao.ProfessorDAOCaioHenrique;
import br.com.etec.models.ProfessorCaioHenrique;


public class TesteProfessorCaioHenrique {

	public static void main(String[] args) {
		
		Connection con = ConexaoCaioHenrique.abrirConexao();
//		ViacepService viacepservice = new ViacepService();
//		enderecoDAO enderecodao = new enderecoDAO(con);

		
		ProfessorDAOCaioHenrique professordao = new ProfessorDAOCaioHenrique(con);
		ProfessorCaioHenrique professor = new ProfessorCaioHenrique();
		
		professor.setMateria("historia");
		professor.setFaculdade("UFRJ");
		professor.setFreelancer(true);
		
		
		
		
		
		/*try {
			//Endereco endereco = viacepservice.getEndereco("01538001");
			Endereco endereco = viacepservice.getEndereco(JOptionPane.showInputDialog("Digite o CEP"));
			
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
		
		*/
		
		System.out.println(professordao.inserirProfessor(professor));
		
		ConexaoCaioHenrique.fecharConexao(con);

	}

}
