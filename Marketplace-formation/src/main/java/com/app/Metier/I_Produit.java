package com.app.Metier;

import java.util.List;

import com.app.entities.produit;

public interface I_Produit {
	
	public produit AjouterP(produit p);
	public produit ModifierP (produit P);
	public produit supprimerP (String ID);
	public List<produit> RechercheP (String motC);
	public produit Affiche1P(String ID);

}
