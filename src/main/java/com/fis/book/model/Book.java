package com.fis.book.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Book {
	@Id
	@Column
	private int book_id;
	
	@Column
	private String book_name;
	
	@Column
	private String author;
	
	@Column
	private int available_copies;
	
	@Column
	private int total_copies;
	
	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getAvailable_copies() {
		return available_copies;
	}

	public void setAvailable_copies(int available_copies) {
		this.available_copies = available_copies;
	}

	public int getTotal_copies() {
		return total_copies;
	}

	public void setTotal_copies(int total_copies) {
		this.total_copies = total_copies;
	}

	

}
