package src.br.edu.infnet.Repositorio;

import java.util.ArrayList;
import java.util.Scanner;

import src.br.edu.infnet.ModulosPrincipais.Produto;

public class RepositorioProduto{
	

	public static ArrayList<Produto> listaProdutos = new ArrayList<>();

	public static ArrayList<Produto> getListaProdutos() {
		return listaProdutos;
	}

	static public void addProduto(Produto p){
		listaProdutos.add(p);
	}

	static public String consultaNome(String nomeProd){
		String name = " ";

		for (Produto p :  listaProdutos){

			if (p.getNomeProduto().equalsIgnoreCase(nomeProd)){
				name = nomeProd;
			}
		}

		return name;
	}

	static public boolean excluirProduto (String nomeProd){
		for (Produto p :  listaProdutos){

			if (p.getNomeProduto().equalsIgnoreCase(nomeProd)){
				listaProdutos.remove(p);
				return true;
			}
		}

		return false;
	}

	public static int numeroAtual(){
		int total = 0;
	
		total = listaProdutos.size();
	
		return total;
	  }


	static public boolean alterarProduto(String nomeProd) {
		//Produto produtoSalvo = obterId(id);
		Scanner scan = new Scanner(System.in);

		for (Produto p :  listaProdutos){

			if (p.getNomeProduto().equalsIgnoreCase(nomeProd)){
				System.out.println("Digite o nome do novo produto: ");
				String newNome = scan.nextLine();
				p.setNomeProduto(newNome);
				
				return true;
			}
		}

		return false;
		
	}

}

	

