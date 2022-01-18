package com.example.demo.Repository;

import org.springframework.stereotype.Repository;
import com.example.demo.Entities.Book;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface BookRepository extends CrudRepository <Book, Long>{

	

}
