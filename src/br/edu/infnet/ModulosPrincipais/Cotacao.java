package br.edu.infnet.ModulosPrincipais;

public class Cotacao {
	private String idProduto;
	private String nomeProduto;
	private double precoProduto;


	public Cotacao() {
		super();
	} 
	
	public Cotacao(String idProduto, String nomeProduto, double precoProduto) {
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
	}

	public String getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

	
	public String imprimir(){
		return "Nome: " + nomeProduto + "Preço do Produto: " + precoProduto;

	}

	

}
