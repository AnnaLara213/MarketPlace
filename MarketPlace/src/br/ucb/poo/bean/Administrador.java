package br.ucb.poo.bean;

public class Administrador {
	private int id;
	private	String nome;
	private String email;
	private String cpf;
	private String telefone;

	public Administrador() {
		
	}
	
	public Administrador(String nome, String email, String cpf, String telefone) {
		this.setNome(nome);
		this.setEmail(email);
		this.setCpf(cpf);
		this.setTelefone(telefone);
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}