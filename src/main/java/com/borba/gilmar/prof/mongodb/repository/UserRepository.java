package com.borba.gilmar.prof.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.borba.gilmar.prof.mongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
