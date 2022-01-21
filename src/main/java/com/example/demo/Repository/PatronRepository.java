package com.example.demo.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.PatronTypeTable;
import com.example.demo.Entities.Patrons;

@Repository
public interface PatronRepository extends CrudRepository <Patrons, Long> {

	/****/
	 @Query(value ="Select Patron_Type From Patron_Type_Table", nativeQuery=true)
	 public List<String> GetPatronTypes();
	 
	

}
