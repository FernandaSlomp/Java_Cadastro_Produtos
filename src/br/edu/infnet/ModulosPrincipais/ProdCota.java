package src.br.edu.infnet.ModulosPrincipais;

import java.util.Date;

public class ProdCota implements Comparable<ProdCota>{
	private String nomeProdutoCota;
	//private Date dataDeValidade;
	private Double precoProdutoCota;
	private int idProdCota;
	private Date dataDeValidadeCota;


	public String getNomeProdutoCota() {
		return nomeProdutoCota;
	}


	public void setNomeProdutoCota(String nomeProdutoCota) {
		this.nomeProdutoCota = nomeProdutoCota;
	}


	public Date getDataDeValidadeCota() {
		return dataDeValidadeCota;
	}


	public void setDataDeValidadeCota(Date dataDeValidadeCota) {
		this.dataDeValidadeCota = dataDeValidadeCota;
	}


	public Double getPrecoProdutoCota() {
		return precoProdutoCota;
	}


	public void setPrecoProdutoCota(Double precoProdutoCota) {
		this.precoProdutoCota = precoProdutoCota;
	}


	public String consultarSituacao(){

		return "Nome do Produto: " + getNomeProdutoCota() + " Data de validade: " + getDataDeValidadeCota() + String.format(" Preço: R$ %.2f", precoProdutoCota) + " id: " + getIdProdCota() +  "\n";
	   
	
	  }


	public ProdCota(String nomeProdutoCota, Date dataDeValidadeCota, Double precoProdutoCota, int idProdCota) {
		this.nomeProdutoCota = nomeProdutoCota;
		this.dataDeValidadeCota = dataDeValidadeCota;
		this.precoProdutoCota = precoProdutoCota;
		this.idProdCota = idProdCota;
	}


	public int getIdProdCota() {
		return idProdCota;
	}


	public void setIdProdCota(int idProdCota) {
		this.idProdCota = idProdCota;
	}



    //public boolean equals(Object o) {
    //    if (this == o) return true;
     //   if (o == null || getClass() != o.getClass()) return false;
    //    ProdCota prodCota = (ProdCota) o;
     //   return idProdCota == prodCota.//idProdCota;
   // }

    //@Override
    //public int hashCode() {
    //    return Objects.hash(idProdCota);
    //}

    
    public int compareTo(ProdCota prodCota) {
        return this.getIdProdCota() - prodCota.getIdProdCota();
    }
	


	
}
