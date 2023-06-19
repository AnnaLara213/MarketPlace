package br.ucb.poo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import br.ucb.poo.factory.ConexaoFactory;
import br.ucb.poo.bean.Vendedor;

public class VendedorDAO {
	ConexaoFactory conexao = new ConexaoFactory();
	Connection connection = conexao.conectar();
	
	public void insereVendedor(Vendedor vendedor){
		String sgl = "INSERT INTO vendedores(nome, email, cpf, telefone) VALUES (?,?,?,?)";
		
		try {
			PreparedStatement pstmt = connection.prepareStatement(sgl);
			pstmt.setString(1, vendedor.getNome());
			pstmt.setString(2, vendedor.getEmail());
			pstmt.setString(3, vendedor.getCpf());
			pstmt.setString(4, vendedor.getTelefone());
			pstmt.execute();
			pstmt.close();
		} catch (SQLException e) { 
			e.printStackTrace();
		}
	}

	public void deletaVendedor(Vendedor vendedor) {
	    String sql = "DELETE FROM vendedores WHERE nome = ? AND email = ? AND cpf = ? AND telefone = ?";
	    try {
	        PreparedStatement pstmt = connection.prepareStatement(sql);
	        pstmt.setString(1, vendedor.getNome());
	        pstmt.setString(2, vendedor.getEmail());
	        pstmt.setString(3, vendedor.getCpf());
	        pstmt.setString(4, vendedor.getTelefone());
	        pstmt.execute();
	        pstmt.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	public ArrayList<Vendedor> listaVendedores (){
		String sql = "SELECT id, nome, email, cpf, telefone from vendedores";

		ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();

		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql); 
			while(rs.next()){
				Vendedor vendedor = new Vendedor(); 
				vendedor.setId(rs.getInt("id"));
				vendedor.setNome(rs.getString("nome"));
				vendedor.setEmail(rs.getString("email"));
				vendedor.setCpf(rs.getString("cpf"));
				vendedor.setTelefone(rs.getString("telefone"));
				vendedores.add(vendedor);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace(); 
		}

			return vendedores;
	}
}
