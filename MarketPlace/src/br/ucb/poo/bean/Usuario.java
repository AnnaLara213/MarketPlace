package br.ucb.poo.bean;

public class Usuario {
	private int id;
	private	String nome;
	private String email;
	private	String cep_endereco;
	private String estado;
	private int telefone;
	private static int contador_Usuario = 0;
	
	public Usuario() {
		
	}
	public Usuario(String nome, String email, String cep_endereco, String estado, int telefone) {
		this.setNome(nome);
		this.setEmail(email);
		this.setCep_endereco(cep_endereco);
		this.setEstado(estado);
		this.setTelefone(telefone);
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
		return contador_Usuario;
	}
	public static void setContador(int contador) {
		Usuario.contador_Usuario = contador;
	}
}