package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Pessoa;
import model.Pessoa;


public class PessoaDAO {
	
	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}
	
	public PessoaDAO(Connection con) {
		setCon(con);
	}

	
		
	
	public String inserirPessoa(Pessoa pessoa) {
		String sql = "insert into pessoa(cpf, nome,idade) values (?,?, ?)";
		try {
		
			PreparedStatement ps = getCon().prepareStatement(sql);
			
			ps.setLong(1, pessoa.getCpf());
			ps.setString(2, pessoa.getNome());
			ps.setInt(3, pessoa.getIdade());
		
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro ao inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
}
	
	public ArrayList<Pessoa> retornarDadosPessoa(){
		String sql = "select * from Pessoa";
		ArrayList<Pessoa> retornarDadosPessoa = new ArrayList<Pessoa>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			if (rs != null) {
				while(rs.next())
				{
					
					Pessoa pessoa = new Pessoa();
			
					pessoa.setCpf(rs.getLong(1));
					pessoa.setNome(rs.getString(2));
					pessoa.setIdade(rs.getInt(3));
					
					retornarDadosPessoa.add(pessoa);
				}
				return retornarDadosPessoa;
			}
			else {
				return null;
			}
			
		}catch(SQLException e) {
		
			return null;
		}
		}
	
	
	
}	
