package src.br.edu.infnet.Repositorio;


import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

import src.br.edu.infnet.Erros.MenuException;
import src.br.edu.infnet.ModulosPrincipais.ProdCota;

public class RepositorioPC {

	//public static ArrayList<ProdCota> //listaProdCotas = new ArrayList<>();

	static SortedSet<ProdCota> listaProdCotas = new TreeSet<>();

	


	static public void addProdCota(ProdCota x){
		listaProdCotas.add(x);
	}

	static public String listar(){
		
		String saida = "";
		int i = 0;
		for (ProdCota y : listaProdCotas){
		  saida += "~~~~~~~~~~ \n";
		  saida += "ProdutoNumero: " + (i++) + "\n";
		  saida += y.consultarSituacao() + "\n";
		  saida += "\n~~~~~~~~~~";

		}
	
		return saida;
	  }

	  static public boolean excluirProdCota (int idProd){
		for (ProdCota p :  listaProdCotas){

			if (p.getIdProdCota() == idProd){
				listaProdCotas.remove(p);
				return true;
			}
		}

		return false;
	}

	public static SortedSet<ProdCota> getListaProdCotas()  {
		return listaProdCotas;
	}

	static public String pesquisarProdCota(int idProd) throws MenuException {
		try{
		for (ProdCota p :  listaProdCotas){

			if (p.getIdProdCota() == idProd){
				return p.consultarSituacao();
		
			}
		}
	} catch (NullPointerException x){
		System.out.println(x);
		
	}
		return null;

	}

	static public String pesquisar2(){
		for (ProdCota p : listaProdCotas){
			if (p.getPrecoProdutoCota() >= 100){
				return p.consultarSituacao();
			}
		}
		return null;
	}
	
}
