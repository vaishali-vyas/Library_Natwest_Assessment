package com.natwest.library.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.natwest.library.domain.Books;
import com.natwest.library.repo.BooksRepo;


@Service
public class BooksService {

	public BooksRepo repo;
	
	public BooksService(BooksRepo repo) {
		super();
		this.repo = repo;
	}

//Read
	public List<Books> readAll() {
		return this.repo.findAll();
	}
	
//find by Id
	public Books findbyId(Long Id) {
		return this.repo.findById(Id).orElseThrow();
	}
	
//Create
	public Books create(Books books) {
	return this.repo.saveAndFlush(books);
	}

//Delete
	public Boolean delete(Long Id) {
		this.repo.deleteById(Id);
		return this.repo.existsById(Id);
	}

//Update
	public Books update(Long Id, Books books) {
		Books exists= this.repo.getById(Id);
		exists.setCategory(books.getCategory());
		exists.setAuthor(books.getAuthor());
		exists.setRetrunpolicy(books.getRetrunpolicy());
		Books updated = this.repo.save(exists);
		return updated;	
	
	}
	
	public List<Books> readByCategoryAndAuthor(String category, String author) {
		return this.repo.findBooksByCategoryAndAuthor(category, author);
	}
	
}
