package com.natwest.library.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long Id;

	private String category;
	private String author;
	private String retrunpolicy;
	
	//default constructor
	
	public Books() {
		super();
	}
	
	//all args constructor
	public Books(long id, String category, String author, String retrunpolicy) {
		super();
		Id = id;
		this.category = category;
		this.author = author;
		this.retrunpolicy = retrunpolicy;
	}

// all args except id constructor	
	public Books(String category, String author, String retrunpolicy) {
		super();
		this.category = category;
		this.author = author;
		this.retrunpolicy = retrunpolicy;
	}

	
	// getters and setters
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getRetrunpolicy() {
		return retrunpolicy;
	}

	public void setRetrunpolicy(String retrunpolicy) {
		this.retrunpolicy = retrunpolicy;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, author, category, retrunpolicy);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		return Id == other.Id && Objects.equals(author, other.author) && Objects.equals(category, other.category)
				&& Objects.equals(retrunpolicy, other.retrunpolicy);
	}

	//generate to string
	
	@Override
	public String toString() {
		return "Books [Id=" + Id + ", category=" + category + ", author=" + author + ", retrunpolicy=" + retrunpolicy
				+ "]";
	}
	
}
