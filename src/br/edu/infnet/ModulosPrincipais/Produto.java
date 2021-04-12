package src.br.edu.infnet.ModulosPrincipais;

import java.util.Date;

public class Produto {
	private int idProduto;
	private String nomeProduto;
	private Date dataDeInclusao;
	

	//Construtores

	public Produto() {
		
	}

	public Produto(int idProduto, String nomeProduto, Date dt) {
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.dataDeInclusao = dt;
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

	public Date getDataDeInclusao() {
		return dataDeInclusao;
	}

	public void setDataDeInclusao(String dataDeInclusao) {
		this.dataDeInclusao = dataDeInclusao;
	}

	public String imprimir(){
		return "Nome: " + nomeProduto + "Data de Validade: " + dataDeInclusao;

	}


}
