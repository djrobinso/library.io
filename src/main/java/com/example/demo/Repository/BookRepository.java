package com.example.demo.Repository;

import org.springframework.stereotype.Repository;
import com.example.demo.Entities.Book;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface BookRepository extends CrudRepository <Book, Long>{
	
	@Query(value ="Select * from Book", nativeQuery=true)
	public List<Book> getAllBooks ();

}
