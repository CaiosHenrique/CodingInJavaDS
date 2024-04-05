package br.com.fabricaroupa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fabricaroupa.model.Blusa;
import br.com.fabricaroupa.model.Blusa;

public class BlusaDao {


	private Connection con;

	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	public BlusaDao() {
	}
	public BlusaDao(Connection con) {
		setCon(con);
	}
	
	
	public String inserirblusa(Blusa blusa) {
		String sql = "insert into blusa(Peso, TipoTecido, Touca) values (?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setDouble(1, blusa.getPeso());
			ps.setString(2, blusa.getTecido());
			ps.setBoolean(3,blusa.getTouca());
			
			
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro ao inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	
	public String deletar(Blusa blusa) {
		String sql = "delete from blusa where TipoTecido = (?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, blusa.getTecido());
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso";
			} else {
				return "Erro ao deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public String AlterarPeso (Blusa blusa) {
		String sql = "update blusa set Peso = (?) where TipoTecido = (?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			
			
			ps.setDouble(1, blusa.getPeso());
			ps.setString(2, blusa.getTecido());
			
			if (ps.executeUpdate() > 0) {
				return "alterado com sucesso";
			} else {
				return "Erro ao altersar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public ArrayList<Blusa> retornarDadosBlusa(){
		String sql = "select * from blusa";
		ArrayList<Blusa> retornarDadosBlusa = new ArrayList<Blusa>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			if (rs != null) {
				while(rs.next())
				{
					Blusa blusa = new Blusa();
					
					blusa.setPeso(rs.getDouble(1));
					blusa.setTecido(rs.getString(2));
					blusa.setTouca(rs.getBoolean(3));
					
				
					retornarDadosBlusa.add(blusa);
				}
				return retornarDadosBlusa;
			}
			else {
				return null;
			}
			
		}catch(SQLException e) {
		
			return null;
		}
		}

}