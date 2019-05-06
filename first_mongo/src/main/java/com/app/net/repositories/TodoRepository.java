package com.app.net.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.app.net.model.Todo;

@Repository
public interface TodoRepository extends MongoRepository<Todo, String>{

}
