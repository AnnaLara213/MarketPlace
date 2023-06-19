package br.ucb.poo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import br.ucb.poo.bean.Produto;
import br.ucb.poo.factory.ConexaoFactory;

public class ProdutoDAO {
	ConexaoFactory conexao = new ConexaoFactory();
	Connection connection = conexao.conectar();
	
	public void insereProduto(Produto produto){
		String sgl = "INSERT INTO produtos(nome, preco, descricao) VALUES (?,?,?)";
		
		try {
			PreparedStatement pstmt = connection.prepareStatement(sgl);
			pstmt.setString(1, produto.getNome());
			pstmt.setString(2, produto.getPreco());
			pstmt.setString(3, produto.getDescricao());
			pstmt.execute();
			pstmt.close();
		} catch (SQLException e) { 
			e.printStackTrace();
		}
	}

	public void deletaProduto(Produto produto) {
	    String sql = "DELETE FROM produtos WHERE nome = ? AND preco = ? AND descricao = ?";
	    try {
	        PreparedStatement pstmt = connection.prepareStatement(sql);
	        pstmt.setString(1, produto.getNome());
			pstmt.setString(2, produto.getPreco());
			pstmt.setString(3, produto.getDescricao());
	        pstmt.execute();
	        pstmt.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	public ArrayList<Produto> listaProdutos (){
		String sql = "SELECT id, nome, preco, descricao from produtos";

		ArrayList<Produto> produtos = new ArrayList<Produto>();

		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql); 
			while(rs.next()){
				Produto produto = new Produto(); 
				produto.setId(rs.getInt("id"));
				produto.setNome(rs.getString("nome"));
				produto.setPreco(rs.getString("preco"));
				produto.setDescricao(rs.getString("descricao"));
				produtos.add(produto);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace(); 
		}

			return produtos;
	}
}
