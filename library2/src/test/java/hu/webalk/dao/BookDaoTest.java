package hu.webalk.dao;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import hu.webalk.entity.BookEntity;

public class BookDaoTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetMovieByGenre() {
			List<BookEntity> actual = Arrays.asList(new BookEntity());
			List<BookEntity> expected = Arrays.asList(new BookEntity());
	}

}
