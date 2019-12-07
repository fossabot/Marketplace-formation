package com.app.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Metier.I_Produit;
import com.app.entities.produit;

@RestController
@RequestMapping("/produit")
public class ProduitController {
	
	@Autowired
	private I_Produit IP;
	
	@GetMapping("/all")
	public List<produit> Afficherp ()
	{
		return IP.afficherP();
		
	}
	
	@PostMapping("/add")
	public produit ajouterP (@RequestBody produit p)
	
	{   return IP.AjouterP(p);
			
	}
	
	@PutMapping("/edit")
	public produit editP (@RequestBody produit p)
	
	{   return IP.ModifierP(p);
			
	}
	

	@DeleteMapping("/delete/{id}")
	public produit supprimer ( @PathVariable("id") String ID)
	
	{   return IP.supprimerP(ID);
			
	}
	
	@GetMapping("/recherche/{mc}")
	public List<produit>RechercheMC (@PathVariable("mc") String mc)
	
	{
		return IP.RechercheP(mc);
		
	}
	
	public Page<produit>RecherchePage (@PathParam("mc") String mc, @PathParam("page") int page, int nb)
	{
		return IP.RechercheP(mc, PageRequest.of(page, nb));
	}

}
