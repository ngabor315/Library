package hu.webalk.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hu.webalk.entity.BookEntity;

@Repository
public class BookDao {
	
	private SessionFactory sessionFactory;
	
	@Autowired
	public BookDao (SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public List<BookEntity> getBookByGenre() {
		Criteria cr = sessionFactory.getCurrentSession().createCriteria(BookEntity.class);
		
		cr.add(Restrictions.like("genre", "Fantasy"));
		
		return cr.list();
	}
	
	@Transactional
	public List<BookEntity> getBookByAuthor() {
		Criteria cr = sessionFactory.getCurrentSession().createCriteria(BookEntity.class);
		
		cr.add(Restrictions.like("author", "Author1"));
		
		return cr.list();
	}
	
	@Transactional
	public List<BookEntity> getBookByAuthor2() {
		Criteria cr = sessionFactory.getCurrentSession().createCriteria(BookEntity.class);
		
		cr.add(Restrictions.like("author", "Author2"));
		
		return cr.list();
	}
	
//
	@Transactional
	public List<BookEntity> getBookByRomantic() {
		Criteria cr = sessionFactory.getCurrentSession().createCriteria(BookEntity.class);
		
		cr.add(Restrictions.like("genre", "Romantic"));
		
		return cr.list();
	}
//	
	@Transactional
	public List<BookEntity> getBookByCrime() {
		Criteria cr = sessionFactory.getCurrentSession().createCriteria(BookEntity.class);
		
		cr.add(Restrictions.like("genre", "Crime"));
		
		return cr.list();
	}

}
