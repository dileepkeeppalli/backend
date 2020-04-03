package com.example.demo.repository;

import com.example.demo.data.modal.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<User, String> {

}
