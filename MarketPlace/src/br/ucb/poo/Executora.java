package br.ucb.poo;

import java.util.ArrayList;

import br.ucb.poo.bean.Administrador;
import br.ucb.poo.bean.Produto;
import br.ucb.poo.bean.Usuario;
import br.ucb.poo.bean.Vendedor;
import br.ucb.poo.dao.AdministradorDAO;
import br.ucb.poo.dao.ProdutoDAO;
import br.ucb.poo.dao.UsuarioDAO;
import br.ucb.poo.dao.VendedorDAO;

public class Executora {
	public static void main(String[] args) { 
		System.out.println("--- SISTEMA Vendedor---");
	
		VendedorDAO dao_vendedor = new VendedorDAO();
		
		//Ao "descomentar o trecho abaixo toda execução do programa resultará em um novo "insert"
		
		Vendedor vendedor = new Vendedor();
		
		vendedor.setNome("Diego");
		vendedor.setEmail("Uceee1");
		vendedor.setCpf("tstdtds");
		vendedor.setTelefone("55555");
		dao_vendedor.insereVendedor(vendedor);
		
		Vendedor vendedorr = new Vendedor();
		vendedorr.setNome("Carlos");
		vendedorr.setEmail("PPPPP@sss");
		vendedorr.setCpf("222.222.222-22");
		vendedorr.setTelefone("44444");
		dao_vendedor.deletaVendedor(vendedorr);
		
		
		ArrayList<Vendedor> vendedores = new ArrayList<>(); 
		vendedores = dao_vendedor.listaVendedores();
		
		for (Vendedor a : vendedores ){
			System.out.println("nome: " + a.getNome() +" email: " + a.getEmail() + " CPF:" + a.getCpf() + " Telefone:" + a.getTelefone());
		}
		
		
		System.out.println("--- SISTEMA USUARIO---");
		
		UsuarioDAO dao_suarioDAO = new UsuarioDAO();
		
		//Ao "descomentar o trecho abaixo toda execução do programa resultará em um novo "insert"
		
		Usuario usuario = new Usuario();
		
		usuario.setNome("USU 1");
		usuario.setEmail("USU@");
		usuario.setCpf("USU@");
		usuario.setTelefone("USU@");
		dao_suarioDAO.insereUsuario(usuario);
		
		Usuario usuarior = new Usuario();
		usuarior.setNome("Anna");
		usuarior.setEmail("Anna");
		usuarior.setCpf("Anna");
		usuarior.setTelefone("Anna");
		dao_suarioDAO.deletaUsuario(usuarior);
		
		
		ArrayList<Usuario> usuarios = new ArrayList<>(); 
		usuarios = dao_suarioDAO.listaUsuarios();
		
		for (Usuario b : usuarios ){
			System.out.println("nome: " + b.getNome() +" email: " + b.getEmail() + " CPF:" + b.getCpf() + " Telefone:" + b.getTelefone());
		}
		
		
		
		System.out.println("--- SISTEMA ADM---");
		
		AdministradorDAO dao_administradorDAO = new AdministradorDAO();
		
		//Ao "descomentar o trecho abaixo toda execução do programa resultará em um novo "insert"
		
		Administrador administrador = new Administrador();
		
		administrador.setNome("ADM");
		administrador.setEmail("ADM");
		administrador.setCpf("ADM");
		administrador.setTelefone("ADM");
		dao_administradorDAO.insereAdministrador(administrador);
		
		Administrador administradorr = new Administrador();
		administradorr.setNome("ADMADMADM");
		administradorr.setEmail("ADMADMADM");
		administradorr.setCpf("ADMADMADM");
		administradorr.setTelefone("ADMADMADM");
		dao_administradorDAO.deletaAdministrador(administradorr);
		
		
		ArrayList<Administrador> administradores = new ArrayList<>(); 
		administradores = dao_administradorDAO.listaAdministradores();
		
		for (Administrador c : administradores ){
			System.out.println("nome: " + c.getNome() +" email: " + c.getEmail() + " CPF:" + c.getCpf() + " Telefone:" + c.getTelefone());
		}
		
System.out.println("--- SISTEMA ADM---");
		
		ProdutoDAO  dao_produtoDAO  = new ProdutoDAO();
		
		//Ao "descomentar o trecho abaixo toda execução do programa resultará em um novo "insert"
		
		Produto produto = new Produto();
		
		produto.setNome("PROD");
		produto.setPreco("PROD");
		produto.setDescricao("PROD");
		dao_produtoDAO.insereProduto(produto);
		
		Produto produtor = new Produto();
		produtor.setNome("PRODPRODPROD");
		produtor.setPreco("PRODPRODPROD");
		produtor.setDescricao("PRODPRODPROD");
		dao_produtoDAO.deletaProduto(produtor);
		
		
		ArrayList<Produto> produtos = new ArrayList<>(); 
		produtos = dao_produtoDAO.listaProdutos();
		
		for (Produto d : produtos ){
			System.out.println("nome: " + d.getNome() +" Preço: " + d.getPreco() + " Descrição:" + d.getDescricao());
		}
		
		
	}
}
      