package br.com.fabricaroupa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fabricaroupa.model.Calca;

public class CalcaDao {


	private Connection con;

	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	public CalcaDao() {
	}
	public CalcaDao(Connection con) {
		setCon(con);
	}
	
	
	public String inserircalca(Calca calca) {
		String sql = "insert into calca(Peso, TipoTecido, Tipo) values (?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setDouble(1, calca.getPeso());
			ps.setString(2, calca.getTecido());
			ps.setString(3,calca.getTipo());
			
			
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro ao inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	
	public String deletar(Calca calca) {
		String sql = "delete from calca where TipoTecido = (?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, calca.getTecido());
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso";
			} else {
				return "Erro ao deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public String AlterarPeso (Calca calca) {
		String sql = "update calca set Peso = (?) where TipoTecido = (?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			
			
			ps.setDouble(1, calca.getPeso());
			ps.setString(2, calca.getTecido());
			
			if (ps.executeUpdate() > 0) {
				return "alterado com sucesso";
			} else {
				return "Erro ao altersar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public ArrayList<Calca> retornarDadosCalca(){
		String sql = "select * from calca";
		ArrayList<Calca> retornarDadosCalca = new ArrayList<Calca>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			if (rs != null) {
				while(rs.next())
				{
					Calca calca = new Calca();
					
					calca.setPeso(rs.getDouble(1));
					calca.setTecido(rs.getString(2));
					calca.setTipo(rs.getString(3));
					
				
					retornarDadosCalca.add(calca);
				}
				return retornarDadosCalca;
			}
			else {
				return null;
			}
			
		}catch(SQLException e) {
		
			return null;
		}
		}

}
