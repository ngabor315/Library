package hu.webalk.service;

import java.util.List;

import hu.webalk.entity.BookEntity;

public interface BookService {
	Iterable<BookEntity> listAllBook();
	void newBook(BookEntity newBook);
	void deleteBook (long id);
	List<BookEntity> findByGenre();
	List<BookEntity> findByAuthor();
	List<BookEntity> findByAuthor2();
	List<BookEntity> findByRomantic();
	List<BookEntity> findByCrime();
	

}
