package com.example.demo.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Users;

@Repository
public interface UserRepository extends CrudRepository <Users, Long>{
	
	@Query(value="Select User_Role_Authentication from User_Role", nativeQuery=true)
	List<String> getUserRoles();


}
