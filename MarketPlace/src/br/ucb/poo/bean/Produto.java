package br.ucb.poo.bean;
import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
	private int id;
	private	String nome;
	private int preco;
	private String descricao;
	private static int contador_produto = 0;
	private int id_Vende_prod;
	
	public Produto(String nome, int preco, String descricao, int id_Vende_prod) {
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
		this.id_Vende_prod = id_Vende_prod;
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
	
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
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

	public int getId_Vende_prod() {
		return id_Vende_prod;
	}

	public void setId_Vende_prod(int id_Vende_prod) {
		this.id_Vende_prod = id_Vende_prod;
	}
	
	
}
