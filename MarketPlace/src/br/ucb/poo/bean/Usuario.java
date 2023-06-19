package br.ucb.poo.bean;

public class Usuario {
	private int id;
	private	String nome;
	private String email;
	private String telefone;
	private String cpf;
	private static int contador_Usuario = 0;
	
	public Usuario() {
		
	}
	public Usuario(String nome, String email, String telefone, String cpf) {
		this.setNome(nome);
		this.setEmail(email);
		this.setTelefone(telefone);
		this.setCpf(cpf);
		contador_Usuario++;
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
	public void setTelefone(String telefone2) {
		this.telefone = telefone2;
	}
	public static int getContador() {
		return contador_Usuario;
	}
	public static void setContador(int contador) {
		Usuario.contador_Usuario = contador;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
