package br.ucb.poo.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import br.ucb.poo.bean.Usuario;
import br.ucb.poo.factory.ConexaoFactory;

public class UsuarioDAO {
	ConexaoFactory conexao = new ConexaoFactory();
	Connection connection = conexao.conectar();
	
	public void insereUsuario(Usuario usuario){
		String sgl = "INSERT INTO usuarios(nome, email, cpf, telefone) VALUES (?,?,?,?)";
		
		try {
			PreparedStatement pstmt = connection.prepareStatement(sgl);
			pstmt.setString(1, usuario.getNome());
			pstmt.setString(2, usuario.getEmail());
			pstmt.setString(3, usuario.getCpf());
			pstmt.setString(4, usuario.getTelefone());
			pstmt.execute();
			pstmt.close();
		} catch (SQLException e) { 
			e.printStackTrace();
		}
	}

	public void deletaUsuario(Usuario usuario) {
	    String sql = "DELETE FROM usuarios WHERE nome = ? AND email = ? AND cpf = ? AND telefone = ?";
	    try {
	        PreparedStatement pstmt = connection.prepareStatement(sql);
	        pstmt.setString(1, usuario.getNome());
	        pstmt.setString(2, usuario.getEmail());
	        pstmt.setString(3, usuario.getCpf());
	        pstmt.setString(4, usuario.getTelefone());
	        pstmt.execute();
	        pstmt.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	public ArrayList<Usuario> listaUsuarios (){
		String sql = "SELECT id, nome, email, cpf, telefone from usuarios";

		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql); 
			while(rs.next()){
				Usuario usuario = new Usuario(); 
				usuario.setId(rs.getInt("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setEmail(rs.getString("email"));
				usuario.setCpf(rs.getString("cpf"));
				usuario.setTelefone(rs.getString("telefone"));
				usuarios.add(usuario);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace(); 
		}

			return usuarios;
	}
}
