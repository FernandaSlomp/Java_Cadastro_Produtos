package src.br.edu.infnet.ModulosPrincipais;

public class Cotacao {
	private int idCotacao;
	private String nomeProduto;
	private double precoProduto;


	public Cotacao() {
		super();
	} 
	
	public Cotacao(int idCotacao, String nomeProduto, double precoProduto) {
		this.idCotacao = idCotacao;
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
	}

	public int getidCotacao() {
		return idCotacao
;
	}

	public void setidCotacao(int idCotacao) {
		this.idCotacao = idCotacao
;
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
		return 
		
		"Nome do Produto: " + nomeProduto + String.format(" Preço: R$ %.2f", precoProduto);
		
		
		//"Nome: " + nomeProduto + " Preço do Produto: R$ %.2f" + precoProduto;

	}

	

}
