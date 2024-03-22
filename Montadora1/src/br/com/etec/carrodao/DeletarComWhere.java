package br.com.etec.carrodao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.etec.model.Carro;

public class DeletarComWhere {
	
	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	private Connection con;
	
	
	public DeletarComWhere()
	{
		
	}
	public DeletarComWhere(Connection con)
	{
		setCon (con);
	}
	
	public String deletar(Carro carro) 
	{
		String sql = "delete from carro where (modeloCarro, nomeMontadora) = (?, ?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, carro.getModeloCarro());
			ps.setString(2, carro.getNomeMontadora());
			
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
