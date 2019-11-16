package com.app.repositroy;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.app.entities.produit;

@RepositoryRestResource
public interface ProduitRepository extends MongoRepository<produit, String> {


}
