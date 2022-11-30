package com.fis.book.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.book.model.Book;
import com.fis.book.repository.BookRepository;



@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepository;
	
	public List<Book> getBooks()
	{
	
	 List<Book> books=new ArrayList<Book>();
	bookRepository.findAll().forEach(book -> books.add(book));
	return books;
	
	}
	
	public Book getBook(int bookId) {
		
		Book book=bookRepository.findById(bookId).get();
		return book;
	}
	
	

}
