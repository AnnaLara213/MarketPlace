package br.ucb.poo.bean;

public class Produto {
	private int id;
	private	String nome;
	private String preco;
	private String descricao;
	private static int contador_produto = 0;
	
	public Produto() {

	} 
	
	public Produto(String nome, String preco, String descricao) {
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
		contador_produto++;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public static int getContador() {
		return contador_produto;
	}
	public static void setContador(int contador) {
		Produto.contador_produto = contador;
	}
}
