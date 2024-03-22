package br.com.etec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.etec.model.Pessoa;

public class PessoaDAO {
	
	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	private Connection con;
	
	
	public PessoaDAO()
	{
		
	}
	public PessoaDAO(Connection con)
	{
		setCon (con);
	}
	
	public String inserir(Pessoa pessoa){
		String sql = "insert into pessoa(nome, endereco) values (?,?)";
		try
		{
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, pessoa.getNome());
			ps.setString(2, pessoa.getEndereco());
			
			if(ps.executeUpdate() > 0)
			{
				return "Foi Inserido ao banco";
			}
			else 
			{
				return "Erro ao Inserir";
			}
		}
		catch(SQLException e)
		{
			return e.getMessage();
		}
	}
	
	public String deletar(Pessoa pessoa) 
	{
		String sql = "delete from pessoa where nome = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, pessoa.getNome());
			if(ps.executeUpdate() > 0) {
				return "Deletado com sucesso";
			}
			else 
			{
				return "erro ao deletar";
			}
			}
			catch(SQLException e) {
				return e.getMessage();
			}
		}
}
	
