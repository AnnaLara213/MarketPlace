package br.ucb.poo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import br.ucb.poo.bean.Administrador;
import br.ucb.poo.factory.ConexaoFactory;

public class AdministradorDAO {
	ConexaoFactory conexao = new ConexaoFactory();
	Connection connection = conexao.conectar();
	
	public void insereAdministrador(Administrador administrador){
		String sgl = "INSERT INTO administradores(nome, email, cpf, telefone) VALUES (?,?,?,?)";
		
		try {
			PreparedStatement pstmt = connection.prepareStatement(sgl);
			pstmt.setString(1, administrador.getNome());
			pstmt.setString(2, administrador.getEmail());
			pstmt.setString(3, administrador.getCpf());
			pstmt.setString(4, administrador.getTelefone());
			pstmt.execute();
			pstmt.close();
		} catch (SQLException e) { 
			e.printStackTrace();
		}
	}

	public void deletaAdministrador(Administrador  administrador) {
	    String sql = "DELETE FROM administradores WHERE nome = ? AND email = ? AND cpf = ? AND telefone = ?";
	    try {
	        PreparedStatement pstmt = connection.prepareStatement(sql);
	        pstmt.setString(1, administrador.getNome());
	        pstmt.setString(2, administrador.getEmail());
	        pstmt.setString(3, administrador.getCpf());
	        pstmt.setString(4, administrador.getTelefone());
	        pstmt.execute();
	        pstmt.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	public ArrayList<Administrador> listaAdministradores (){
		String sql = "SELECT id, nome, email, cpf, telefone from administradores";

		ArrayList<Administrador> administradores = new ArrayList<Administrador>();

		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql); 
			while(rs.next()){
				Administrador administrador = new Administrador(); 
				administrador.setId(rs.getInt("id"));
				administrador.setNome(rs.getString("nome"));
				administrador.setEmail(rs.getString("email"));
				administrador.setCpf(rs.getString("cpf"));
				administrador.setTelefone(rs.getString("telefone"));
				administradores.add(administrador);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace(); 
		}

			return administradores;
	}
}
