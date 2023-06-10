package br.ucb.poo;

import java.util.ArrayList;
import java.util.Scanner;

import br.ucb.poo.bean.*;

public class Executora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello Word");

        ArrayList<Vendedor> vendedores = new ArrayList<>();

        while (true) {
            System.out.println("Digite o nome do vendedor: ");
            String nome = sc.nextLine();

            System.out.println("Digite o email do vendedor: ");
            String email = sc.nextLine();

            System.out.println("Digite o CEP e endereço do vendedor: ");
            String cep_endereco = sc.nextLine();

            System.out.println("Digite o estado do vendedor: ");
            String estado = sc.nextLine();

            System.out.println("Digite o telefone do vendedor: ");
            int telefone = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite qual vai ser seu codigo de vendedor: ");
            int id_Vende_prod = sc.nextInt();
            sc.nextLine();

            Vendedor vendedor = new Vendedor(nome, email, cep_endereco, estado, telefone, id_Vende_prod);

            vendedores.add(vendedor);

            System.out.println("Deseja cadastrar mais um vendedor? (s/n)");
            String resposta = sc.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }

        for (Vendedor v : vendedores) {
            System.out.println("Nome: " + v.getNome());
            System.out.println("Email: " + v.getEmail());
            System.out.println("CEP e endereço: " + v.getCep_endereco());
            System.out.println("Estado: " + v.getEstado());
            System.out.println("Telefone: " + v.getTelefone());
            System.out.println("ID do vendedor: " + v.getId_Vende_prod());
            System.out.println();
        }
        System.out.println("Quantidade de vendedores: " + Vendedor.getContador());
		
		ArrayList<Produto> produtos = new ArrayList<>();

		while(true) {
			 System.out.print("Digite o ID do vendedor: ");
	            int idVendedor = sc.nextInt();
	            sc.nextLine();

	            boolean vendedorEncontrado = false;
	            for (Vendedor v : vendedores) {
	                if (v.getId_Vende_prod() == idVendedor) {
	                    vendedorEncontrado = true;
	                    break;
	                }
	            }

	            if (!vendedorEncontrado) {
	                System.out.println("Vendedor inválido.");
	                continue;
	            }
				System.out.println("Digite o nome do produto: ");
				String nome = sc.nextLine();
		
				System.out.println("Digite o preço do produto:");
				int preco = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Digite a descrição do produto:");
				String descricao = sc.nextLine();
				
				Produto produto = new Produto(nome, preco, descricao, idVendedor);
				
				produtos.add(produto);
				
				System.out.println("Deseja adicionar mais um produto? (s/n)");
	            String resposta = sc.nextLine();
	            if (!resposta.equalsIgnoreCase("s")) {
	                break;
	            }
		}
		
		for (Produto p : produtos) {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Preço: " + p.getPreco());
            System.out.println("Descrição: " + p.getDescricao());
            System.out.println("Codigo do vendedor:" + p.getId_Vende_prod());
            System.out.println();
        }
		System.out.println("Quantidade de produtos: " + Produto.getContador());
	}
}


      