package com.app.entities;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

public class detail_commande implements Serializable{
   
	@Id
	private String id;
	
	@NotNull
	private String commande_id;
	@NotNull
	private String produit_id;
	
	private int qte;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCommande_id() {
		return commande_id;
	}

	public void setCommande_id(String commande_id) {
		this.commande_id = commande_id;
	}

	public String getProduit_id() {
		return produit_id;
	}

	public void setProduit_id(String produit_id) {
		this.produit_id = produit_id;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public detail_commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	


}
