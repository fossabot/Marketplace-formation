package com.app.Metier;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.app.entities.produit;

public interface I_Produit {
	
	public produit AjouterP(produit p);
	public produit ModifierP (produit P);
	public produit supprimerP (String ID);
	public List<produit> RechercheP (String motC);
	public Page<produit> RechercheP (String motC, Pageable P);
	public produit Affiche1P(String ID);
	public List<produit> afficherP ();

}
