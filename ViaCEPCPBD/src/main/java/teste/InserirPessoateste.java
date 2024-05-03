package teste;

import java.sql.Connection;

import javax.swing.JOptionPane;

import conexao.Conexao;
import dao.PessoaDAO;
import model.Pessoa;

public class InserirPessoateste {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();
		PessoaDAO pessoadao = new PessoaDAO(con);
		Pessoa  pessoa = new Pessoa();
	
		
			int cpf= Integer.parseInt(JOptionPane.showInputDialog("Digite o CPF"));
			
			String nome = (JOptionPane.showInputDialog("Digite o Nome"));
			
			int idade= Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade"));
			
			pessoa.setCpf(cpf);
			pessoa.setNome(nome);
			pessoa.setIdade(idade);
			
			
			System.out.println("Os dados relacionados a Pessoa são: \n" +
				cpf + "\n" +
				nome + "\n" +	
				idade + "\n"
				);
			
			System.out.println(pessoadao.inserir(pessoa));
			
		
		Conexao.fecharConexao(con);
	}
}
