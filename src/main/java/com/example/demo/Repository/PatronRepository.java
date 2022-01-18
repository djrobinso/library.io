package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Entities.Patrons;

@Repository
public interface PatronRepository extends CrudRepository <Patrons, Long> {


	

}
