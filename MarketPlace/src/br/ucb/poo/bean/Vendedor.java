package br.ucb.poo.bean;

public class Vendedor {
	private int id;
	private	String nome;
	private String email;
	private String cpf;
	private String telefone;
	private static int contador_Vendedor = 0;
	
	public Vendedor() {
		
	}
	public Vendedor( String nome, String email, String cpf, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
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
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public static int getContador() {
		return contador_Vendedor;
	}
	public static void setContador(int contador) {
		Vendedor.contador_Vendedor = contador;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
