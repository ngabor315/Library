package hu.webalk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.webalk.dao.BookDao;
import hu.webalk.entity.BookEntity;
import hu.webalk.repository.BookRepository;
import hu.webalk.service.BookService;

@Service
public class BookServiceImp implements BookService{
	
	BookRepository bookRepository;
	BookDao bookDao;
	

	
	@Autowired
	public BookServiceImp(BookRepository bookRepository, BookDao bookDao) {
		super();
		this.bookRepository = bookRepository;
		this.bookDao = bookDao;
	}

	@Override
	public Iterable<BookEntity> listAllBook() {
		return bookRepository.findAll();
	}

	@Override
	public void newBook(BookEntity newBook) {
		bookRepository.save(newBook);
	}

	@Override
	public void deleteBook(long id) {
		bookRepository.delete(id);
	}

	@Override
	public List<BookEntity> findByGenre() {
		return bookDao.getBookByGenre();
	}

	@Override
	public List<BookEntity> findByAuthor() {
		return bookDao.getBookByAuthor();
	}
	
	@Override
	public List<BookEntity> findByAuthor2() {
		return bookDao.getBookByAuthor2();
	}

	@Override
	public List<BookEntity> findByRomantic() {
		return bookDao.getBookByRomantic();
	}
//
	@Override
	public List<BookEntity> findByCrime() {
		// TODO Auto-generated method stub
		return bookDao.getBookByCrime();
	}

	
}
