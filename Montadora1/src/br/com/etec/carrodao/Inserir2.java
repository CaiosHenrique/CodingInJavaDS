package br.com.etec.carrodao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.etec.model.Carro;

public class Inserir2 {
	
	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	private Connection con;
	
	
	public Inserir2()
	{
		
	}
	public Inserir2(Connection con)
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

}
