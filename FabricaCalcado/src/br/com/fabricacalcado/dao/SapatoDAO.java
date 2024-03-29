package br.com.fabricacalcado.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fabricacalcado.model.Sapato;
import br.com.fabricacalcado.model.Sapato;
import br.com.fabricacalcado.model.Sapato;
import br.com.fabricacalcado.model.Sapato;



	
	public class SapatoDAO {

		private Connection con;

		public Connection getCon() {
			return con;
		}
		public void setCon(Connection con) {
			this.con = con;
		}
		public SapatoDAO() {
		}
		public SapatoDAO(Connection con) {
			setCon(con);
		}
		
		
		public String inserirSapato(Sapato sapato) {
			String sql = "insert into sapato(Tamanho, Peso, Nome, TipoTecido) values (?,?,?,?)";
			try {
				
				PreparedStatement ps = getCon().prepareStatement(sql);
				
				ps.setInt(1, sapato.getTamanho());
				ps.setDouble(2, sapato.getPeso());
				ps.setString(3,sapato.getNome());
				ps.setString(4, sapato.getTipoTecido());
				
				
				if (ps.executeUpdate() > 0) {
					return "Inserido com sucesso";
				} else {
					return "Erro ao inserir";
				}
			} catch (SQLException e) {
				return e.getMessage();
			}
		}
		
		public String deletar(Sapato sapato) {
			String sql = "delete from sapato where Nome = (?)";
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ps.setString(1, sapato.getNome());
				if (ps.executeUpdate() > 0) {
					return "Deletado com sucesso";
				} else {
					return "Erro ao deletar";
				}
			} catch (SQLException e) {
				return e.getMessage();
			}
		}
		
		public String AlterarTamanho (Sapato sapato) {
			String sql = "update sapato set Tamanho = (?) where Nome = (?)";
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				
				
				ps.setInt(1, sapato.getTamanho());
				ps.setString(2, sapato.getNome());
				
				if (ps.executeUpdate() > 0) {
					return "alterado com sucesso";
				} else {
					return "Erro ao altersar";
				}
			} catch (SQLException e) {
				return e.getMessage();
			}
		}
		
		public ArrayList<Sapato> retornarDadosSapatocomWhere(Sapato sapato){
			String sql = "select * from sapato where Tamanho = (?)";
			ArrayList<Sapato> retornarDadosSapatocomWhere = new ArrayList<Sapato>();
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				
				ps.setInt(1, sapato.getTamanho());
				
				ResultSet rs = ps.executeQuery();
				
				if (rs != null) {
					while(rs.next())
					{
						sapato.setTamanho(rs.getInt(1));
						sapato.setPeso(rs.getDouble(2));
						sapato.setNome(rs.getString(3));
						sapato.setTipoTecido(rs.getString(4));
						
						retornarDadosSapatocomWhere.add(sapato);
					}
					return retornarDadosSapatocomWhere;
				}
				else {
					return null;
				}
				
			}catch(SQLException e) {
			
				return null;
			}
			}
}
