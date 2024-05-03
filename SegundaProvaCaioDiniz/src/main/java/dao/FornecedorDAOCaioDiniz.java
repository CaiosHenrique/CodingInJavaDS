package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.FornecedorCaioDiniz;


public class FornecedorDAOCaioDiniz {

	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public FornecedorDAOCaioDiniz(Connection con) {
		setCon(con);
	}
	
	public String inserir(FornecedorCaioDiniz fornecedorCaioDiniz) {
		String sql = "insert into fornecedor(cnpjfornecedor, nomefornecedor) values (?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, fornecedorCaioDiniz.getCnpjFornecedor());
			ps.setString(2, fornecedorCaioDiniz.getNomeFornecedor());
			
			
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro ao inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public ArrayList<FornecedorCaioDiniz> retornarDadosFornecedorCaioDiniz() {
		String sql = "select * from fornecedor";
		ArrayList<FornecedorCaioDiniz> retornarDadosFornecedorCaioDiniz = new ArrayList<FornecedorCaioDiniz>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					FornecedorCaioDiniz fornecedorCaioDiniz = new FornecedorCaioDiniz();
					fornecedorCaioDiniz.setCnpjFornecedor(rs.getInt(1));
					fornecedorCaioDiniz.setNomeFornecedor(rs.getString(2));
								

					retornarDadosFornecedorCaioDiniz.add(fornecedorCaioDiniz);
				}
				return retornarDadosFornecedorCaioDiniz;
			} else {
				return null;
			}
		} catch (SQLException e) {
			return null;
		}
	}
}
