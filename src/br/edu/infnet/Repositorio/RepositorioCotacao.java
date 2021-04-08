package src.br.edu.infnet.Repositorio;

import java.util.ArrayList;

import src.br.edu.infnet.ModulosPrincipais.Cotacao;

public class RepositorioCotacao {

	public static ArrayList<Cotacao> listaCotacoes = new ArrayList<>();

	public static ArrayList<Cotacao> getListaCotacoes() {
		return listaCotacoes;
	}
	static public void addCotacao(Cotacao c){
		listaCotacoes.add(c);
	}

	public static int numeroAtual(){
		int total = 0;
	
		total = listaCotacoes.size() -1;
	
		return total;
	  };


	  static public String listar(){
		
		String saida = "";
		int i = 0;
		for (Cotacao y : listaCotacoes){
		  saida += "~~~~~~~~~~ \n";
		  saida += "Cotação Numero: " + (i++) + "\n";
		  saida += y.imprimir() + "\n";
		  saida += "\n~~~~~~~~~~";

		}
	
		return saida;
	  }

	 

}
