package br.edu.infnet.ModulosPrincipais;

public class Cotacao {
	private int idCotacao;
	private String nomeEmpresa;
	private String nomeProduto;
	private float precoProduto;
	

	//Construtores

	public Cotacao() {
		super();
	}

	public Cotacao(int idCotacao, String nomeEmpresa, String nomeProduto) {
		this.idCotacao = idCotacao
;
		this.nomeEmpresa = nomeEmpresa
;
		this.nomeProduto
 = nomeProduto
;
	}

	

	//getres e setters
	public int getidCotacao() {
		return idCotacao
;
	}

	public void setidCotacao(int idCotacao) {
		this.idCotacao
 = idCotacao
;
	}

	public String getnomeEmpresa() {
		return nomeEmpresa
;
	}

	public void setnomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa
 = nomeEmpresa
;
	}

	public String getnomeProduto() {
		return nomeProduto
;
	}

	public void setnomeProduto(String nomeProduto) {
		this.nomeProduto
 = nomeProduto
;
	}

	public String imprimir(){
		return "Nome: " + nomeEmpresa
 + "Data de Validade: " + nomeProduto;

	}


}
