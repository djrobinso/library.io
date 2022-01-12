package com.example.demo.Repository;

import org.springframework.stereotype.Repository;
import com.example.demo.Entities.Book;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;


@Repository
public class BookRepository implements CrudRepository <Book, Long>{

	public <S extends Book> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Book> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<Book> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterable<Book> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<Book> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Book entity) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll(Iterable<? extends Book> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
