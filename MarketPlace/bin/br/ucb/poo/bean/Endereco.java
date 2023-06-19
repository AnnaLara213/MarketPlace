package br.ucb.poo.bean;

public class Endereco {
	private int id;
	private String cep;
	private String casa;
	private String endereco;
	
	public Endereco(){
		
	}
	
	public Endereco(int id, String cep, String casa,String endereco){
		this.cep = cep;
		this.casa = casa;
		this.endereco = endereco;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCasa() {
		return casa;
	}
	public void setCasa(String casa) {
		this.casa = casa;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
