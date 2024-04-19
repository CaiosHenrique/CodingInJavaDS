package br.com.etec.dao; //CaioHenrique

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.etec.models.ProfessorCaioHenrique;
import br.com.etec.conexao.ConexaoCaioHenrique;

public class ProfessorDAOCaioHenrique {
	
	
	
	private Connection con;

	public void setCon(Connection con) {
		this.con = con;
	}
	public Connection getCon() {
		return con;
	}
	public ProfessorDAOCaioHenrique() {
	}
	public ProfessorDAOCaioHenrique(Connection con) {
		setCon(con);
	}
	
	public String inserirProfessor(ProfessorCaioHenrique professor) {
		String sql = "insert into Professor(materia, faculdade, freelancer) values (?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, professor.getMateria());
			ps.setString(2, professor.getFaculdade());
			ps.setBoolean(3, professor.isFreelancer());
			
			
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro ao inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	

}
