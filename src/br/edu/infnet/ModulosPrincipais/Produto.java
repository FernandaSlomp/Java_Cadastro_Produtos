package src.br.edu.infnet.ModulosPrincipais;

import java.util.Date;

public class Produto {
	private int idProduto;
	private String nomeProduto;
	private Date dataDeValidade;
	

	//Construtores

	public Produto() {
		
	}

	public Produto(int idProduto, String nomeProduto, Date dt) {
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.dataDeValidade = dt;
	}

	

	//getres e setters
	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Date getDataDeValidade() {
		return dataDeValidade;
	}

	public void setDataDeValidade(String dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}

	public String imprimir(){
		return "Nome: " + nomeProduto + "Data de Validade: " + dataDeValidade;

	}


}
