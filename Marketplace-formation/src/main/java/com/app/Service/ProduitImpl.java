package com.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.app.Metier.I_Produit;
import com.app.entities.produit;
import com.app.repositroy.ProduitRepository;

@Service
public class ProduitImpl implements I_Produit {

	@Autowired
	private ProduitRepository PR;
	
	
	
	@Override
	public produit AjouterP(produit p) {
		return PR.save(p);
	}

	@Override
	public produit ModifierP(produit p) {
		return PR.save(p);
	}

	@Override
	public produit supprimerP(String ID) {
		 produit p=PR.findById(ID).get();
		PR.deleteById(ID);
		 return p;
	}

	@Override
	public List<produit> RechercheP(String motC) {
		
		return PR.findByDesignationContaining(motC);
	}

	@Override
	public produit Affiche1P(String ID) {
		return PR.findById(ID).get();
	}

	@Override
	public Page<produit> RechercheP(String motC, Pageable P) {
		return PR.findByDesignationContaining(motC, P);
	}

	@Override
	public List<produit> afficherP() {
		return PR.findAll();
	}

}
