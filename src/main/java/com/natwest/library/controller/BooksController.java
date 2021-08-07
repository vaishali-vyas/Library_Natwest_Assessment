package com.natwest.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.natwest.library.domain.Books;
import com.natwest.library.service.BooksService;

@RestController
@RequestMapping()
public class BooksController {

	private BooksService service;

	@Autowired
	public BooksController(BooksService service) {
		super();
		this.service = service;
	}

//read
	@GetMapping("/readfromdb")
	public ResponseEntity<List<Books>> getAll() {
		return new ResponseEntity<List<Books>>(this.service.readAll(), HttpStatus.OK);
	}

//read
	@GetMapping("/findbyId/{Id}")
	public ResponseEntity<Books> findbyId(@PathVariable("Id") Long Id) {
		return new ResponseEntity<Books>(this.service.findbyId(Id), HttpStatus.FOUND);
	}

//Create
	@PostMapping("/create")
	public ResponseEntity<Books> create(@RequestBody Books books) {
		return new ResponseEntity<Books>(this.service.create(books), HttpStatus.CREATED);
	}

//Delete
	@DeleteMapping("/delete/{Id}")
	public ResponseEntity<Boolean> update(@PathVariable Long Id) {

		return new ResponseEntity<Boolean>(this.service.delete(Id), HttpStatus.NO_CONTENT);
	}

//update
	@PutMapping("/update/{Id}")
	public ResponseEntity<Books> update(@PathVariable("Id") Long Id, @RequestBody Books books) {
		return new ResponseEntity<Books>(this.service.update(Id, books), HttpStatus.ACCEPTED);
	}

	@GetMapping("/readcategory/{category}/{author}")
	public ResponseEntity<List<Books>> readByCategoryAndAuthor(@PathVariable String category, @PathVariable String author) {
		return new ResponseEntity<List<Books>>(this.service.readByCategoryAndAuthor(category, author), HttpStatus.OK);
	}

}
