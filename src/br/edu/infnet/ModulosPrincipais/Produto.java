package br.edu.infnet.ModulosPrincipais;

public class Produto {
	private int idProduto;
	private String nomeProduto;
	private String dataDeValidade;
	

	//Construtores

	public Produto() {
		super();
	}

	public Produto(int idProduto, String nomeProduto, String dataDeValidade) {
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.dataDeValidade = dataDeValidade;
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

	public String getDataDeValidade() {
		return dataDeValidade;
	}

	public void setDataDeValidade(String dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}

	public String imprimir(){
		return "Nome: " + nomeProduto + "Data de Validade: " + dataDeValidade;

	}


}
