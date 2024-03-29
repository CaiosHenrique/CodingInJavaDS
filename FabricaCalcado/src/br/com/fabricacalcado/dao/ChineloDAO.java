package br.com.fabricacalcado.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fabricacalcado.model.Chinelo;
		
	public class ChineloDAO {

		private Connection con;

		public Connection getCon() {
			return con;
		}
		public void setCon(Connection con) {
			this.con = con;
		}
		public ChineloDAO() {
		}
		public ChineloDAO(Connection con) {
			setCon(con);
		}
		
		
		public String inserirChinelo(Chinelo chinelo) {
			String sql = "insert into chinelo(Tamanho, Peso, Nome, QuantidadedeTiras) values (?,?,?,?)";
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ps.setInt(1, chinelo.getTamanho());
				ps.setDouble(2, chinelo.getPeso());
				ps.setString(3,chinelo.getNome());
				ps.setInt(4, chinelo.getQuantidadedeTiras());
				
				
				if (ps.executeUpdate() > 0) {
					return "Inserido com sucesso";
				} else {
					return "Erro ao inserir";
				}
			} catch (SQLException e) {
				return e.getMessage();
			}
		}
		
		public String deletar(Chinelo chinelo) {
			String sql = "delete from chinelo where Nome = (?)";
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ps.setString(1, chinelo.getNome());
				if (ps.executeUpdate() > 0) {
					return "Deletado com sucesso";
				} else {
					return "Erro ao deletar";
				}
			} catch (SQLException e) {
				return e.getMessage();
			}
		}
		
		
		public String AlterarTamanho (Chinelo chinelo) {
			String sql = "update chinelo set Tamanho = (?) where Nome = (?)";
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				
				
				ps.setInt(1, chinelo.getTamanho());
				ps.setString(2, chinelo.getNome());
				
				if (ps.executeUpdate() > 0) {
					return "alterado com sucesso";
				} else {
					return "Erro ao altersar";
				}
			} catch (SQLException e) {
				return e.getMessage();
			}
		}
		
		// SELECT 
		public ArrayList<Chinelo> retornarDadosChinelo(){
			String sql = "select * from chinelo";
			ArrayList<Chinelo> retornarDadosChinelo = new ArrayList<Chinelo>();
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				
				if (rs != null) {
					while(rs.next())
					{
						Chinelo chinelo = new Chinelo();
						chinelo.setTamanho(rs.getInt(1));
						chinelo.setPeso(rs.getDouble(2));
						chinelo.setNome(rs.getString(3));
						chinelo.setQuantidadedeTiras(rs.getInt(4));
						
						retornarDadosChinelo.add(chinelo);
					}
					return retornarDadosChinelo;
				}
				else {
					return null;
				}
				
			}catch(SQLException e) {
			
				return null;
			}
			}
		}
	


