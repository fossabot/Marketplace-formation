package com.app.repositroy;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.entities.Commande;

public interface CommandeRepository extends MongoRepository<Commande, String>{

}
