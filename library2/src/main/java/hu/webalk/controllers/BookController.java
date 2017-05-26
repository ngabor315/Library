package hu.webalk.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.webalk.entity.BookEntity;
import hu.webalk.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	private BookService bookService;

	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping(path="", produces=MediaType.APPLICATION_JSON_VALUE)
	Iterable<BookEntity> list() {
		return bookService.listAllBook();
	}
	
	@PostMapping(path = "", consumes=MediaType.APPLICATION_JSON_VALUE)
	void createNew(@RequestBody BookEntity newBook) {
		bookService.newBook(newBook);
	}
	
	@DeleteMapping(path="/{id}")
	void deleteExisting(@PathVariable("id")long id) {
		bookService.deleteBook(id);		
	}
	
	
	@GetMapping(path = "/findByGenre", produces=MediaType.APPLICATION_JSON_VALUE)
	List<BookEntity> findByGenre() {
		return bookService.findByGenre();
		//http://localhost:8282/book/findByGenre
	}
	
	@GetMapping(path = "/findByAuthor", produces=MediaType.APPLICATION_JSON_VALUE)
	List<BookEntity> findByAuthor() {
		return bookService.findByAuthor();
	//localhost:8282/book/findByAuthor
	}
	
	@GetMapping(path = "/findByAuthor2", produces=MediaType.APPLICATION_JSON_VALUE)
	List<BookEntity> findByAuthor2() {
		return bookService.findByAuthor2();
	//localhost:8282/book/findByAuthor2
	}
	

	
	@GetMapping(path = "/findByRomantic", produces=MediaType.APPLICATION_JSON_VALUE)
	List<BookEntity> findByRomantic() {
		return bookService.findByRomantic();
		//http://localhost:8282/book/findByRomantic
	}
	
	@GetMapping(path = "/findByCrime", produces=MediaType.APPLICATION_JSON_VALUE)
	List<BookEntity> findByCrime() {
		return bookService.findByCrime();
		//http://localhost:8282/book/findByCrime
	}
	
	
	
	

}
