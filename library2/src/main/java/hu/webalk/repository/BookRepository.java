package hu.webalk.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hu.webalk.entity.BookEntity;

@Repository
public interface BookRepository extends CrudRepository<BookEntity, Long>{
	
	List<BookEntity> findByGenre(String genre);
	List<BookEntity> findByAuthor(String author);
}
