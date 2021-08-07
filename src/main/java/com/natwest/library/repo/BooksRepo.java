package com.natwest.library.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.natwest.library.domain.Books;

@Repository
public interface BooksRepo extends JpaRepository<Books, Long> {

	
	@Query("SELECT b from Books b")
	List<Books> findAllJPQL();
	
	List<Books> findBooksByCategoryAndAuthor(String category, String Author);
	
	@Query(value = "SELECT * from Books", nativeQuery = true)
	List<Books> findAllSQL();

	List<Books> findBooksByReturnpolicyGreaterThan(String retrunpolicy);
	
}
