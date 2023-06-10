package br.ucb.poo.bean;
import java.util.ArrayList;
import java.util.Scanner;

public class Vendedor {
	private int id;
	private	String nome;
	private String email;
	private	String cep_endereco;
	private String estado;
	private int telefone;
	private int id_Vende_prod;
	private static int contador_Vendedor = 0;
	
	public Vendedor() {
		
	}
	public Vendedor( String nome, String email, String cep_endereco, String estado, int telefone, int id_Vende_prod) {
		this.nome = nome;
		this.email = email;
		this.cep_endereco = cep_endereco;
		this.estado = estado;
		this.telefone = telefone;
		this.id_Vende_prod = id_Vende_prod;
		contador_Vendedor++;
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
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCep_endereco() {
		return cep_endereco;
	}
	public void setCep_endereco(String cep_endereco) {
		this.cep_endereco = cep_endereco;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public static int getContador() {
		return contador_Vendedor;
	}
	public static void setContador(int contador) {
		Vendedor.contador_Vendedor = contador;
	}
	public int getId_Vende_prod() {
		return id_Vende_prod;
	}
	public void setId_Vende_prod(int id_Vende_prod) {
		this.id_Vende_prod = id_Vende_prod;
	}
}
