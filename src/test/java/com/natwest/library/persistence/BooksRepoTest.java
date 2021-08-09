package com.natwest.library.persistence;

//import static org.assertj.core.api.Assertions.assertThat;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//
//import com.natwest.library.domain.Books;
//import com.natwest.library.repo.BooksRepo;

//@DataJpaTest

//public class BooksRepoTest {

//@Autowired
//private BooksRepo repo;
//
//private final Books TEST_BOOKS_1 = new Books(1L, "Fiction", "Agatha Christie", "14 Days");
//private final Books TEST_BOOKS_2 = new Books(2L, "Fiction", "Mulk Raj Anand", "14 Days");
//private final Books TEST_BOOKS_3 = new Books(3L, "Autobiography", "MK Gandhi", "10 Days");
//private final Books TEST_BOOKS_4 = new Books(4L, "Science", "Brian Clegg", "10 Days");
//
//private List<Books> results;
//
//@BeforeEach
//public void init() {
//	this.results = new ArrayList<>();
//}
//
//@Test
//public void testFindBooksByReturnpolicyGreaterThan() throws Exception {
//	this.results.add(TEST_BOOKS_1);
//
//	assertThat(this.repo.findBooksByReturnpolicyGreaterThan(TEST_BOOKS_1.getAuthor())).isEqualTo(results);
//}
//
//@Test
//public void testFindBooksByCategoryAndAuthor() throws Exception {
//	this.results.add(TEST_BOOKS_2);
//
//	assertThat(this.repo.findBooksByCategoryAndAuthor(TEST_BOOKS_2.getAuthor())).isEqualTo(results);
//}
//
//
//@Test
//public void testFindAllJPQL() {
//	this.results.add(TEST_BOOKS_1);
//	this.results.add(TEST_BOOKS_2);
//	this.results.add(TEST_BOOKS_3);
//	this.results.add(TEST_BOOKS_4);
//
//	assertThat(this.repo.findAllJPQL()).isEqualTo(results);
//}
//
//@Test
//public void testFindBooksByReturnpolicyGreaterThan() {
//	this.results.add(TEST_BOOKS_1);
//	this.results.add(TEST_BOOKS_3);
//
//	assertThat(this.repo.findBooksByReturnpolicyGreaterThan("10 Days")).isEqualTo(this.results);
//}
//
//
//}
