package com.app.repositroy;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.app.entities.produit;
import java.lang.String;
import java.util.List;


public interface ProduitRepository extends MongoRepository<produit, String> {

	List<produit> findByDesignationContaining(String designation);
	Page<produit> findByDesignationContaining (String designation, Pageable P);

}
