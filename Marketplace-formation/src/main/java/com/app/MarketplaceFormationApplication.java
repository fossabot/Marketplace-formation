package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.entities.produit;
import com.app.repositroy.ProduitRepository;

@SpringBootApplication
public class MarketplaceFormationApplication implements CommandLineRunner{
	
	@Autowired
	private ProduitRepository I_produits;

	public static void main(String[] args) {
		SpringApplication.run(MarketplaceFormationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		/*I_produits.save(new produit("ordinateurs lx 45",6700,3));
		I_produits.save(new produit("Imprimante HP",1700,5));
		I_produits.save(new produit("SmartPhone Samsung S9",8000,4));
		*/
		
	}

}
