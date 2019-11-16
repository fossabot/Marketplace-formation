package com.app.repositroy;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.entities.detail_commande;

public interface Detail_CRepository extends MongoRepository<detail_commande, String > {

}
