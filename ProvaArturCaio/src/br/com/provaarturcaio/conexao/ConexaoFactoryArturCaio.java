package br.com.provaarturcaio.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactoryArturCaio {

public static void main(String[] args) throws SQLException 	{
		
		Connection conexao = null;
		//Na linha abaixo, estou armazenando o caminho do BD na vari�vel url
		String url = "jdbc:mysql://localhost:3307/caio";
		conexao = DriverManager.getConnection(url, "root", "*123456HAS*");
		System.out.println("Abriu a conexão.");
		conexao.close();
	}

}
