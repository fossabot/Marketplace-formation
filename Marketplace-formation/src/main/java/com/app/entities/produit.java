package com.app.entities;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data @NoArgsConstructor @AllArgsConstructor 
public class produit implements Serializable {
     @Id
	private String id;
     
	private String designation;
	private double prix;
	private int qte;
	public produit(String designation, double prix, int qte) {
		super();
		this.designation = designation;
		this.prix = prix;
		this.qte = qte;
	}

	
	}
	
	
	
	
	

