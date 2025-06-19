package com.microservico.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservico.springboot.model.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {

}
