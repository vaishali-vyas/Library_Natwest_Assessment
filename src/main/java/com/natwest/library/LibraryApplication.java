package com.natwest.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.natwest.library.repo.BooksRepo;


@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(LibraryApplication.class, args);
		BooksRepo repo = ac.getBean(BooksRepo.class);
		System.out.println(repo.findAllJPQL());
		System.out.println(repo.findBooksByCategoryAndAuthor("Fiction", "Agatha Christie"));
		System.out.println(repo.findBooksByReturnpolicyGreaterThan("10 Days"));
	
	}
	

}
