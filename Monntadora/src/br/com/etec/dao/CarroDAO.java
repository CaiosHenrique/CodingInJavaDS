package br.com.etec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.etec.model.Carro;

public class CarroDAO {
	
	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	private Connection con;
	
	
	public CarroDAO()
	{
		
	}
	public CarroDAO(Connection con)
	{
		setCon (con);
	}
	
	public String inserir(Carro carro){
		String sql = "insert into carro(modeloCarro, nomeMontadora) values (?, ?)";
		try
		{
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, carro.getModeloCarro());
			ps.setString(2, carro.getNomeMontadora());
			
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
	
	public String deletar(Carro carro){
		String sql = "insert into carro(modeloCarro, nomeMontadora) values (?, ?)";
		try
		{
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, carro.getModeloCarro());
			ps.setString(2, carro.getNomeMontadora());
			
			if(ps.executeUpdate() > 0)
			{
				return "Foi deletado ao banco";
			}
			else 
			{
				return "Erro ao deletar";
			}
		}
		catch(SQLException e)
		{
			return e.getMessage();
		}
	}
	
	
	

}
