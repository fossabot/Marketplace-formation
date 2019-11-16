package com.app.repositroy;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.entities.user;

public interface UsersRepository extends MongoRepository<user, String>{

}
