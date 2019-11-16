package com.app.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Commande implements Serializable{
	
	@Id
	private String id_commande;
	private Date Date_commande;
	private List<produit> produits;
	@NotNull
	private String user;
	@NotNull
	private String etat;
	private double Total;
	public String getId_commande() {
		return id_commande;
	}
	public void setId_commande(String id_commande) {
		this.id_commande = id_commande;
	}
	public Date getDate_commande() {
		return Date_commande;
	}
	public void setDate_commande(Date date_commande) {
		Date_commande = date_commande;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		Total = total;
	}
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	

}
