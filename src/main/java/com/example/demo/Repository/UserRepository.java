package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Users;

@Repository
public interface UserRepository extends CrudRepository <Users, Long>{


}
