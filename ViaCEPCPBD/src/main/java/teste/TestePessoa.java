package teste;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import conexao.Conexao;
import dao.PessoaDAO;
import model.Pessoa;
import service.ViacepService;

public class TestePessoa {

	public static void main(String[] args) {
		

		Connection con = Conexao.abrirConexao();
		PessoaDAO pessoadao = new PessoaDAO(con);
		ViacepService viacepservice = new ViacepService();
		
		
		Long cpf = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF"));
		String Nome = JOptionPane.showInputDialog("Digite o Nome");
		int Idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade"));
		
		Pessoa pessoa = new Pessoa();
		
		cpf = pessoa.getCpf();
		Nome = pessoa.getNome();
		Idade = pessoa.getIdade();
		
		System.out.println("Os seus dados são: \n" +
				cpf + "\n" +
				Nome + "\n" +	
				Idade + "\n" );
				
		
		System.out.println(pessoadao.inserirPessoa(pessoa));
		
		
		
		Conexao.fecharConexao(con);
		
		}

	}


